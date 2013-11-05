(ns base-clojure-course.lists
  (:require [clojure.repl :refer [doc source]]))

(comment
  "Lists are the most basic but also the most fundamental data-structure for clojure
   (and for all Lisps in general). 
   
   They retain order of their elements but don't provide random acces to them. Lists are not 
   very often used to hold domain data (because most of the time, we are better served by 
   data-structures with richer semantics such as vectors, sets and maps), but they are 
   nevertheless the most important and fundamental:
   
   -> because lists are used to group expressions, and out programs are composed solely from
      those expressions !

   When a list is not quoted, it's elements are evaulated in a special manner: 
   
   -> the first element is treated as a function and it's called with the rest of the 
      (evaulated) elements as the function arguments.")

(def items '("chocolate" "biscuits" "bread"))

(peek items) ; returns "chocolate"

(def code-clauses '(str "chocolate" "biscuits"))

(peek code-clauses) ; returns str

(eval code-clauses) ; returns "chocolatebiscuits"

(eval (conj items str)) ; "chocolatebiscuitsbread"


