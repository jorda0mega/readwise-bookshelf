(ns readwise-bookshelf.components.book-card
  (:require [re-frame.core :as rf]
            [taoensso.timbre :as timbre]))

;(defn BookCard
;  [book-title cover-url]
;  [:li.relative
;   [:div.focus-within:ring-2.focus-within:ring-offset-2.focus-within:ring-indigo-500.group.block.w-full.aspect-w-7.aspect-h-10.rounded-lg.overflow-hidden.border-2
;    [:img.group-hover:opacity-75.object-cover.pointer-events-none {:src cover-url :alt book-title}]
;    [:button.absolute.inset-0 {:type "button"}
;     [:span.sr-only (str "View highlights for " book-title)]]]])
;[:div.bg-white.overflow-hidden.shadow.rounded-lg
; [:div.px-4.py-5.sm:p-6
;  [:img {:src cover-url}]]])


;;--------------------------------------------------------------------------------
;; EVENTS
;;--------------------------------------------------------------------------------
;(rf/reg-event-db
;  ::show-highlight-modal
;  (fn [db _]
;    ;(js/console.log "changing modal state")
;    (timbre/info db)
;    (assoc db :show-highlight-modal? true)))

(defn BookCard
  ;[{:keys {id book-title book-author cover_image_url :as cover-url]}]
  [{id :id, book-title :book-title book-author :book-author, cover-url :cover_image_url}]
  [:li {:key id :class "mt-36"}
   [:figure {:class "book clear-both mt-20 mr-auto mb-5 w-full text-center"}
    [:ul {:class "hardcover_front"}
     [:li
      [:img {:class "h-full w-full" :src cover-url :alt book-title}]]
     [:li]]
    [:ul {:class "page"}
     [:li]
     [:li {:on-click #(rf/dispatch [:show-highlight-modal true])}
      [:a {:class "btn" :href "#"} "Highlights"]]
     [:li]
     [:li]
     [:li]]
    [:ul {:class "hardcover_back"}
     [:li]
     [:li]]
    [:ul {:class "book_spine"}
     [:li]
     [:li]]]])
;[:figcaption
; [:h1 book-title]
; [:span book-author]]]])

