package errorxcode.jitpack.animatedborder

import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Modifier.animatedBorder(
    colors: List<Color>,
    borderWidth: Int,
    shape: Shape = CardDefaults.shape,
    animaStyle: Anima = Anima.Duplex,
    easing: Easing = LinearEasing,
    speed: AnimaSpeed = AnimaSpeed.Normal
): Modifier {
    val brush = when (animaStyle) {
        Anima.Duplex -> Brush.verticalGradient(colors)
        Anima.Pointed -> Brush.sweepGradient(colors)
        Anima.Modem -> Brush.horizontalGradient(colors)
    }
    val angle = rememberInfiniteTransition(label = "angle")
        .animateFloat(
            0f,
            360f,
            animationSpec = infiniteRepeatable(
                tween(speed.value, easing = easing),
                repeatMode = RepeatMode.Restart
            ),
            label = "angle_change"
        )
    return this
        .clip(shape)
        .padding(borderWidth.dp)
        .drawWithContent {
            rotate(angle.value) {
                drawCircle(brush, size.width)
            }
            drawContent()
        }
}


@Composable
fun AnimatedBorderCard(
    modifier: Modifier,
    colors: List<Color>,
    borderWidth: Int,
    isDark: Boolean = true,
    cardElevation: CardElevation = CardDefaults.cardElevation(),
    shape: Shape = CardDefaults.shape,
    animaStyle: Anima = Anima.Duplex,
    easing: Easing = LinearEasing,
    speed: AnimaSpeed = AnimaSpeed.Normal,
    content: @Composable () -> Unit
) {
    Card(
        modifier.animatedBorder(colors, borderWidth, shape, animaStyle, easing, speed),
        colors = CardDefaults.cardColors(if (isDark) Color.Black else Color.White),
        elevation = cardElevation
    ) {
        content()
    }
}

enum class Anima {
    Duplex,
    Pointed,
    Modem
}

enum class AnimaSpeed(val value: Int) {
    Slow(2000),
    Normal(1000),
    Fast(500)
}