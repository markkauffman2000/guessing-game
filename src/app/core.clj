(ns app.core)

(defn process-node [input]
  (str "processing node with input: " input))

(defn generate-num []
 (inc (rand-int 99)))

(defn play-game []
  (let [the-num (generate-num)]
    (println "the-num:" the-num)
    )
    "That's all folks!"
  )

(defn -main [& args]
  (case (count args)
    0 ( println (play-game))
    1 ( println (process-node (first args)) )
    (println "wrong number of args")
   )
 )

(comment
  (app.core/-main "live_signal")

  (app.core/-main)

  )
