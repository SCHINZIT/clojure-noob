(ns clojure-noob.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (if false
    (do (println "some here")
        "Odins hammer")
    (do (println "some else")
        "bambam"))
  (println "SHIT IT!"))

(defn checkItOut
  "just for my test"
  [& rest]
  (if true
    (do (println "true-branch")
        "this is the true branch, and it returns this")
    (do (println "false-branch")
        "this ist the false branch, and it returns that")))
