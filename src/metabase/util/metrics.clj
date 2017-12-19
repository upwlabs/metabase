(ns metabase.util.metrics
  (:require [metrics
             [core        :refer [new-registry]]]
            [metrics.reporters.jmx :as jmx]))

(def reg (new-registry))

(def jr (jmx/reporter reg {}))

(jmx/start jr)
