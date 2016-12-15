(ns test-data-generator.core-test
  (:require [clojure.test :refer :all]
            [test-data-generator.core :as t]))

(deftest find-addresses-test
  (let [id (t/new-id-counter)
        address (assoc (t/new-address id)
                  :address/street-name "Storgatan"
                  :address/street-number 15
                  :address/city "Uppsala"
                  :address/zipcode "11122")
        user (assoc (t/new-user id address)
               :user/given-name "Donald"
               :user/surname "Duck")
        sql-statements (t/persist address user)]

    (is (= ["insert into address (id, street_number, street_name, zipcode, city) values (1, 15, 'Storgatan', '11122', 'Uppsala')"
            "insert into user (id, given_name, surname, address_id) values (2, 'Donald', 'Duck', 1)"]
           sql-statements))))
