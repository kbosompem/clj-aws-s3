(defproject org.clojars.kbosompem/clj-aws-s3 "0.5.20200517"
  :description "Clojure Amazon S3 library by Weavejester"
  :url "https://github.com/kbosompem/clj-aws-s3"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                ; [commons-logging/commons-logging "1.2"]
                ; [com.fasterxml.jackson.core/jackson-core "2.11.0"]
                ; [com.fasterxml.jackson.dataformat/jackson-dataformat-cbor "2.11.0"]
                 [com.amazonaws/aws-java-sdk-s3 "1.11.784" :exclusions [com.fasterxml.jackson.core/jackson-core
                                                                        com.fasterxml.jackson.dataformat/jackson-dataformat-cbor
                                                                        commons-logging]]
                 [clj-time "0.15.2"]]
  :uberjar-name "clj-aws-s3.jar"
  :plugins [[codox "0.10.7"]
            [lein-ancient "0.6.15"]])
