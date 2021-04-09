(ns readwise-bookshelf.pages.APITokenPage
  (:require
    [readwise-bookshelf.components.APITokenInput :refer [APITokenInput]]))

(defn APITokenPage
  "Page where the user inputs API token to retrieve all of Readwise books"
  []
  [:div
   [APITokenInput]])

