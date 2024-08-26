
# Animated borders (Jetpack library)
<p align="left">
  <a href="#"><img alt="Languages-Kotlin" src="https://img.shields.io/badge/Language-Kotlin-1DA1F2?style=flat-square&logo=kotlin"></a>
  <a href="#"><img alt="Version" src="https://jitpack.io/v/ErrorxCode/Animated-border-compose.svg"></a>
  <a href="https://www.instagram.com/x0.rahil/"><img alt="Instagram - x0.rahil" src="https://img.shields.io/badge/Instagram-x0.rahil-lightgrey"></a>
  <a href="#"><img alt="Downloads" src="https://jitpack.io/v/ErrorxCode/Animated-border-compose/month.svg"></a>
  <a href="#"><img alt="GitHub Repo stars" src="https://img.shields.io/github/stars/ErrorxCode/Animated-border-compose?style=social"></a>
  </p>

> "Special things should look different from others ~"

This library provides you with a card with animated borders. You can also use the modifier `animatedBorders()` to make any box animatable



Duplex style        |  Pointed style      | Modem style
:-------------------------:|:-------------------------:|:-------------------------:
![Duplex](https://github.com/user-attachments/assets/c4ca53a4-0753-410b-a5e5-b57cd719237e) |  ![Pointed](https://github.com/user-attachments/assets/10034166-1db2-48b0-a9c0-03a9be89c890) | ![Modem](https://github.com/user-attachments/assets/d4c06a29-0494-4307-8cae-c92af0416dd2)




## Implementation

To deploy this project run

**Step 1**. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:
```groovy
	dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
```
**Step 2**. Add the dependency

	dependencies {
	        implementation 'com.github.ErrorxCode:Animated-border-compose:Tag'
	}
 
[![](https://jitpack.io/v/ErrorxCode/Animated-border-compose.svg)](https://jitpack.io/#ErrorxCode/Animated-border-compose)


## Usage/Examples
### Card with already animated border
```kotlin
AnimatedBorderCard(
        Modifier.fillMaxWidth(),
        listOf(Color.Red, Color.Blue,Color.White),
        4,
	false    // --------> For white background, the default is dark
    ) {
        Column(Modifier.padding(16.dp)) {
            Text("Animated border is awsome\n", fontSize = 26.sp, color = Color.White)
            Text(
                "Use this amazing library now\nSome special things in the app should be highlighted.",
                fontSize = 16.sp,
                color = Color.White
            )
        }
    }
```

### Make any box animated using `animateBorder()` modifier
```kotlin
Box(
    Modifier
        .fillMaxWidth()
        .animatedBorder(
            listOf(Color.Red, Color.Blue, Color.White),
            4,
            shape = RectangleShape
        )
) {
    Column(
        Modifier
            .background(Color.Black)   // -----> This is important
            .padding(16.dp)
    ) {
        Text("Animated border is awsome\n", fontSize = 26.sp, color = Color.White)
        Text(
            "Use this amazing library now\nSome special things in the app should be highlighted.",
            fontSize = 16.sp,
            color = Color.White
        )
    }
}
```

### `animatedBorder()` modifier
```kotlin
@Composable
fun Modifier.animatedBorder(
    colors: List<Color>,   ----------> Colors you want to use in border
    borderWidth: Int,      ----------> Border width
    shape: Shape = CardDefaults.shape, ------> The shape of the border, not required if applied to round corner
    animaStyle: Anima = Anima.Duplex, --------> The moment style of borders
    easing: Easing = LinearEasing, ---------> Easing, if you want to change the interpolator of the animation
    speed: AnimaSpeed = AnimaSpeed.Normal -----> Speed of moment of border
)
```
**Note:** When using this, the inner layout **must have a background** colour otherwise the whole composable will be gradient

## Contributing

Contributions are always welcome!

What you can do is you can add more customization options to it. You can anytime contact me on [instagram](https://instagram.com/x0.rahil) for any kind of help.


