(defproject address "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :profiles {:dev {:dependencies [[test-data-generator "0.1.0-SNAPSHOT"]]
                   :test-paths ["test"]}})
