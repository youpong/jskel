This is a skelton project for Java.

# Requisites 

* Build tool: gradle 7.2 or lator
* JDK: Java16 or lator

# support gradle tasks

* clean - clean working files & dirs
* check - format check and test
  - spotlessCheck - formt check
  - spotlessApply - fix formt
  - test - test
* build - generate class files and jar
* run - execute
* javadoc - generate javadoc api

The command line arguments can be passed with --args. For example,
```bash
$ gradle run --args='-b README.md'
```

# files & directories

* convert.md - how to convert Maven build to gradle
* formatter.xml - code formatter conf 
* build/docs/javadoc - javadoc
* build/libs - jar
* src/main/java - source
* src/test/java - test source

# specifications 
use Eclipse formatter via spotless plugin as code formatter.
