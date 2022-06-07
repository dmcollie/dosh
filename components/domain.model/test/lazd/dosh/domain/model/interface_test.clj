(ns lazd.dosh.domain.model.interface-test
  (:require [clojure.test :refer [deftest is]]
            [lazd.dosh.domain.model.interface :as model]))

(deftest valid-account-test
  (is (model/validate-account "assets:cash")))

(deftest invalid-toplevel-account-test
  (is (not (model/validate-account "bingo:cash"))))

(deftest invalid-account-test
  (is (not (model/validate-account "assets cash"))))

(deftest unmarked-status-test
  (is (model/validate-status "")))

(deftest pending-status-test
  (is (model/validate-status "!")))

(deftest cleared-status-test
  (is (model/validate-status "*")))

(deftest invalid-status-test
  (is (not (model/validate-status "x"))))

(deftest valid-code-test
  (is (model/validate-code "(78)")))

(deftest invalid-code-test
  (is (not (model/validate-code "78"))))

(deftest no-code-test
  (is (model/validate-code "")))