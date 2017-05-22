(ns user
  (:require [mount.core :as mount]
            starting-clojure.core))

(defn start []
  (mount/start-without #'starting-clojure.core/repl-server))

(defn stop []
  (mount/stop-except #'starting-clojure.core/repl-server))

(defn restart []
  (stop)
  (start))


