(ns server
  (:require [compojure.route :as route]
            [ring.adapter.jetty :refer [run-jetty]])
  (:gen-class))

(def app
  (route/files "/" {:root "./public"}))

(defn -main
  [port]
  (run-jetty app
             {:port (Integer/parseInt port)}))
