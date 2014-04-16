(ns base-clojure-course.functions
  (:require [clojure.repl :refer [doc source]]))

(comment
  "Functions are the basic building blocks for functional programming languages. They
   provide a way to encapsulate behavior into reusable blocks of code. 
   
   Functions are the so called 'first-class' citizens of the functional programming 
   languages, which means that they can be appear in any position a datatype such as String 
   or Number can appear:
  
   -> functions can be aliased with symbols passed as function arguments to another function
      or returned from any expression (such as function returning another function)")

(fn [x]
  (* x x))

(def square (fn [x]
              (* x x)))

(defn square [x]
  (* x x))

(defn power-by [factor]
  (fn [x]
    (apply * (repeat factor x))))

(def power-by-three (power-by 3))

(power-by-three 5) ; returns 125

(def numbers '(1 2 3 4 5 6 7))

(map square numbers) ; returns '(1 4 9 16 25 36 49)

(filter (fn [n] (> n 3)) numbers) ; returns '(4 5 6 7)

(reduce (fn [acc n] 
          (* acc n)) 1 '(1 2 3 4 5 6 7))             ; returns 5040

(reduce * numbers) ; returns 5040

(reduce max numbers) ; returns 7

