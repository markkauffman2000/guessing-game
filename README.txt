mkdir guessing-game
cd guessing-game
echo "{}" > deps.edn
mkdir -p src/app

[mbk@fedora-s-1vcpu-1gb-sfo2 guessing-game]$ cat src/app/core.clj 
                                                                     │(ns app.core)
                                                                      (str "processing node with input: " input))
                                                                      (defn -main [& args]
  (println (process-node (first args))))

(app.core/-main "live_signal")

[mbk@fedora-s-1vcpu-1gb-sfo2 guessing-game]$
