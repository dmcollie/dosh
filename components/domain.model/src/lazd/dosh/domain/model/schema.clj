(ns lazd.dosh.domain.model.schema
  (:require [malli.core :as m]))

(def sort-code (m/schema [:re "^[0-9]{2}[-][0-9]{2}[-][0-9]{2}$"]))
(def account-number (m/schema [:re "^(\\d){7,8}$"]))
(def non-empty-string
  (m/schema [:string {:min 1}]))

(def Account
  [:map
   [:name non-empty-string]
   [:sort-code sort-code]
   [:account-number account-number]]
  )

(defn validate-account
  "Validate the account against its schema"
  [account]
  (m/validate Account account))