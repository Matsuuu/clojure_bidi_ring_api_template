(ns clojure-bidi-ring-rest-api-template.core
  (:gen-class)
  (use [ring.adapter.jetty]
       [clojure-bidi-ring-rest-api-template.routing.core])
  (:require [bidi.ring :refer (make-handler)]
            [ring.util.response :as res]
            [ring.middleware.session :refer [wrap-session]]))

(def app-handler
  (make-handler app-routes))

(def app
  (-> app-handler
      (wrap-session)))

(defn -main [& args]
  (run-jetty app {:port 3000}))
