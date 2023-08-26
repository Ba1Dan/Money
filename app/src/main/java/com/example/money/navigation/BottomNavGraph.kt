package com.example.money.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelStoreOwner
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.money.screens.home.presentation.DetailWasteOfMoneyScreen
import com.example.money.screens.home.presentation.HomeScreen
import com.example.money.screens.profile.ProfileScreen
import com.example.money.screens.settings.SettingsScreen
import org.koin.androidx.compose.koinViewModel


@Composable
fun BottomNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    val viewModelStoreOwner = checkNotNull(LocalViewModelStoreOwner.current) {
        "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
    }

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        homeScreen(
            navigateToDetail = { id ->
                navController.navigateToMovieDetails(id = id)
            },
            viewModelStoreOwner = viewModelStoreOwner
        )
        detailScreen(
            onBackClick = {
                navController.popBackStack()
            }
        )
        composable(route = BottomBarScreen.Profile.route) {
            ProfileScreen()
        }
        composable(route = BottomBarScreen.Settings.route) {
            SettingsScreen()
        }
    }
}

fun NavGraphBuilder.homeScreen(
    navigateToDetail: (String) -> Unit,
    viewModelStoreOwner: ViewModelStoreOwner,
) {
    composable(route = BottomBarScreen.Home.route) {
        HomeScreen(
            navigateToDetail = navigateToDetail,
            viewModel = koinViewModel(viewModelStoreOwner = viewModelStoreOwner)
        )
    }
}

private const val movieDetailsRoute: String = "details/{id}"

fun NavHostController.navigateToMovieDetails(id: String) {
    navigate("details/$id")
}

fun NavGraphBuilder.detailScreen(
    onBackClick: () -> Unit
) {
    composable(
        route = movieDetailsRoute,
    ) {
        DetailWasteOfMoneyScreen(onBackClick = onBackClick)
    }
}