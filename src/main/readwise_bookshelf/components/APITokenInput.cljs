(ns readwise-bookshelf.components.APITokenInput
  (:require [nano-id.core :refer [custom]]))

(def token-generator (custom "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz" 200))

(defn APITokenInput
  "Input that receives the user's API token to retrieve books from readwise"
  []
  [:div
   [:label.flex.justify-center.block.text-lg.font-large.text-gray-700 {:for "api_token"} "Readwise API Token"]
   [:div.mt-1.relative.rounded-md.shadow-sm
    [:input#api_token.focus:ring-yellow-500.focus:border-yellow-500.block.w-full.pr-10.sm:text-sm.border-gray-300.rounded-md {:type "text" :name "api_token" :placeholder (token-generator)}]
    [:a {:href "https://readwise.io/access_token"}
     [:div.absolute.inset-y-0.right-0.pr-3.flex.items-center
      [:svg.h-5.w-5.text-gray-400 {:xmlns "http://www.w3.org/2000/svg" :viewBox "0 0 20 20" :fill "currentColor" :aria-hidden "true"}
       [:path {:fill-rule "evenodd" :d "M18 10a8 8 0 11-16 0 8 8 0 0116 0zm-8-3a1 1 0 00-.867.5 1 1 0 11-1.731-1A3 3 0 0113 8a3.001 3.001 0 01-2 2.83V11a1 1 0 11-2 0v-1a1 1 0 011-1 1 1 0 100-2zm0 8a1 1 0 100-2 1 1 0 000 2z" :clip-rule "evenodd"}]]]]]])