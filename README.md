# MyAndroidApp

MyAndroidApp is now a minimal Android starter project written in Kotlin.

It is intentionally small:

- one `Activity`
- no Retrofit wiring yet
- no Compose dependency yet
- a GitHub Actions workflow that assembles the debug app

## Build

```bash
./gradlew assembleDebug
```

## Run

Open the project in Android Studio or install the generated debug APK from a machine with the Android SDK configured.

## CI

GitHub Actions runs a minimal Android build on pushes and pull requests to `main`.
