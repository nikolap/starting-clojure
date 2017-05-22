(ns starting-clojure.handler
  (:require [compojure.core :refer [routes wrap-routes]]
            [starting-clojure.layout :refer [error-page]]
            [starting-clojure.middleware :as middleware]
            [starting-clojure.routes.home :refer [home-routes]]
            [compojure.route :as route]
            [starting-clojure.env :refer [defaults]]
            [mount.core :as mount]))

(mount/defstate init-app
                :start ((or (:init defaults) identity))
                :stop  ((or (:stop defaults) identity)))

(def app-routes
  (routes
    #'home-routes
    (route/not-found
      (:body
        (error-page {:status 404
                     :title "Page not found"})))))


(defn app [] (middleware/wrap-base #'app-routes))
