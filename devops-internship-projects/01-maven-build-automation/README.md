# Build Automation Using Maven

## Overview

This project demonstrates how to automate the build process of a Java application using Apache Maven. Maven simplifies dependency management, code compilation, testing, and packaging through a standardized project structure and lifecycle. In this project, a simple Java application is created, external dependencies are managed using the Maven `pom.xml` file, and the application is packaged into an executable JAR file.

---

## Objectives

* Understand the basic workflow of build automation using Apache Maven
* Create a standard Maven project using an archetype template
* Learn how Maven manages dependencies using the `pom.xml` configuration file
* Compile and package a Java application using Maven lifecycle commands
* Generate a deployable JAR artifact from the source code

---

## Tools & Technologies

* Java (JDK 17)
* Apache Maven
* Apache Commons Lang
* Linux / WSL Environment

---

## Prerequisites

Ensure the following tools are installed:

* Java JDK 17
* Apache Maven
* Linux / WSL environment

Verify installations:

```bash
java -version
mvn -version
```

---

## Project Workflow

```
Java Source Code
      ↓
Maven Build Process
      ↓
Compile Source Code
      ↓
Run Tests
      ↓
Package Application
      ↓
Generate Executable JAR
```

---

## Project Structure

```
maven-demo
│
├── pom.xml
├── src
│   ├── main/java
│   │   └── com/devops/app/App.java
│   └── test/java
│
└── target
```

---

## Setup Instructions

### 1. Generate Maven Project

```bash
mvn archetype:generate \
-DgroupId=com.devops.app \
-DartifactId=maven-demo \
-DarchetypeArtifactId=maven-archetype-quickstart \
-DinteractiveMode=false
```

### 2. Navigate to Project

```bash
cd maven-demo
```

### 3. Build the Application

```bash
mvn clean package
```

---

## Maven Commands Used

| Command             | Purpose                      |
| ------------------- | ---------------------------- |
| `mvn clean`         | Remove previous build files  |
| `mvn compile`       | Compile Java source code     |
| `mvn test`          | Run unit tests               |
| `mvn package`       | Package application into JAR |
| `mvn clean package` | Clean and build the project  |

---

## Build Output

After running the build command, Maven generates the following artifact:

```
target/maven-demo-1.0-SNAPSHOT.jar
```

This executable JAR contains the application code and required dependencies.

---

## Running the Application

Run the packaged JAR file using:

```bash
java -jar target/maven-demo-1.0-SNAPSHOT.jar
```

Example output:

```
Original: '  DevOps Maven Project  '
Trimmed: 'DevOps Maven Project'
Length: 21
Message is long
```

---

## Key Learnings

* Maven standard project structure
* Dependency management using `pom.xml`
* Maven lifecycle phases
* Creating executable JAR files
* Using Maven plugins to manage build artifacts

---

## Challenges Faced

**Java Version Compatibility**

The default Maven configuration used an unsupported Java version. This was resolved by specifying Java 17 in the `pom.xml`.

**Runtime Dependency Error**

The application initially failed due to missing runtime dependencies. This was resolved by configuring the Maven Shade Plugin to generate a fat JAR.

---

## Future Improvements

* Integrate Maven builds into a Jenkins CI pipeline
* Containerize the application using Docker
* Deploy using Kubernetes
* Implement monitoring with Prometheus and Grafana

---

## Conclusion

This project demonstrated how Apache Maven automates the build process of Java applications. By using Maven lifecycle commands and dependency management, the application was successfully compiled, tested, and packaged into a deployable artifact. This forms the foundation for CI/CD pipelines in modern DevOps workflows.
