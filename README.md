# OpenLinkChrome

Aplikasi Android sederhana. Saat ikonnya diketuk, aplikasi langsung membuka
https://adb-hmdm.netlify.app/ di Google Chrome (fallback ke browser default jika Chrome tidak terpasang).

## Build

- **Android Studio**: buka folder ini, tunggu Gradle sync, lalu Run atau Build → Build APK(s).
- **GitHub Actions**: setiap push ke `main` otomatis membangun APK. Unduh dari tab *Actions* → run terbaru → *Artifacts* → `OpenLinkChrome-debug-apk`.

## Ganti link

Ubah konstanta `URL` di `app/src/main/java/com/example/openlinkchrome/MainActivity.kt`.
