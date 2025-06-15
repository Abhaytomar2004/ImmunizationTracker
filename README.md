ImmunizationTracker - Vaccine Management System
=============================================

A Spring Boot backend system for managing vaccination centers, appointments, doctors, and doses with full DevOps automation (Docker, Kubernetes, Jenkins CI/CD).

Features
--------
- User Management: Register & track vaccine appointments
- Doctor Management: Healthcare professional onboarding
- Vaccination Centers: Add/update locations & availability
- Appointment Booking: User slot booking with reminders
- Dose Tracking: Record administered vaccines
- 20+ REST APIs: Seamless third-party integration
- DevOps Automation: CI/CD, Containerization, Kubernetes

Tech Stack
----------
Backend:
- Language: Java 17
- Framework: Spring Boot 3.x
- Database: MySQL (Hibernate/JPA)
- Build Tool: Maven

DevOps & Deployment:
- Containerization: Docker
- Orchestration: Kubernetes (Minikube)
- CI/CD: Jenkins
- Version Control: Git/GitHub
- API Testing: Postman

Why DevOps?
----------
- Zero Manual Deployments: Fully automated Jenkins pipeline
- Consistency: Docker ensures identical environments
- Scalability: Kubernetes auto-scales during high traffic
- High Availability: Self-healing if containers crash
- Security: Isolated containers, no environment mismatch issues

Setup
-----

Option 1: Local Development (Without DevOps)
1. git clone https://github.com/Abhaytomar2004/ImmunizationTracker.git
2. cd ImmunizationTracker
3. mvn clean install
4. Configure src/main/resources/application.properties
5. mvn spring-boot:run
6. Access APIs at http://localhost:8081

Option 2: Full DevOps Deployment
Prerequisites:
- Jenkins (+ Docker, JDK, Maven plugins)
- Docker Hub account
- Minikube (or cloud Kubernetes)

Steps:
1. Jenkins Pipeline will automatically:
   - Build → Test → Dockerize → Push to Docker Hub → Deploy to Kubernetes
2. Kubernetes Commands:
   kubectl apply -f k8s/mysql-pv.yaml
   kubectl apply -f k8s/mysql-deployment.yaml
   kubectl apply -f k8s/deployment.yaml
   kubectl apply -f k8s/service.yaml
3. Access the live app:
   kubectl get services
   Open http://<EXTERNAL-IP>:80

Project Structure
----------------
ImmunizationTracker/
├── src/                 # Spring Boot code
│   ├── main/java/       # Controllers, Services, Models
│   └── resources/       # Configs
├── k8s/                 # Kubernetes YAMLs
│   ├── deployment.yaml  # App config
│   └── mysql-pv.yaml    # DB storage
├── Dockerfile           # Docker image
└── Jenkinsfile          # CI/CD Pipeline

How to Contribute
-----------------
1. Report Bugs: Open a GitHub issue
2. Suggest Features: Submit a proposal
3. Code Contributions:
   - Fork → Improve → Submit PR
   - Areas needing work:
     - Add GitHub Actions CI
     - Implement Helm charts
     - Enhance monitoring

DevOps transforms this from a backend project into a production-grade system!
Get started by cloning the repo or deploying via Jenkins!
