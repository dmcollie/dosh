(ns lazd.dosh.domain.model.interface
  (:require [lazd.dosh.domain.model.journal-file-schema :as jfs]))

(defn validate-account
  "Checks if the account is valid"
  [account]
  (jfs/validate-account account))

(defn validate-status
  "Checks if the status is valid"
  [status]
  (jfs/validate-status status))

(defn validate-code
  "Checks if the code is valid"
  [code]
  (jfs/validate-code code))