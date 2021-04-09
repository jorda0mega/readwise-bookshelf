(ns readwise-bookshelf.db
  (:require [reagent.core :as r]))

(defonce initial-state (r/atom {:auth? true
                                :user-dropdown? true}))