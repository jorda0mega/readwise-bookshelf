(ns readwise-bookshelf.pages.BookshelfPage
  (:require [ajax.core :refer [GET]]
            [taoensso.timbre :as timbre]
            [readwise-bookshelf.components.BookCard :refer [BookCard]]
            [readwise-bookshelf.components.BookCardGrid :refer [BookCardGrid]]
            [readwise-bookshelf.util :refer [mock-data]]))

(defn fetch-books-error
  "handles fetch books API call error"
  [{:keys [status status-text]}]
  (timbre/error "bad request to fetch books: " status " " status-text))

(defn fetch-books-success
  "handle fetch-books API call success"
  [response]
  (timbre/info response))

(defn fetch-books
  "makes API call to readwise to fetch all items with category books"
  [success-fn]
  (GET "https://readwise.io/api/v2/books/" {:headers         {:access-control-allow-origin   [#"http://127.0.0.1:8020/"]
                                                              :access-control-allows-methods ["GET" "POST"]
                                                              :access-control-allow-headers  ["Content-Type, Authorization"]
                                                              :authorization                 (str "Token " "cWChZrL4hPjlfJSExJaT97tBEu36UIX5bNZZ0k3iCTWsYAeTRRWlgfb8st7LnSLXBHQkQPBzA29d8ib9xpmQEoFUY3pDwQlDT3H8cVeOYt7npC6KU3yO4K7LD2KNaW2f13pqDCCz3BXVBaTSSuixQHvx2tErYXpMgfB9BwUOHKXfXrelOx7q2Mz5tAeIWJG5xnu3Ulf0")}
                                            :handler         success-fn
                                            :error-handler   fetch-books-error
                                            :response-format :json
                                            :keywords?       true}))

(defn BookshelfPage
  []
  [:div.component
   ;[BookCardGrid
   [:ul.align {:role "list"}
    (doall (map BookCard mock-data))]])