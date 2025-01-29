# HNG12 Stage 0 Backend API

Welcome to the **HNG12 Stage 0 Backend API**! This API was created as part of the HNG12 internship Stage 0 task and is designed to return basic information in JSON format. 

---

## Features

- **Endpoint:** Provides a single GET endpoint.
- **Dynamic Timestamp:** The current datetime is dynamically generated in ISO 8601 UTC format.
- **CORS Support:** Allows cross-origin requests for flexibility.
- **Deployed Endpoint:** Hosted on a publicly accessible URL for easy access.

---

## Prerequisites

Ensure the following tools are installed:

1. **Java 17** or later
2. **Maven** for dependency management and build
3. **Git** for cloning the repository

---

## Setup Instructions

Follow these steps to clone, build, and run the project locally:

### Step 1: Clone the Repository

Use the command below to clone the project from GitHub:

```bash
git clone https://github.com/Polymath0033/hng-stage-0.git
```

### Step 2: Navigate to the Project Directory
Move into the project directory:

```bash
cd hng-stage-0
```

### Step 3: Install Dependencies
Build the project using Maven:
with this command
```bash
mvn clean install
```
or when using IntelliJ, navigate to pom.xml file and reload the maven extension, all the dependencies will be downloaded


### Step 4: Run the Application
Start the application on port 8081:

```bash
mvn spring-boot:run
```
or just click on run icon at the top of your application on IntelliJ

### Step 5: Access the API
The API will be available at:

```bash
http://localhost:8081/api/v1
```


---
## Api Documentation
### Endpoint


