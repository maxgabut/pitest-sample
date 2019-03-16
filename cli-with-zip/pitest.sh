#! /bin/bash

PITEST_CLASS_PATH="target/classes"
PITEST_CLASS_PATH+=",target/test-classes"
PITEST_CLASS_PATH+=",project-bin/junit-4.12.jar"
PITEST_CLASS_PATH+=",project-bin/jquery-ui-1.12.1.jar"

java -cp "bin/*"                                               \
    org.pitest.mutationtest.commandline.MutationCoverageReport \
    --reportDir report/                                        \
    --targetClasses org.maxgabut.*                             \
    --targetTests org.maxgabut.*                               \
    --sourceDirs src/main/java/                                \
    --classPath ${PITEST_CLASS_PATH}

