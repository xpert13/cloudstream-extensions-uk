// use an integer for version numbers
version = 22

dependencies {
    implementation(libs.gson)

    testImplementation(libs.junit)
    testImplementation(libs.kotlinx.coroutines.test)
}

cloudstream {
    language = "uk"
    // All of these properties are optional, you can safely remove them

    description = "На нашому сайті ви можете подивитися аніме онлайн українською безкоштовно. Великий список аніме онлайн тільки у нас."
    authors = listOf("CakesTwix")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // 1 = Ok (upstream ships 3 = Beta only; revert before an upstream PR)
    tvTypes = listOf(
        "Anime",
        "AnimeMovie",
    )

    iconUrl = "https://www.google.com/s2/favicons?domain=anitube.in.ua&sz=%size%"
}
