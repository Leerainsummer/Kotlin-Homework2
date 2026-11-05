# lab4 — Kotlin Homework2

以 Kotlin 實作，可直接使用 Android Studio 開啟本資料夾。
保留原專案的 Gradle 9.6 / AGP 9.4.1 與本機 Android SDK 設定。
AGP 9 已內建 Kotlin，不需要額外套用 kotlin-android plugin。

## 執行
Android Studio 開啟專案、完成 Sync 後按 Run。或設定 JAVA_HOME 至 Android Studio 的 jbr 後執行 `gradlew.bat assembleDebug`。

## 功能與檢查
點選「選擇」，輸入飲料、選甜度與冰塊後送出，主畫面會顯示結果。空白飲料顯示錯誤；返回不覆寫結果；旋轉後保留點餐結果。使用 Activity Result API、Intent.apply、空值安全與字串模板。

來源參考：原有 Java 專案與作業指定 https://github.com/taipeitechmmslab/MMSLAB-Android-Kotlin 。
