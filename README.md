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

## Tests
### Test suite
<img width="503" alt="image" src="https://github.com/MisterAzix/hetic-learning-unit-tests/assets/40914400/09666eaf-74f4-4b36-aa23-9a18b87a97f2">

### Coverage
<img width="613" alt="image" src="https://github.com/MisterAzix/hetic-learning-unit-tests/assets/40914400/dd9ed2e1-f798-4053-95f0-4407a2bf3778">

## Examples
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
