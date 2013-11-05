(ns base-clojure-course.maps
  (:require [clojure.repl :refer [doc source]]))

(comment
  "Maps are probably the most widely used collection to hold structured data, something
   which is called 'Domain objects' in OO (Object Oriented) languages. 
   
   Maps are essentialy dictonaries with pairs of key-value entries, they provide fast 
   retrieval of their values via supplied keys.")

(def user {:name "John" :age 25 :favourite-colors #{:red :blue}})

(get user :name) ; returns "John"
(get user :favourite-colors) ; returns #{:red :blue}
