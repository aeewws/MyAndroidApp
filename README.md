# MyAndroidApp

MyAndroidApp is now a minimal Android starter project written in Java.

It is intentionally small:

- one `Activity`
- no Retrofit wiring yet
- no Compose dependency yet
- a GitHub Actions workflow that runs the basic unit test task and assembles the debug app

## Build

```bash
./gradlew assembleDebug
```

## Test

```bash
./gradlew testDebugUnitTest
```

## Run

Open the project in Android Studio or install the generated debug APK from a machine with the Android SDK configured.

## CI

GitHub Actions runs both `testDebugUnitTest` and `assembleDebug` on pushes and pull requests to `main`.
