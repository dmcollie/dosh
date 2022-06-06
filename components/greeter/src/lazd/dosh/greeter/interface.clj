(ns lazd.dosh.greeter.interface
  (:require [lazd.dosh.greeter.core :as greeter]))

(defn greeting
  "Return a suitable greeting for the person."
  [{:keys [person] :as data}]
  (greeter/greeting data))
