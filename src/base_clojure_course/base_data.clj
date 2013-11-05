(ns base-clojure-course.base-data
  (:require [clojure.repl :refer [doc source]]))

(comment
  "There are some base data types in clojure:
   
   -> Strings
   -> Numbers
   -> Booleans
   -> Keywords
   -> Symbols
  ")

"Text" ; string, evaulates to "Text"

25 ; number, evaulates to 25

false ; boolean, evaulates to false

:name ; keyword, evaulates to :name

(def user "John") ; bind symbol 'user to string "John"

user ; evaulates symbol to its bound value, which is string "John"

'user ; the quote suspends evaulation of next expression -> in this case symbol user

(eval 'user) ; we can evaulate some quoted expression with eval
