(ns lazd.dosh.domain.model.interface
  (:require [lazd.dosh.domain.model.journal-schema :as js]))

(defn validate-account
  "Checks if the account is valid"
  [account]
  (js/validate-account account))

(defn validate-status
  "Checks if the status is valid"
  [status]
  (js/validate-status status))