(ns readwise-bookshelf.pages.api-token-page
  (:require
    [readwise-bookshelf.components.api-token-input :refer [APITokenInput]]))

(defn APITokenPage
  "Page where the user inputs API token to retrieve all of Readwise books"
  []
  [:div
   [APITokenInput]])

