(ns rest.service
  (:require [address.service :as address]
            [email.service :as email]
            [user.service :as user]
            [injection.core :refer [inject]]))

;; Inject (replace) the real send-pdf-email! from the email service.
(inject user.service/send-pdf-email! email/send-pdf-email!)

(defn find-addresses []
  (let [addresses (address/find-addresses {})]))
    ;; do something intelligent with the result!

;; Another way of injecting our functions is to pass them in as arguments to our functions.
(defn do-user-stuff! []
  (user/do-something! email/send-mail!))

(defn do-more-user-stuff! []
  (user/do-another-thing!))
