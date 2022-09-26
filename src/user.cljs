(ns user
  (:require [utils :as utils]))

(println "loading user.cljs")

(defn foo []
  (println "foo")
  (utils/bar))
