(ns lazd.dosh.domain.model.journal-file-schema
  "Define the schema for the journal file."
  (:require [malli.core :as m]))

; Definition is here https://www.ledger-cli.org/3.0/doc/ledger3.html#Journal-File-Format-for-Developers

; Must start with: assets, liabilities, revenue, expenses, or equity.
(def Account (m/schema [:re "^(assets|liabilities|revenue|expenses|equity)+(:[0-9a-zA-Z]+)*$"]))
(def Status (m/schema [:enum "" "!" "*"]))
(def Code (m/schema [:or [:re "\\(.*?\\)"] empty?]))


(defn validate-account
  "Validate the account against its schema"
  [account]
  (m/validate Account account))

(defn validate-status
  "Validate the status against its schema"
  [status]
  (m/validate Status status))

(defn validate-code
  "Validate the code against its schema"
  [code]
  (m/validate Code code))