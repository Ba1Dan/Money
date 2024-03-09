package com.example.core_ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.core_ui.R

@Immutable
data class WbMoneyTypography(
    val title1Medium: TextStyle = TextStyle(
        fontSize = 40.sp,
        lineHeight = 48.sp,
        fontFamily = FontFamily(Font(R.font.als_hauss_medium)),
        fontWeight = FontWeight(550),
        color = Color(0xFF232323),
    ),
    val title1Bold: TextStyle = TextStyle(
        fontSize = 40.sp,
        lineHeight = 48.sp,
        fontFamily = FontFamily(Font(R.font.als_hauss_bold)),
        fontWeight = FontWeight(720),
        color = Color(0xFF232323),
    ),
    val title2Medium: TextStyle = TextStyle(
        fontSize = 36.sp,
        lineHeight = 44.sp,
        fontFamily = FontFamily(Font(R.font.als_hauss_medium)),
        fontWeight = FontWeight(550),
        color = Color(0xFF232323),
    ),
    val title2Bold: TextStyle = TextStyle(
        fontSize = 36.sp,
        lineHeight = 44.sp,
        fontFamily = FontFamily(Font(R.font.als_hauss_bold)),
        fontWeight = FontWeight(720),
        color = Color(0xFF232323),
    ),
    val heading1Medium: TextStyle = TextStyle(
        fontSize = 32.sp,
        lineHeight = 40.sp,
        fontFamily = FontFamily(Font(R.font.als_hauss_medium)),
        fontWeight = FontWeight(550),
        color = Color(0xFF232323)
    ),
    val heading1Bold: TextStyle = TextStyle(
        fontSize = 32.sp,
        lineHeight = 40.sp,
        fontFamily = FontFamily(Font(R.font.als_hauss_bold)),
        fontWeight = FontWeight(720),
        color = Color(0xFF232323),
    ),
    val heading2Medium: TextStyle = TextStyle(
        fontSize = 24.sp,
        lineHeight = 32.sp,
        fontFamily = FontFamily(Font(R.font.als_hauss_medium)),
        fontWeight = FontWeight(550),
        color = Color(0xFF232323),
    ),
    val heading2Bold: TextStyle = TextStyle(
        fontSize = 24.sp,
        lineHeight = 32.sp,
        fontFamily = FontFamily(Font(R.font.als_hauss_bold)),
        fontWeight = FontWeight(720),
        color = Color(0xFF232323),
    ),
    val subheading1Medium: TextStyle = TextStyle(
        fontSize = 20.sp,
        lineHeight = 28.sp,
        fontFamily = FontFamily(Font(R.font.als_hauss_medium)),
        fontWeight = FontWeight(550),
        color = Color(0xFF232323),
    ),
    val subheading1Regular: TextStyle = TextStyle(
        fontSize = 20.sp,
        lineHeight = 28.sp,
        fontFamily = FontFamily(Font(R.font.als_hauss_regular)),
        fontWeight = FontWeight(400),
        color = Color(0xFF232323),
    ),
    val subheading2Medium: TextStyle = TextStyle(
        fontSize = 18.sp,
        lineHeight = 26.sp,
        fontFamily = FontFamily(Font(R.font.als_hauss_medium)),
        fontWeight = FontWeight(550),
        color = Color(0xFF232323),
    ),
    val textMedium: TextStyle = TextStyle(
        fontSize = 16.sp,
        lineHeight = 22.sp,
        fontFamily = FontFamily(Font(R.font.als_hauss_medium)),
        fontWeight = FontWeight(550),
    ),
    val textRegular: TextStyle = TextStyle(
        fontSize = 16.sp,
        lineHeight = 22.sp,
        fontFamily = FontFamily(Font(R.font.als_hauss_regular)),
        fontWeight = FontWeight(400),
        color = Color(0xFF7A7C80),
    ),
    val caption1Regular: TextStyle = TextStyle(
        fontSize = 14.sp,
        lineHeight = 20.sp,
        fontFamily = FontFamily(Font(R.font.als_hauss_regular)),
        fontWeight = FontWeight(400),
        color = Color(0xFF7A7C80),
    ),
    val caption1Medium: TextStyle = TextStyle(
        fontSize = 14.sp,
        lineHeight = 20.sp,
        fontFamily = FontFamily(Font(R.font.als_hauss_medium)),
        fontWeight = FontWeight(550),
        color = Color(0xFF7A7C80),
    ),
    val caption2Regular: TextStyle = TextStyle(
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontFamily = FontFamily(Font(R.font.als_hauss_regular)),
        fontWeight = FontWeight(400),
        color = Color(0xFF7A7C80),
    ),
    val caption2Medium: TextStyle = TextStyle(
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontFamily = FontFamily(Font(R.font.als_hauss_medium)),
        fontWeight = FontWeight(550),
        color = Color(0xFF7A7C80),
    ),
    val caption3Regular: TextStyle = TextStyle(
        fontSize = 10.sp,
        lineHeight = 16.sp,
        fontFamily = FontFamily(Font(R.font.als_hauss_regular)),
        fontWeight = FontWeight(400),
        color = Color(0xFF7A7C80),
    ),
    val caption3Medium: TextStyle = TextStyle(
        fontSize = 10.sp,
        lineHeight = 16.sp,
        fontFamily = FontFamily(Font(R.font.als_hauss_medium)),
        fontWeight = FontWeight(550),
        color = Color(0xFF7A7C80),
    ),
)

internal val LocalMoneyTypography = staticCompositionLocalOf { WbMoneyTypography() }