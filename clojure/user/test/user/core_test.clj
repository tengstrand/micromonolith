(ns user.core-test
  (:require [clojure.test :refer :all]
            [user.service :as user]
            [test-data-generator.core :as t]))

(deftest do-something-test
  (let [id (t/new-id-counter)
        address (t/new-address id)
        user (assoc (t/new-user id address)
               :user/surname "Donald")
        send-mail! (fn [_])]

    (t/persist address user)
    (user/do-something! send-mail!)))

    ;; the verifications goes here.
