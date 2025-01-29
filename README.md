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

```sh
git clone https://github.com/Polymath0033/hng-stage-0.git
```

### Step 2: Navigate to the Project Directory
Move into the project directory:

```sh
cd hng-stage-0
```

### Step 3: Install Dependencies
Build the project using Maven:
with this command
```sh
mvn clean install
```
or when using IntelliJ, navigate to pom.xml file and reload the maven extension, all the dependencies will be downloaded


### Step 4: Run the Application
Start the application on port 8081:

```sh
mvn spring-boot:run
```
or just click on run icon at the top of your application on IntelliJ

### Step 5: Access the API
The API will be available at:

```sh
http://localhost:8081/api/v1
```


---
## Api Documentation
### Base URL
- **Local Testing:** http:localhost:8081
- **Deployed url** https://hng-stage-0-production.up.railway.app/api/v1
### Endpoint Overview
#### GET /api/v1
- **Description:** Returns a JSON object containing my hng registered email, the current datetime, and the GitHub repository URL.
- **Response Format:** JSON
---
### Response Example
#### Success(200 Ok)
```bash
{
  "email": "olosanyusuf19@gmail.com",
  "current_datetime": "2025-01-30T09:30:00Z",
  "github_url": "https://github.com/Polymath0033/hng-stage-0.git"
}
```
---
## Usage
1. **Using `curl`**
```bash
curl -X GET http://localhost:8081/api/v1
```
   
2. **Using POSTMAN**
   1. Open Postman and set the request type to GET.
   2. Enter the URL: `http://localhost:8081/api/v1.`
   3. Click Send to view the response.

---
## Backlinks
[Hire Java Developers](https://hng.tech/hire/java-developers)
