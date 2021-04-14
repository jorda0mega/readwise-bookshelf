(ns readwise-bookshelf.components.BookCard)

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

(defn BookCard
  ;[{:keys {id book-title book-author cover_image_url :as cover-url]}]
  [{id :id, book-title :book-title book-author :book-author, cover-url :cover_image_url}]
  [:li {:key id}
   [:figure.book
    [:ul.hardcover_front
     [:li
      [:img.h-full.w-full {:src cover-url :alt book-title}]]
     [:li]]
    [:ul.page
     [:li]
     [:li
      [:a.btn {:href "#"} "Highlights"]]
     [:li]
     [:li]
     [:li]]
    [:ul.hardcover_back
     [:li]
     [:li]]
    [:ul.book_spine
     [:li]
     [:li]]]])
    ;[:figcaption
    ; [:h1 book-title]
    ; [:span book-author]]]])

