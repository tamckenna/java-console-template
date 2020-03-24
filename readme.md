# Application Template

An application template

* Application begins at:
    * Class:  [com.example.Application](src/main/java/com/example/Application.java)
    * Method: ``` public void run(String... args) ```
* Unit Tests are located at: [src/test/java/com/example](src/test/java/com/example)

---

## Application Properties

Can be edited in the [gradle.properties](gradle.properties) file

* Group Name: __com.example__
* Project Name: __application-template__

---

## Application Build

```
./gradlew fullBuild
```

* Artifact Output: ``` build/libs/application-template.jar ```
* Unit Tests Report: ``` build/reports/tests/index.html ```
* Code Coverage Report (Clover): ``` build/reports/clover/html/index.html ```
* Code Quality Report (PMD): ``` build/reports/pmd/main.html ```
* Bug Report (SpotBugs): ``` build/reports/spotbugs/spotbugs.html ```
