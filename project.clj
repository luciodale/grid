(defproject luciodale/grid "0.0.1"
  :description "Grid for UIs"
  :url "https://github.com/luciodale/grid"
  :license {:name "MIT"}
  :source-paths ["src"]
  :profiles {:uberjar {:aot :all}}
  :deploy-repositories [["releases" :clojars]
                        ["snapshots" :clojars]])
