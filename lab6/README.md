# lab6 — Kotlin Homework2

以 Kotlin 實作，可直接使用 Android Studio 開啟本資料夾。
保留原專案的 Gradle 9.6 / AGP 9.4.1 與本機 Android SDK 設定。
AGP 9 已內建 Kotlin，不需要額外套用 kotlin-android plugin。

## 執行
Android Studio 開啟專案、完成 Sync 後按 Run。或設定 JAVA_HOME 至 Android Studio 的 jbr 後執行 `gradlew.bat assembleDebug`。

## 功能與檢查
顯示 Dialog 後分別測試取消、圖文自訂 Toast、LIST；選擇 message1 到 message5 會顯示所選文字。使用 lambda、arrayOf 與字串模板取代 Java 匿名監聽器。自訂 Toast 使用作業所示 API（已標註 deprecated），適用前景示範。

來源參考：原有 Java 專案與作業指定 https://github.com/taipeitechmmslab/MMSLAB-Android-Kotlin 。
