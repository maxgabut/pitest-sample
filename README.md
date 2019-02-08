Branch created to keep code samples for https://github.com/hcoles/pitest/issues/560

Run `mvn compile` and then `mvn pitest:mutationCoverage` to run mutation coverage.

There is no issue with the project using junit4 (`simplest`).
The analysis fails with the project using junit5 (`simplest-junit5`).
The analysis works with the pitest-junit5-plugin (`simplest-junit5-plugin`)