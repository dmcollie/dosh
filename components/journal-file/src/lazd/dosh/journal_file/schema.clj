(ns lazd.dosh.journal-file.schema  "Define the schema for the journal file."
  (:require [malli.core :as m]))

; Definition is here https://www.ledger-cli.org/3.0/doc/ledger3.html#Journal-File-Format-for-Developers

; Must start with: assets, liabilities, revenue, expenses, or equity.
(def Account (m/schema [:re "^(assets|liabilities|revenue|expenses|equity)+(:[0-9a-zA-Z]+)*$"]))
(def Status (m/schema [:enum "" "!" "*"]))
(def Code (m/schema [:or [:re "\\(.*?\\)"] empty?]))
;See https://stackoverflow.com/a/40309602 for regex logic
(def SimpleDate
  "Dates in the journal file use simple dates format: YYYY-MM-DD or YYYY/MM/DD or YYYY.MM.DD, with leading zeros optional."
  [:re "^(\\d{4}|\\d{2})[^\\w\\d\\r\\n:](0?[1-9]|1[0-2])[^\\w\\d\\r\\n:](0?[1-9]|[12]\\d|30|31)$"])

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

(defn validate-date
  "Validate the date against its schema"
  [date]
  (m/validate SimpleDate date))