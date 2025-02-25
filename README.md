
# DocAppoManager 🏥⚕️

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
![Java Version](https://img.shields.io/badge/Java-8%2B-blue)

A robust Java application for efficient management of medical appointments and patient records. Designed for healthcare providers to optimize scheduling and maintain organized patient information systems.

## 🌟 Key Features

### 👨⚕️ Doctor Management
- Create/update/delete doctor profiles
- Track specialties, consultation hours, and contact information
- View doctor availability in real-time

### 👩⚕️ Patient Management
- Maintain comprehensive patient records
- Store medical history and treatment notes
- Track appointment history and upcoming visits

### 📅 Smart Appointment System
- Intuitive scheduling interface with conflict prevention
- Automatic availability checks
- Rescheduling and cancellation features
- Daily appointment reminders (future implementation)

### 🔍 Advanced Search
- Multi-criteria search for doctors and patients
- Filter by:
  - Specialty (Cardiology, Pediatrics, etc.)
  - Availability dates
  - Patient medical history keywords

## 🚀 Getting Started

### Prerequisites
- Java JDK 8 or later
- IDE (IntelliJ IDEA recommended)
- Git (for version control)

### Installation Guide

1. Clone Repository
   ```bash
   git clone https://github.com/Niyaz-Mahmud/DocAppoManager_Simple_Java_Project.git
   cd DocAppoManager_Simple_Java_Project
   ```

2. Import Project
   - Open in your preferred IDE as existing Java project

3. Build & Run
   ```bash
   # Compile project
   javac src/*.java -d out/
   
   # Execute application
   java -cp out/ Start
   ```

## 🖥️ User Interface Walkthrough

```plaintext
=== MAIN MENU ===
1. Doctor Management
2. Patient Management
3. Appointment Scheduling
4. Search Records
5. Exit System

Enter choice: _
```

Sample Workflow:
1. Select `1` for Doctor Management
2. Choose `Add New Doctor`
3. Enter details:
   ```plaintext
   Enter doctor's name: Dr. Sarah Johnson
   Specialty: Cardiology
   Available Days (comma-separated): Mon,Wed,Fri
   ```

## 💾 Data Management

### Storage System
- Auto-generated Files:
  - `Doctors.dat` (Serialized Java objects)
  - `Patients.dat` (Serialized Java objects)
  - `Appointments.log` (CSV format)

⚠️ Important: 
- Files are created automatically in project root
- Maintain file permissions for data security
- Regular backups recommended

## 🤝 Contributing Guide

We welcome contributions! Please follow these steps:

1. Fork the repository
2. Create feature branch:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. Follow our [coding standards](CODING_STANDARDS.md)
4. Test your changes thoroughly
5. Submit pull request with detailed description

First-time contributors are encouraged to start with `good first issue` labeled tasks.

## 📜 License

MIT License - See [LICENSE.md](LICENSE.md) for full text.

## � Future Roadmap
- [ ] Web interface integration
- [ ] SMS/Email notifications
- [ ] Prescription management module
- [ ] Multi-user access control
- [ ] Statistical reporting dashboard

## 🙏 Acknowledgments
- Java OpenJDK community
- Open-source contributors
- Early beta testers from City General Hospital

---

Need Help?  
Open an issue or contact maintainers at niyazmahmud213@gmail.com
```
