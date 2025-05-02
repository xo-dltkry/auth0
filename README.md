# Implementation: Auth0 Java Spring Boot Microservices Tutorial  
**Student:** [Dauletkerey Kelgenbay]  
**Branch:** [auth0]    

---

## Project Overview

This project is a practical implementation of the Auth0 tutorial on Java Spring Boot microservices architecture. The goal was to build a secure, modular, and scalable backend system composed of multiple independently running services. Each service handles a specific responsibility and communicates with others via HTTP. The project follows best practices in authentication, service discovery, and API gateway routing, using Auth0 for secure token-based access control.

The implementation includes services such as `user-service`, `product-service`, and a centralized `gateway-service` for routing traffic. All services are registered with a `eureka-server`, enabling dynamic discovery. The application is built and run using Maven and IntelliJ IDEA.

---

## Key Concepts Implemented

- **Microservice Architecture:** The system is divided into self-contained services that run independently on different ports.
- **Service Discovery:** Implemented using Spring Cloud Netflix Eureka. All services are registered with Eureka for dynamic resolution.
- **API Gateway:** Spring Cloud Gateway is used to route external requests to internal services securely and efficiently.
- **OAuth2 Authentication:** Integrated Auth0 as the identity provider. Configured Spring Security and OAuth2 in `application.yml` to protect endpoints.
- **Token Validation:** Services use JWT tokens for authentication, ensuring secure communication.
- **Role-Based Access Control (RBAC):** Applied basic role restrictions on protected routes.

---

## Unique Feature/Modification

A custom filtering endpoint was added to the `product-service` to allow clients to retrieve products by category via query parameters. This addition demonstrates extensibility beyond the tutorial’s base functionality. It includes:

- A new REST endpoint: `/products?category=electronics`
- Updated service logic to filter products from an in-memory list (or database)
- Gateway routing update to expose this endpoint externally

This feature enhances the user experience by enabling more precise data access and supports real-world application use cases.

---

## Build & Run Instructions

### Prerequisites:
- Java 17+
- Maven 3.6+
- IntelliJ IDEA (recommended)
- Docker (optional, for Auth0 emulator or database containers)

### Steps:
1. Clone the repository:
   ```bash
   git clone https://github.com/IITU-Software-Engineering-Labs/2110.git
   cd 2110
   git checkout [Your GitHub Branch Name]
