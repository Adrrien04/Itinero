package androidx.compose.samples.crane.ui

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


val crane_caption = Color.Gray
val crane_divider_color = Color.LightGray


val colorPrimary = Color(0xFF0088FF)
val colorPrimaryDark = Color(0xFF215367)
val colorAccent = Color(0xFF00B7FF)

val craneColors = lightColors(
    primary = colorPrimaryDark,
    secondary = colorAccent,
    surface = colorPrimary,
    primaryVariant = colorPrimary
)

val BottomSheetShape = RoundedCornerShape(
    topStart = 20.dp,
    topEnd = 20.dp,
    bottomStart = 0.dp,
    bottomEnd = 0.dp
)

@Composable
fun CraneTheme(content: @Composable () -> Unit) {
    MaterialTheme(colors = craneColors, typography = craneTypography) {
        content()
    }
}
