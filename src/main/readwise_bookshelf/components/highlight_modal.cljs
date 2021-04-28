(ns readwise-bookshelf.components.highlight-modal
  (:require
    [re-frame.core :as rf]
    [taoensso.timbre :as timbre]
    [tailwind-hiccup.core :refer [tw]]
    [readwise-bookshelf.util :refer [mock-highlights-data]]))

;;--------------------------------------------------------------------------------
;; EVENTS
;;--------------------------------------------------------------------------------
(rf/reg-event-db
  :show-highlight-modal
  (fn [db [_ display-modal?]]
    (timbre/info display-modal?)
    (assoc db :display-highlight-modal? display-modal?)))

;;--------------------------------------------------------------------------------
;; SUBSCRIPTIONS
;;--------------------------------------------------------------------------------
(rf/reg-sub
  :display-highlight-modal?
  (fn [db _]
    (let [show-modal? (:display-highlight-modal? db)]
      (if show-modal?
        {:display "block"}
        {:display "none"}))))

(defn HighlightModal
  "enders a modal with the clicked book highlights"
  []
  (let [modal [:inline-block :align-bottom :bg-white :rounded-sm :px-4 :pt-5 :pb-4 :text-left :overflow-auto :shadow-xl :h-full :max-h-lg]
        modal-transition [:transform :transition-all :ease-in-out :duration-300 :sm:my-8 :sm:align-middle :sm:max-h-xl :sm:max-w-4xl :sm:w-full :sm:p-6]]
    [:div.fixed.z-10.inset-0.overflow-y-auto {:aria-labelledby "Highlights" :role "dialog" :aria-modal "true" :style @(rf/subscribe [:display-highlight-modal?])}
     [:div.flex.items-end.justify-center.pt-4.px-4.pb-20.text-center.sm:block.sm:p-0
      ;[:div.fixed.inset-0.bg-gray-500.bg-opacity-75.transition-opacity {:aria-hidden "true"}]
      [:div (tw [:fixed :inset-0 :bg-gray-500 :bg-opacity-75 :transition :ease-in-out :duration-300]
                {:on-click #(rf/dispatch [:show-highlight-modal false])})]
      [:span.hidden.sm:inline-block.sm:align-middle.sm:h-screen {:aria-hidden "true"} "&#8203;"]
      [:div
       (tw modal modal-transition)
       ;[:div {:class "inline-block align-bottom bg-white rounded-lg px-4 pt-5 pb-4 text-left overflow-hidden shadow-xl transform transition-all sm:my-8 sm:align-middle sm:max-w-sm sm:w-full sm:p-6"}
       [:div
        [:div.mt-3.text-center.sm:mt-5
         [:div.mt-2
          (map (fn [highlight]
                 [:p.text-sm.text-gray-500.pb-10 (:text highlight)]) mock-highlights-data)]]]]]]))

