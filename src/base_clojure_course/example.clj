(ns base-clojure-course.example
  (:require [clojure.repl :refer [doc source]]))

(comment
  "This is a simple demonstration of small useful program build using functional programming
   approach. It generates nicely formatted report of word frequences within some text.")

(defn split-text
  "Split text string into sequence of words"
  [text]
  (re-seq #"\w+" text))

(defn update-frequences
  "Update frequences map"
  [frequences word]
  (update-in frequences [word] (fnil inc 0)))

(defn sort-frequences
  "Sort word-frequence pairs according to frequence value"
  [frequences]
  (sort-by second > frequences))

(defn most-frequent-words
  "Returns a function returning n most frequent words for any given string"
  [n]
  (fn [string]
    (take n (sort-frequences (reduce update-frequences {} (split-text string))))))

(defn format-word-frequence-output
  "Formats word-frequence output into nice string for printing"
  [frequences]
  (apply str
         (map (fn [v rank]
                (str "The " rank ". most frequent word is '"
                     (first v) "', with frequency: " (second v) "\n"))
              frequences
              (iterate inc 1))))

(def sample-sentence
  "When a fox is in the bottle where the tweetle beetles battle with their paddles in a
   puddle on a noodle-eating poodle, THIS is what they call a tweetle beetle noodle poodle
   bottled paddled muddled duddled fuddled wuddled fox in socks, sir!")

(def frequency-report (format-word-frequence-output
                       ((most-frequent-words 3) sample-sentence)))
