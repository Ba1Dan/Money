package com.example.money.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.ImageVector

enum class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector,
    val unselectedIcon: ImageVector
) {
    Home(
        route = "home",
        title = "Home",
        icon = Icons.Filled.Home,
        unselectedIcon = Icons.Outlined.Home,
    ),

    Profile(
        route = "profile",
        title = "Profile",
        icon = Icons.Filled.Person,
        unselectedIcon = Icons.Outlined.Person,
    ),

    Settings(
        route = "settings",
        title = "Settings",
        icon = Icons.Filled.Settings,
        unselectedIcon = Icons.Outlined.Settings,
    )
}