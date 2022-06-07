(ns lazd.dosh.domain.model.interface-test
  (:require [clojure.test :as test :refer :all]
            [lazd.dosh.domain.model.interface :as model]))

(deftest valid-account-test
  (is (model/validate-account "asset:cash")))

(deftest valid-account-test
  (is (not (model/validate-account "asset cash"))))

(deftest unmarked-status-test
  (is (model/validate-status "")))

(deftest pending-status-test
  (is (model/validate-status "!")))

(deftest cleared-status-test
  (is (model/validate-status "*")))

(deftest invalid-status-test
  (is (not (model/validate-status "x"))))