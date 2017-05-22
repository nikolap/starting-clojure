(ns starting-clojure.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [starting-clojure.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[starting-clojure started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[starting-clojure has shut down successfully]=-"))
   :middleware wrap-dev})
