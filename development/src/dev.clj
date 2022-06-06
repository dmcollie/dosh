(ns dev
  (:require [lazd.dosh.domain.model.interface :as model]))

(def fred-account {:name           "Fred Dibnah"
                   :sort-code      "12-34-56"
                   :account-number "12345678"})

(model/validate-account fred-account)
