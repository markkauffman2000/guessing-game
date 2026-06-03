(ns app.core)

(defn process-node [input]
  (str "processing node with input: " input))

(defn generate-num []
 (inc (rand-int 99)))

(defn -main [& args]
  (println (process-node (first args))))

(app.core/-main "live_signal")

(app.core/generate-num)
