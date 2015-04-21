(ns chinchilla.handler
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [chinchilla.routes.users :refer [user-routes]]
            [chinchilla.routes.users.stocks :refer [stock-routes]]
            [ring.middleware.json :refer [wrap-json-response]]))

(defroutes app-routes
  (GET "/" [] "Hello World")
  (route/not-found "Not Found"))

(def chinchilla-routes 
  (apply routes [stock-routes
                 user-routes
                 app-routes]))

(def app
  (-> chinchilla-routes 
      (handler/api)
      (wrap-json-response)))
