# 💉 ImmunizationTracker - Vaccine Management System

![Java](https://img.shields.io/badge/Java-17-red?logo=java)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green?logo=spring)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue?logo=mysql)
![Docker](https://img.shields.io/badge/Docker-✓-blue?logo=docker)
![Kubernetes](https://img.shields.io/badge/Kubernetes-✓-blue?logo=kubernetes)
![Jenkins](https://img.shields.io/badge/Jenkins-CI/CD-orange?logo=jenkins)

A robust Spring Boot backend system for managing vaccination centers, appointments, doctors, and doses with full DevOps automation.


## ✨ Features

| Category              | Features                                                                 |
|-----------------------|--------------------------------------------------------------------------|
| **👥 User Management**  | Registration, profile management, appointment history                   |
| **🏥 Center Management**| Add/update vaccination locations & availability                         |
| **🩺 Doctor Portal**    | Healthcare professional onboarding & scheduling                         |
| **📅 Appointments**     | Slot booking with email/SMS reminders                                   |
| **💊 Dose Tracking**    | Record administered vaccines with batch numbers                         |
| **🔌 API Integration**  | 20+ REST APIs for seamless third-party integration                      |
| **⚙️ DevOps**          | Full CI/CD pipeline with Docker, Kubernetes, and Jenkins automation     |

## 🛠 Tech Stack

**Backend:**
- ![Java](https://img.shields.io/badge/-Java%2017-007396?logo=java) 
- ![Spring Boot](https://img.shields.io/badge/-Spring%20Boot%203.x-6DB33F?logo=springboot)
- ![MySQL](https://img.shields.io/badge/-MySQL-4479A1?logo=mysql&logoColor=white)
- ![Hibernate](https://img.shields.io/badge/-Hibernate-59666C?logo=hibernate)

**DevOps:**
- ![Docker](https://img.shields.io/badge/-Docker-2496ED?logo=docker&logoColor=white)
- ![Kubernetes](https://img.shields.io/badge/-Kubernetes-326CE5?logo=kubernetes&logoColor=white)
- ![Jenkins](https://img.shields.io/badge/-Jenkins-D24939?logo=jenkins&logoColor=white)
- ![GitHub](https://img.shields.io/badge/-GitHub-181717?logo=github)

## 🚀 Why DevOps?

| Benefit               | Description                                                                 |
|-----------------------|-----------------------------------------------------------------------------|
| **🤖 Zero Manual Deployments** | Fully automated Jenkins pipeline from code commit to production            |
| **📦 Consistency**     | Docker ensures identical environments across all stages                    |
| **⚡ Scalability**     | Kubernetes auto-scales during high traffic periods                         |
| **🔄 High Availability** | Self-healing when containers crash                                        |
| **🔒 Security**        | Isolated containers prevent environment mismatch issues                    |

## 🛠️ Setup
### Option 1: Local Development (Without DevOps)
```bash
git clone https://github.com/Abhaytomar2004/ImmunizationTracker.git
cd ImmunizationTracker
mvn clean install
# Configure src/main/resources/application.properties
mvn spring-boot:run
```
Access APIs at http://localhost:8081 🌐
### Option 2: Full DevOps Deployment
Prerequisites:

Jenkins with Docker, JDK, Maven plugins

Docker Hub account

Minikube (or cloud Kubernetes)

Steps:

Jenkins Pipeline will automatically:

Build → Test → Dockerize → Push to Docker Hub → Deploy to Kubernetes
```bash
kubectl apply -f k8s/mysql-pv.yaml
kubectl apply -f k8s/mysql-deployment.yaml
kubectl apply -f k8s/deployment.yaml
kubectl apply -f k8s/service.yaml
```
Access the live app:
```bash
kubectl get services
# Open http://<EXTERNAL-IP>:80
```
## 📂 Project Structure
ImmunizationTracker/
├── src/                 # Spring Boot source code
│   ├── main/java/       # Controllers, Services, Models
│   └── resources/       # Configuration files
├── k8s/                 # Kubernetes configurations
│   ├── deployment.yaml  # App deployment config
│   └── mysql-pv.yaml    # Persistent volume for DB
├── Dockerfile           # Docker image configuration
└── Jenkinsfile          # CI/CD Pipeline definition

## 🤝 How to Contribute
We welcome contributions! Here's how you can help:

🐛 Report Bugs: Open a GitHub issue

💡 Suggest Features: Submit a feature proposal

## 👨‍💻 Code Contributions:

Fork → Improve → Submit PR

High-priority areas:

Add GitHub Actions CI

Implement Helm charts

Enhance monitoring with Prometheus/Grafana

# 📜 License
MIT

## DevOps transforms this from a backend project into a production-grade system!
Get started by cloning the repo or deploying via Jenkins! 🚀
