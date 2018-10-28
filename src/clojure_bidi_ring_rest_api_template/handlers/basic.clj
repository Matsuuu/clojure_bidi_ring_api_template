(ns clojure-bidi-ring-rest-api-template.handlers.basic
  (:use [clojure-bidi-ring-rest-api-template.handlers.core]))

(defn handle-api-post [req]
  (json-res {:name "Test"}))