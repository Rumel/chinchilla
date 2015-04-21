(ns chinchilla.routes.users
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.util.response :refer [response]]))

(def default {:success true})

(defroutes user-routes
  (GET "/users" [] (response default)))
