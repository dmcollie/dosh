(ns lazd.dosh.domain.model.interface
  (:require [lazd.dosh.domain.model.schema :as s]))

(defn validate-account
  "Checks if the address is valid"
  [account]
  (s/validate-account account))
