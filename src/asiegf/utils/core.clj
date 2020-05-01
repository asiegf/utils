(ns asiegf.utils.core)

(defmacro mmap
  "Transforms a list of symbols into keywords and map them
  with their bindings.
  [foo  1, bar 2] => {:foo 1 :bar 2}"
  [& symbols]
  `(let [ks# (map keyword '~symbols)]
     (zipmap ks# [~@symbols])))
