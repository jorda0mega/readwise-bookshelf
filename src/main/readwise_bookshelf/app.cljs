(ns readwise-bookshelf.app
  (:require [reagent.dom :as dom]
            [re-frame.core :as rf]
            [readwise-bookshelf.db :as db]
            [readwise-bookshelf.pages.APITokenPage :refer [APITokenPage]]
            [readwise-bookshelf.pages.BookshelfPage :refer [BookshelfPage]]
            [readwise-bookshelf.pages.HighlightPage :refer [HighlightPage]]))

(rf/reg-event-db
  :initialize
  (fn [_]
    db/initial-state))

(defn app
  []
  ;[:div.flex.h-screen.items-center.justify-center.bg-yellow-50
  ; [APITokenPage]])
  [BookshelfPage])
  ;[HighlightPage])

(defn render
  []
  (dom/render [(var app)]
              (.getElementById js/document "app")))

;; start is called by init and after code reloading finishes
(defn ^:dev/after-load clear-cache-and-render! []
  (rf/clear-subscription-cache!)
  (render))

(defn init []
  ;; init is called ONCE when the page loads
  ;; this is called in the index.html and must be exported
  ;; so it is available even in :advanced release builds
  (js/console.log "init")
  (rf/dispatch-sync [:initialize])
  (render))

;; this is called before any code is reloaded
(defn ^:dev/before-load stop []
  (js/console.log "stop"))
