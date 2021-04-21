(ns readwise-bookshelf.components.HighlightModal)

(defn HighlightModal
  "component that renders a modal with book highlights"
  []
  [:div.fixed.z-10.inset-0.overflow-y-auto {:aria-labelledby "Highlights" :role "dialog" :aria-modal "true"}
   [:div.flex.items-end.justify-center.min-h-screen.pt-4.px-4.pb-20.text-center.sm:block.sm:p-0
    ;[:div.fixed.inset-0.bg-gray-500.bg-opacity-75.transition-opacity {:aria-hidden "true"}]
    [:div.fixed.inset-0.bg-gray-500.bg-opacity-75.transition-opacity.ease-out.duration-300.opacity-0.opacity-100 {:aria-hidden "true"}]
    [:span.hidden.sm:inline-block.sm:align-middle.sm:h-screen {:aria-hidden "true"} "&#8203;"]
    [:div.inline-block.align-bottom.bg-white.rounded-lg.px-4.pt-5.pb-4.text-left.overflow-hidden.shadow-xl.transform.transition-all.sm:my-8.sm:align-middle.sm:max-w-sm.sm:w-full.sm:p-6
     [:div
      [:div.mx-auto.flex.items-center.justify-center.h-12.w-12.rounded-full.bg-green-100
       [:svg.h-6.w-6.text-green-600 {:xmlns "http://www.w3.org/2000/svg" :fill "none" :viewBox "0 0 24 24" :stroke "currentColor" :aria-hidden "true"}
        [:path {:stroke-linecap "round" :stroke-linejoin "round" :stroke-width "2" :d "M5 13l4 4L19 7"}]]]
      [:div.mt-3.text-center.sm:mt-5
       [:h3#modal-title.text-lg.leading-6.font-medium.text-gray-900 "Payment successful"]
       [:div.mt-2
        [:p.text-sm.text-gray-500 "Lorem ipsum dolor sit amet consectetur adipisicing elit. Consequatur amet labore."]]]]
     [:div.mt-5.sm:mt-6
      [:button.inline-flex.justify-center.w-full.rounded-md.border.border-transparent.shadow-sm.px-4.py-2.bg-indigo-600.text-base.font-medium.text-white.hover:bg-indigo-700.focus:outline-none.focus:ring-2.focus:ring-offset-2.focus:ring-indigo-500.sm:text-sm {:type "button"} "Go back to dashboard"]]]]])

