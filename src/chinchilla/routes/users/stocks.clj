(ns chinchilla.routes.users.stocks
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.util.response :refer [response]]))

(def default {:success true})

(defroutes stock-routes
  (context "/api/v1" [] 
    (GET "/stocks" [] (response default))))
