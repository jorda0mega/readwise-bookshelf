(ns readwise-bookshelf.components.BookCard)

(defn BookCard
  [book-title cover-url]
  [:li.relative
   [:div.focus-within:ring-2.focus-within:ring-offset-2.focus-within:ring-indigo-500.group.block.w-full.aspect-w-7.aspect-h-10.rounded-lg.overflow-hidden.border-2
    [:img.group-hover:opacity-75.object-cover.pointer-events-none {:src cover-url :alt book-title}]
    [:button.absolute.inset-0 {:type "button"}
     [:span.sr-only (str "View highlights for " book-title)]]]])
  ;[:div.bg-white.overflow-hidden.shadow.rounded-lg
  ; [:div.px-4.py-5.sm:p-6
  ;  [:img {:src cover-url}]]])