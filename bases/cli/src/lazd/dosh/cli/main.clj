(ns lazd.dosh.cli.main
  (:require [lazd.dosh.greeter.interface :as greeter])
  (:gen-class))

(defn -main
  "Say Hello!"
  [& args]
  (println (greeter/greeting {:person (first args)})))
