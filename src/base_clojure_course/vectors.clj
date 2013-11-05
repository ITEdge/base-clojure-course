(ns base-clojure-course.vectors
  (:require [clojure.repl :refer [doc source]]))

(comment 
  "Vectors are great for holding ordered data, when we need to mantain the order of elements
   and when we need to have random access to our data. 
   
   What it means to have 'random access' ?
   
   -> It means that we can grab an element at random index an it's always very fast, 
      constant time operation")

(def scores [10 10 15])

(get scores 2) ; returns 15
