(defproject clojure.gdx.lwjgl "1.13.0-0.1"
  :dependencies [[org.clojure/clojure "1.12.0"]
                 [com.badlogicgames.gdx/gdx-platform       "1.13.0" :classifier "natives-desktop"]
                 [com.badlogicgames.gdx/gdx-backend-lwjgl3 "1.13.0"]]
  :plugins [[lein-codox "0.10.8"]]
  :codox {:source-uri "https://github.com/damn/clojure.gdx.lwjgl/blob/main/{filepath}#L{line}"
          :metadata {:doc/format :markdown}})
