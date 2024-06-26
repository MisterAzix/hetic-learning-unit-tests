# 🧪 HETIC Learning Unit Tests 🧪

## Compile and run the project

1. Compile the project with Maven

```bash
mvn package
```

2. Run the JAR file

```bash
java -jar target/hetic-learning-unit-tests-1.0-SNAPSHOT-jar-with-dependencies.jar
```

### Examples

### Examples
```bash
java -jar target/hetic-learning-unit-tests-1.0-SNAPSHOT-jar-with-dependencies.jar 5 3 +
```
-> 8
```bash
java -jar target/hetic-learning-unit-tests-1.0-SNAPSHOT-jar-with-dependencies.jar 5 3 -
```
-> 2
```bash
java -jar target/hetic-learning-unit-tests-1.0-SNAPSHOT-jar-with-dependencies.jar 5 3 "*"
```
-> 15
```bash
java -jar target/hetic-learning-unit-tests-1.0-SNAPSHOT-jar-with-dependencies.jar "*" 3 5
```
-> You must provide 3 arguments: two numbers and an operator (<number> <number> <operator>)

## 👤️ Authors 👤

- Maxence BREUILLES ([@MisterAzix](https://github.com/MisterAzix))<br />