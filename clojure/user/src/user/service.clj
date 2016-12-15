(ns user.service)

;; Will be injected from the Rest service.
(defn send-pdf-email! [message])

(defn do-something! [send-email!]
  (println "Do important user stuff (in user.service)")
  (send-email! "Important email"))

(defn do-another-thing! []
  (println "Do another user thing (in user.service)")
  (send-pdf-email! "Another mail"))
