Student Management System

A console-based school management system built in Java, using core Object-Oriented Programming principles and integrated with AWS DynamoDB for cloud data persistence.

Overview

This project models a school with students, teachers, Heads of Department (HODs), and a Principal — each with their own role-based dashboard after logging in. Data (students, teachers, departments, and passwords) is saved to and loaded from Amazon DynamoDB, so the school's data persists across program runs.

Features
Full OOP class hierarchy — Person as a base class, extended by Student, Teacher, HOD, and Principal, each with role-specific behavior
Role-based login system — every person logs in with their ID and a password (default password = their ID, changeable on first login)
Role-based dashboards — each role sees a different menu:
Students view their own subject scores and GPA
Teachers view the performance of any class they're assigned to
HODs view department-wide performance, teachers, and classes
Principal views whole-school performance across all departments
Password management — forced password change on first login, synced to DynamoDB so it persists across sessions
Cloud persistence — student, teacher, and department data is saved to and loaded from DynamoDB using the AWS SDK's enhanced (object-mapping) client
Data Modeled
27 students across 3 class groups (10A – Science focus, 10B – Finance focus, 10C – Arts/Philosophy focus)
12 teachers, each teaching 1–3 subjects across Language, Science, Financials, Art, Philosophy, and Sport categories
3 departments (Sciences, Financials, Arts & Philosophy), each with its own HOD
1 Principal overseeing all departments
Tech Stack
Java (core language, OOP)
Maven (dependency management)
AWS SDK for Java v2 — DynamoDB Enhanced Client for object-to-table mapping
Amazon DynamoDB — cloud NoSQL database for persistence (Students, Teachers, and Department tables)
Architecture Notes
Domain classes (Student, Teacher, HOD, Principal, Subject, Score, ClassGroup, Department) model the real relationships between people and data in memory.
Separate flat "Record" classes (StudentRecord, TeacherRecord, DepartmentRecord) are used purely for DynamoDB storage, since the database can't store object references — only primitive fields, strings, and collections.
On startup, the program syncs any existing password changes from DynamoDB back into the in-memory objects, so a password set in a previous session is remembered.
Running the Project
Configure AWS credentials locally (aws configure) with access to a DynamoDB instance in your target region.
Ensure the following DynamoDB tables exist: Students (partition key: studentId), Teachers (partition key: teacherId), Department (partition key: departmentName).
Build and run Main.java via Maven/IntelliJ.
Log in using any student/teacher/HOD/principal ID (e.g. 101 for the first student) with their ID as the default password.
Possible Future Additions
Enroll/expel students and create new classes dynamically
A web front-end (e.g. Spring Boot REST API) as a v2 of this project
Scoped teacher dashboards (only showing classes they actually teach)
Password hashing instead of plaintext storage
