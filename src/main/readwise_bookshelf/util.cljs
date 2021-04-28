(ns readwise-bookshelf.util
  (:require [shadow.resource :as rc]
            [taoensso.timbre :as timbre]))

(def mock-data (-> (rc/inline "mock-data.json")
                   js/JSON.parse
                   (js->clj :keywordize-keys true)
                   :results))
(def mock-highlights-data (-> (rc/inline "mock-highlights-data.json")
                              js/JSON.parse
                              (js->clj :keywordize-keys true)
                              :results))