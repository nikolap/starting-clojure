(ns starting-clojure.routes.home
  (:require [starting-clojure.layout :as layout]
            [compojure.core :refer [defroutes GET]]
            [ring.util.http-response :as response]
            [clojure.java.io :as io]))

(defn home-page []
  (layout/render "home.html"))

(defn guide-page [page-name]
  (layout/render
    "guide.html" {:docs (-> (str "docs/" page-name ".md") io/resource slurp)}))

(defn contribute-page []
  (layout/render "contribute.html"))

(defroutes home-routes
           (GET "/" [] (home-page))
           (GET "/guides/:page-name" [page-name] (guide-page page-name))
           (GET "/contribute" [] (contribute-page)))

