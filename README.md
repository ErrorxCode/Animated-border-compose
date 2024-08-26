
# Library name (Jetpack library)
<p align="left">
  <a href="#"><img alt="Languages-Kotlin" src="https://img.shields.io/badge/Language-Kotlin-1DA1F2?style=flat-square&logo=kotlin"></a>
  <a href="#"><img alt="Version" src="https://jitpack.io/v/ErrorxCode/ExpandableCard.svg"></a>
  <a href="https://www.instagram.com/x0.rahil/"><img alt="Instagram - x0.rahil" src="https://img.shields.io/badge/Instagram-x0.rahil-lightgrey"></a>
  <a href="#"><img alt="Downloads" src="https://jitpack.io/v/ErrorxCode/EasyInsta/month.svg"></a>
  <a href="#"><img alt="GitHub Repo stars" src="https://img.shields.io/github/stars/ErrorxCode/ExpandableCard?style=social"></a>
  </p>

> "Quote of the library"

This library provides an amazing Expandable card compose which you can use to show simple information or can put your own compose inside it.

![images of the library](https://github.com/user-attachments/assets/d3f05920-a9ad-4977-a338-c765116a2248)

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
	        implementation 'com.github.ErrorxCode:ExpandableCard:Tag'
	}
 
[![](https://jitpack.io/v/ErrorxCode/ExpandableCard.svg)](https://jitpack.io/#ErrorxCode/ExpandableCard)


## Usage/Examples

#### ExpandableCard
```kotlin
ExpandableCard("A beautiful landscape") {  
  Image(  
        painter = painterResource(R.drawable.img), contentDescription = "",  
        contentScale = ContentScale.FillWidth,  
        modifier = Modifier.fillMaxWidth()  
    )  
}
```

#### SimpleInfo card
```kotlin
SimpleInfoCard(  
    "About Jetpack compose",  
    "Jetpack Compose is Android’s......."  
    true,  
    "View more",  
    {  
	  println("View more clicked!")  
    })
```



## Contributing

Contributions are always welcome!

What you can do is you can add more customization options to it. You can anytime contact me on [instagram](https://instagram.com/x0.rahil) for any kind of help.


