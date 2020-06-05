# Maven
Manages dependencies and the build of a project these use files of types:

###### .jar
JAVA ARCHIVE file which are much like a zip

Maven has archetypes that are prebuilt dependency libraries for you to start much like a template.

Configure creating your project in the same way going through the setup.

Maven creates a project structure and an xml file.

In this xml file you declare the JDK you use the dependencies and the archetypes you will use.

Finding your own dependencies is now done by Maven through <br> mvnrepository.com <br>

<i><b>POM Project Object Model the place for your dependencies.</b></i>

###### Dependency Example
This following code would be in your POM.xml file:

```xml
<!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api -->
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-api</artifactId>
    <version>5.6.2</version>
    <scope>test</scope>
</dependency>
```
This will retrieve the deoendency and automatically update your library once obtained.
<br><br>
`@Annotations` let the compiler know that something is happening onto an object. They are short messages that allow you to modify what classes can do and how they behave. Some Annotations can also have parameters such as `@DisplayName` renaming the test in the test bed for JUnit.

Using features from a dependency will update the file in java with an import from that dependency.

###### Assertion
What do you expect and what do you want me to check that against.

Maven can also automate functions that are called cycles. Such as cleaning the dependencies and reloading them and they can be chained as well when you want to test your application. Great for larger scale apps where you have many many external dependencies.
