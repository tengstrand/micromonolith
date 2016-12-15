(ns injection.core)

(defmacro inject [to from]
  "Replaces a function with another functions definition.
   to: the function that is going to be replaced (should include the namespace)
   from: the function that is copied

   Author: Joakim Tengstrand"
  (let [to-ns (symbol (namespace to))
        to-ns-symbol (symbol (name to))]
    (list 'intern
          (list 'quote to-ns)
          (list 'quote to-ns-symbol)
          (list 'var from))))
