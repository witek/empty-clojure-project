(ns user
  (:require [utils :as utils]))

(println "loading user.clj")

(defn foo []
  (println "foo")
  (utils/bar))
