package kevinjoramos.androidapptemplate.ui.navigation

sealed class AppDestination(val route: String) {
    object SplashScreen : AppDestination("splash-screen")
    object PrimaryScreen : AppDestination("primary-screen")
    // ...add routes to other screens here.
}
