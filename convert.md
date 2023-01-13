# How to convert Maven Build to Gradle

$ gradle tasks
$ gradle check
$ gradle run
$ gradle javadoc
$ gradle build
$ java -jar build/libs/xxx-0.1-SNAPSHOT.jar

## Requisites

gradle 7.2 or lator

* apt 4.4.1
* snap 7.2

## steps

$ mvn clean

### add working dirs to .gitignore
```
# working dirs for gradle
* .gradle
* build
# working file and dir for spotless
.project
.settings/
```
### gradle init

```
$ gradle init
Generate build from Maven build.
Select build script DSL: Groovy
```

edit build.gradle

remove pom.xml
