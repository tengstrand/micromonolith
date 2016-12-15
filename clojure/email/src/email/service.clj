(ns email.service)

(defn send-mail! [message]
  (println "Email sent:" message))

(defn send-pdf-email! [message]
  (println "Pdf email sent:" message))
