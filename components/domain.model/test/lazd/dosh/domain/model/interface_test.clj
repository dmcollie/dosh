(ns lazd.dosh.domain.model.interface-test
  (:require [clojure.test :as test :refer :all]
            [lazd.dosh.domain.model.interface :as model]))

(deftest dummy-test
  (is (model/validate-account {:name "Fred Dibnah"
                               :sort-code "12-34-56"
                               :account-number "12345678"})))
