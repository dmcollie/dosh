(ns lazd.dosh.journal-file.interface
  (:require [lazd.dosh.journal-file.schema :as jfs]))

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

(defn validate-date
  "Checks if the date is valid"
  [date]
  (jfs/validate-date date))

(defn validate-description
  "Checks if the description is valid"
  [description]
  (jfs/validate-description description))