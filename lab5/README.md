# lab5 — Kotlin Homework2

以 Kotlin 實作，可直接使用 Android Studio 開啟本資料夾。
保留原專案的 Gradle 9.6 / AGP 9.4.1 與本機 Android SDK 設定。
AGP 9 已內建 Kotlin，不需要額外套用 kotlin-android plugin。

## 執行
Android Studio 開啟專案、完成 Sync 後按 Run。或設定 JAVA_HOME 至 Android Studio 的 jbr 後執行 `gradlew.bat assembleDebug`。

## 功能與檢查
切換 First/Second Fragment，觀察 onAttach 到 onDetach；返回鍵還原前一個 Fragment。回主畫面再回來、旋轉螢幕可觀察 Activity 與 Fragment 生命週期。Logcat 篩選 LifecycleLab 可查看包含離開時的完整紀錄。共用 LifecycleFragment 避免重複程式碼。

來源參考：原有 Java 專案與作業指定 https://github.com/taipeitechmmslab/MMSLAB-Android-Kotlin 。
