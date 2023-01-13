# How to convert Maven Build to Gradle

## Requisites

gradle 7.2 or lator

* apt 4.4.1
* snap 7.2

## steps

$ mvn clean

add working dirs to .gitignore
* .gradle
* build

```
$ gradle init
Generate build from Maven build.
Select build script DSL: Groovy
```

edit build.gradle
