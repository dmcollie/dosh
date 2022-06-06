(ns dev
  (:require [lazd.dosh.domain.model.interface :as model]))

(prn (model/validate-account {:name "D M COLLIE"}))
