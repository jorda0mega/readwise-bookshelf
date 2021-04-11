(ns readwise-bookshelf.util
  (:require [shadow.resource :as rc]
            [taoensso.timbre :as timbre]))

(def mock-data (:results (js->clj (.parse js/JSON (rc/inline "mock-data.json")) :keywordize-keys true)))