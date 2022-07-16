# Base Project

<aside>
💡 안드로이드 프로젝트 생성 시 필요한 라이브러리와 구조를 미리 정의합니다.
</aside>

## Summary
👉🏻 Language
- kotlin

👉🏻 minSdk
- 21 5.0(Lollipop)

👉🏻 buildFeatures
- viewBinding true
- dataBinding true

## Dependency

    // rxjava2
    implementation 'io.reactivex.rxjava2:rxandroid:2.1.1'
    implementation 'io.reactivex.rxjava2:rxjava:2.2.17'

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
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"
    // LiveData
    implementation "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"

    // Jetpack Navigation
    def nav_version = "2.4.2"

    // Kotlin
    implementation "androidx.navigation:navigation-fragment-ktx:$nav_version"
    implementation "androidx.navigation:navigation-ui-ktx:$nav_version"

    // Feature module Support
    implementation "androidx.navigation:navigation-dynamic-features-fragment:$nav_version"

    // Testing Navigation
    androidTestImplementation "androidx.navigation:navigation-testing:$nav_version"

    // Jetpack Compose Integration
    implementation "androidx.navigation:navigation-compose:$nav_version"
