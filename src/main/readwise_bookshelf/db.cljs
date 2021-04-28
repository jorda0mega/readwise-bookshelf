(ns readwise-bookshelf.db
  (:require [reagent.core :as r]))

(defonce initial-state {:auth?                 true
                        :display-highlight-modal? false})