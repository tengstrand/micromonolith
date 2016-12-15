(ns address.service-test
  (:require [clojure.test :refer :all]
            [address.service :refer :all]
            [test-data-generator.core :as t]))

(deftest find-addresses-test
  (let [id (t/new-id-counter)
        address (assoc (t/new-address id) :address/city "Uppsala")
        user (assoc (t/new-user id address) :user/given-name "Donald")
        _ (t/persist address user)

        criteria {:address/city "Uppsala"}
        addresses (find-addresses criteria)]))

    ;; verify the result
