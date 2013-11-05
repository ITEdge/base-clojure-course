(ns base-clojure-course.sets
  (:require [clojure.repl :refer [doc source]]))

(comment
  "Set is the right collection when we need to group distinct elements, that means, that
   no two elements in the set could be the same (equal). 
   
   Plain set does not maintain any ordering of its elements, but one can check very fast 
   if some element is contained within the set.")

(def colors #{:red :green :blue})

(contains? colors :red) ; returns true
(contains? colors :black) ; returns false
