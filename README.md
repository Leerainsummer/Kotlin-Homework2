# Kotlin Homework2

使用 Kotlin 完成三個 Android Studio 專案。

| 專案 | 主題 | 功能 |
| --- | --- | --- |
| [lab4](lab4) | 點餐系統 | 選擇飲料、甜度、冰塊，透過 Activity Result API 回傳結果 |
| [lab5](lab5) | 生命週期觀測 | 切換 Fragment，觀察 Activity 與 Fragment 的生命週期及 Logcat |
| [lab6](lab6) | 訊息提示與互動 | AlertDialog、自訂 Toast 與清單選擇 |

## 開啟與執行

在 Android Studio 分別開啟 lab4、lab5 或 lab6 資料夾，完成 Gradle Sync 後按 Run。各專案為獨立 Android 應用程式。

- Android Gradle Plugin：9.4.1（內建 Kotlin）
- Gradle：9.6.0
- compileSdk / targetSdk：37；minSdk：24
- 使用 Android Studio 的內建 JDK，並安裝對應 Android SDK。
- 本機 SDK 路徑由 Android Studio 建立 local.properties，不納入版本控制。

三個專案均已通過 assembleDebug 編譯；尚未進行手機或模擬器操作測試。

## Java 與 Kotlin 語法差異及程式整理

- 使用 val/var 與型別推導，取代 Java 的重複型別宣告。
- 使用 lambda 取代匿名 OnClickListener 與 DialogInterface.OnClickListener。
- 使用 ?.let 處理可能為 null 的 Activity 回傳資料。
- 使用字串模板組合點餐結果與訊息，提升可讀性。
- 使用 Intent.apply 集中設定回傳資料。
- lab4 加入空白飲料檢查及旋轉後還原訂單結果。
- lab5 共用 LifecycleFragment，避免兩個 Fragment 重複撰寫生命週期紀錄。

## 參考來源

lab4、lab6 由原有 Java 作業 project1030、project1030_2 改寫；作業指定教材範例：
https://github.com/taipeitechmmslab/MMSLAB-Android-Kotlin
