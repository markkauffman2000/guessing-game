(ns app.core)

(defn process-node [input]
  (str "processing node with input: " input))

(defn generate-num []
 (inc (rand-int 99)))


(defn -main [& args]
  (case (count args)
    0 ( println (generate-num))
    1 ( println (process-node (first args)) )
    (println "wrong number of args")
   )
 )

(comment
  (app.core/-main "live_signal")

  (app.core/-main)

  )
