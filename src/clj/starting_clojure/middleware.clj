(ns starting-clojure.middleware
  (:require [starting-clojure.env :refer [defaults]]
            [clojure.tools.logging :as log]
            [starting-clojure.layout :refer [error-page]]
            [starting-clojure.config :refer [env]]
            [ring.middleware.defaults :refer [site-defaults wrap-defaults]]))

(defn wrap-internal-error [handler]
  (fn [req]
    (try
      (handler req)
      (catch Throwable t
        (log/error t)
        (error-page {:status 500
                     :title "Something very bad has happened!"
                     :message "We've dispatched a team of highly trained gnomes to take care of the problem."})))))

(defn wrap-base [handler]
  (-> ((:middleware defaults) handler)
      (wrap-defaults site-defaults)
      wrap-internal-error))
