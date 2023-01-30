## Running test


## How to display code coverage in SonarQube using Jacoco

#### 1. Merge all individual jacoco.exec file into one file

- java -jar jacoco_cli.jar merge [<exec_file_1> <exec_file_2> ...] --destfile <path\to\output\file>

  Example: java -jar org.jacoco.cli.jar merge C:\Users\tqbao\Desktop\jacoo0\jacoco.exec C:
  \Users\tqbao\Desktop\jacoco1\jacoco.exec --destfile C:\Users\tqbao\Desktop\jacoco

#### 2. Generate jacoco report in xml format

- java -jar jacoco_cli.jar report [<execfiles> ...] --classfiles <path\to\classfiles.jar>
  [--csv <file>] [--encoding <charset>] [--help] [--html <dir>] [--name <name>] [--sourcefiles <path>] [--tabwith <n>] [--xml <file>]

  Example(html): java -jar org.jacoco.cli-0.8.9-20220405.092301-1-nodeps.jar report C:
  \Users\tqbao\Desktop\jacoco\jacoco.exec --classfiles E:\ProgrammingStudy\MavenTest\target\MavenTest-1.0-SNAPSHOT.jar
  --html C:\Users\tqbao\Desktop\jacoco\index.html

  Example(xml): java -jar org.jacoco.cli-0.8.9-20220405.092301-1-nodeps.jar report C:
  \Users\tqbao\Desktop\jacoco\jacoco.exec --classfiles E:\ProgrammingStudy\MavenTest\target\MavenTest-1.0-SNAPSHOT.jar
  --xml C:\Users\tqbao\Desktop\jacoco\jacoco.xml

#### 3. Import jacoco xml report to SonarQube

Using Maven -D switch: 

-Dsonar.coverage.jacoco.xmlReportPaths=C:\Users\tqbao\Desktop\jacoco\jacoco.xml

Example: mvn sonar:sonar -Dsonar.login=<loginToken> -Dsonar.coverage.jacoco.xmlReportPaths=C:\Users\tqbao\Desktop\jacoco\jacoco.xml

### References
https://www.jacoco.org/jacoco/trunk/doc/cli.html

https://docs.sonarqube.org/latest/analysis/test-coverage/java-test-coverage/