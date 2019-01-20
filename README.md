This branch was created to keep code samples for https://github.com/hcoles/pitest/issues/548.

`/simple` folder contains a maven project with interesting profiles

run `mvn clean install -Pexclusion-with-sub-tags` to use a plugin where classes exclusion is configured using subtags. Like this :
```xml
  <excludedClasses>
      <excludedClass>org.maxgabut.OtherJavaClass</excludedClass>
  </excludedClasses>
```

run `mvn clean install -Pexclusion-no-sub-tags` to use a plugin where classes exclusion is configured without using subtagsd. Like this :
```xml
  <excludedClasses>org.maxgabut.OtherJavaClass</excludedClasses>
```
