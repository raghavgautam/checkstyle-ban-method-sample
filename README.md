# Sample project for banning methods using checkstyle

## Running Checkstyle on the project
### Using gradle
```bash
./gradlew clean check
```

Sample output
```
[ant:checkstyle] [ERROR] /checkstyle-ban-method-sample/src/main/java/com/github/sevntu/checkstyle/Sample.java:8:26: Call to 'assertTrue' method (matches pattern 'assert(True|False)') with '1' arguments (matches pattern '1') is forbidden. Reason: Please suppply a reason with assertTrue()/assertFalse() calls. [ForbidCertainMethod]
[ant:checkstyle] [ERROR] /checkstyle-ban-method-sample/src/main/java/com/github/sevntu/checkstyle/Sample.java:9:27: Call to 'assertFalse' method (matches pattern 'assert(True|False)') with '1' arguments (matches pattern '1') is forbidden. Reason: Please suppply a reason with assertTrue()/assertFalse() calls. [ForbidCertainMethod]
[ant:checkstyle] [ERROR] /checkstyle-ban-method-sample/src/main/java/com/github/sevntu/checkstyle/Sample.java:10:20: Call to 'exit' method (matches pattern '^exit$') with '1' arguments (matches pattern '1') is forbidden. Reason: System.exit() call stops the jvm leading to DOS attacks. [ForbidCertainMethod]
Checkstyle rule violations were found. See the report at: file:///checkstyle-ban-method-sample/build/reports/checkstyle/main.xml
```
### Using maven
```bash
mvn clean checkstyle:check
```

Sample output
```txt
[INFO] There are 3 errors reported by Checkstyle 8.8 with checkstyle.xml ruleset.
[ERROR] src/main/java/com/github/sevntu/checkstyle/Sample.java:[8,26] (extension) ForbidCertainMethod: Call to 'assertTrue' method (matches pattern 'assert(True|False)') with '1' arguments (matches pattern '1') is forbidden. Reason: Please suppply a reason with assertTrue()/assertFalse() calls.
[ERROR] src/main/java/com/github/sevntu/checkstyle/Sample.java:[9,27] (extension) ForbidCertainMethod: Call to 'assertFalse' method (matches pattern 'assert(True|False)') with '1' arguments (matches pattern '1') is forbidden. Reason: Please suppply a reason with assertTrue()/assertFalse() calls.
[ERROR] src/main/java/com/github/sevntu/checkstyle/Sample.java:[10,20] (extension) ForbidCertainMethod: Call to 'exit' method (matches pattern '^exit$') with '1' arguments (matches pattern '1') is forbidden. Reason: System.exit() call stops the jvm leading to DOS attacks.
```

Original source code: https://github.com/sevntu-checkstyle/checkstyle-samples
