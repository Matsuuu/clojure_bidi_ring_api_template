(ns clojure-bidi-ring-rest-api-template.routing.core
  (:use clojure-bidi-ring-rest-api-template.handlers.basic))

(def app-routes
  ["/" {
        :get {
              "api" (fn [req] {:status 200 :body "hello"})
              }
        :post {
              "api" handle-api-post
               }
        }
   ])