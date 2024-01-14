# Base Project

<aside>
💡 안드로이드 프로젝트 생성 시 필요한 라이브러리와 구조를 미리 정의합니다.
</aside>

## Summary
👉🏻 Language
- kotlin

👉🏻 minSdk
- 26 8.0-8.1(Oreo)

👉🏻 buildFeatures
- viewBinding true

## How to use after clone this project
- 해당 프로젝트 클론 후 깃을 초기화 해주세요
```bash
    rm -rf .git
```

- setting.gradle에서 rootProject.name을 변경해주세요
```groovy
    rootProject.name = "YourName"
```

- package name 을 변경해주세요

- 자유롭게 사용하시면 됩니다.


## Dependency

    implementation 'androidx.core:core-ktx:1.7.0'
    implementation 'androidx.appcompat:appcompat:1.4.2'
    implementation 'com.google.android.material:material:1.6.1'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'

    // retrofit
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
    implementation 'com.squareup.retrofit2:adapter-rxjava2:2.9.0'

    // okhttp
    implementation 'com.squareup.okhttp3:okhttp-urlconnection:4.9.2'

    // GSON
    implementation 'com.google.code.gson:gson:2.9.0'

    // ViewModel
    def lifecycle_version = "2.5.0"
    //noinspection GradleDependency
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    // LiveData
    //noinspection GradleDependency
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"

    // hilt
    implementation "com.google.dagger:hilt-android:2.44"
    kapt "com.google.dagger:hilt-compiler:2.44"

    // Coroutine
    implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.6.4'
