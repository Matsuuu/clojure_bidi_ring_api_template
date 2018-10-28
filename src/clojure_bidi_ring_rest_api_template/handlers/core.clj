(ns clojure-bidi-ring-rest-api-template.handlers.core
  (:use [cheshire.core])
  (:require [ring.util.response :as res]))


(defn json-res [data]
  (-> (generate-string data)
      (res/response)))

(defn parse-int [s]
  (Integer. (re-find #"\d+" s)))
