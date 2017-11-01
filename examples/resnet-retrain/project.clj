(defproject resnet-retrain "0.9.23-SNAPSHOT"
  :description "Retrain resnet50 for aerial imagery"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha17"]
                 [thinktopic/experiment "0.9.22"]]
  :uberjar-name "resnet-retrain.jar"
  :jvm-opts ["-Xmx2000m"]
  :main resnet-retrain.core)
