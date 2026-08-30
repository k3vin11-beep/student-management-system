import software.amazon.awssdk.services.dynamodb.DynamoDbClient;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbEnhancedClient;
import software.amazon.awssdk.enhanced.dynamodb.DynamoDbTable;
import software.amazon.awssdk.enhanced.dynamodb.TableSchema;
import software.amazon.awssdk.enhanced.dynamodb.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//teachers & subjects:

        Teacher Teacher1 = new Teacher("Mr G.Masiya", 902, null);
        Subject english = new Subject("English HL/FAL", Teacher1, "Language");
        Subject mechanics = new Subject("Mechanics", Teacher1, "Science");
        Subject football = new Subject("Football", Teacher1, "Sport");
        Teacher1.subjectTaught = new Subject[]{english, mechanics, football};

        Teacher Teacher2 = new Teacher("Ms L.Moji", 903, null);
        Subject french = new Subject("French int", Teacher2, "Language");
        Subject biology = new Subject("Biology", Teacher2, "Science");
        Teacher2.subjectTaught = new Subject[]{french, biology};

        Teacher Teacher3 = new Teacher("Mr T.Mashimbye", 904, null);
        Subject afrikaans = new Subject("Afrikaans HL/FAL", Teacher3, "Language");
        Subject physicalSciences = new Subject("Physical sciences", Teacher3, "Science");
        Subject athletics = new Subject("Athletics", Teacher3, "Sport");
        Teacher3.subjectTaught = new Subject[]{afrikaans, physicalSciences, athletics};

        Teacher Teacher4 = new Teacher("Mr N.Makhubele", 905, null);
        Subject spanish = new Subject("Spanish int", Teacher4, "Language");
        Subject accounting = new Subject("Accounting", Teacher4, "Financials");
        Teacher4.subjectTaught = new Subject[]{spanish, accounting};

        Teacher Teacher5 = new Teacher("Ms K.Motaung", 906, null);
        Subject italian = new Subject("Italian int", Teacher5, "Language");
        Subject art = new Subject("ART", Teacher5, "ART");
        Teacher5.subjectTaught = new Subject[]{italian, art};

        Teacher Teacher6 = new Teacher("Mr U.Ludere", 907, null);
        Subject tsonga = new Subject("Xitsonga HL/FAL", Teacher6, "Language");
        Subject history = new Subject("History", Teacher6, "Philosophy");
        Teacher6.subjectTaught = new Subject[]{tsonga, history};

        Teacher Teacher7 = new Teacher("Ms Z.Ramashidza", 908, null);
        Subject venda = new Subject("Tshivenda HL/FAL", Teacher7, "Language");
        Subject mathematics = new Subject("Mathematics", Teacher7, "Science");
        Teacher7.subjectTaught = new Subject[]{venda, mathematics};

        Teacher Teacher8 = new Teacher("Ms S.Ndzimile", 909, null);
        Subject xhosa = new Subject("Xhosa HL/FAL", Teacher8, "Language");
        Subject geography = new Subject("Geography", Teacher8, "Science");
        Teacher8.subjectTaught = new Subject[]{xhosa, geography};

        Teacher Teacher9 = new Teacher("Mr Q.Mbatha", 910, null);
        Subject zulu = new Subject("isiZulu HL/FAL", Teacher9, "Language");
        Subject dance = new Subject("Dance", Teacher9, "ART");
        Teacher9.subjectTaught = new Subject[]{zulu, dance};

        Teacher Teacher10 = new Teacher("Ms RK.Matantshane", 911, null);
        Subject sotho = new Subject("Sotho HL/FAL", Teacher10, "Language");
        Subject law = new Subject("Philosophy of Law", Teacher10, "Philosophy");
        Teacher10.subjectTaught = new Subject[]{sotho, law};

        Teacher Teacher11 = new Teacher("Ms P.Machete", 912, null);
        Subject tswana = new Subject("Tswana HL/FAL", Teacher11, "Language");
        Subject trading = new Subject("Trading fundamentals 101", Teacher11, "Financials");
        Teacher11.subjectTaught = new Subject[]{tswana, trading};

        Teacher Teacher12 = new Teacher("Mr L.Maluleke", 913, null);
        Subject music = new Subject("Music", Teacher12, "ART");
        Subject poetry = new Subject("Poetry", Teacher12, "ART");
        Subject basketball = new Subject("Basketball", Teacher12, "Sport");
        Teacher12.subjectTaught = new Subject[]{music, poetry, basketball};

        //students class 10A (Science):

        Score[] thaboScores = {
                new Score(english, 78), new Score(french, 65), new Score(mechanics, 88), new Score(physicalSciences, 76), new Score(mathematics, 73), new Score(football, 43),

        };
        Student thabo = new Student("Thabo", 101, "10A", thaboScores);

        Score[] nalediScores = {
                new Score(english, 83), new Score(french, 69), new Score(mechanics, 55), new Score(physicalSciences, 90), new Score(mathematics, 88),

        };
        Student naledi = new Student("Naledi", 102, "10A", nalediScores);

        Score[] amandaScores = {
                new Score(english, 87), new Score(french, 80), new Score(mechanics, 48), new Score(physicalSciences, 60), new Score(mathematics, 53),

        };
        Student amanda = new Student("Amanda", 103, "10A", amandaScores);
        Score[] nhlanhlaScores = {
                new Score(english, 70), new Score(french, 40), new Score(mechanics, 57), new Score(physicalSciences, 45), new Score(mathematics, 32), new Score(football, 89),

        };
        Student nhlanhla = new Student("Nhlanhla", 104, "10A", nhlanhlaScores);
        Score[] tshifhiwaScores = {
                new Score(english, 66), new Score(french, 50), new Score(mechanics, 59), new Score(physicalSciences, 33), new Score(mathematics, 67), new Score(football, 58),

        };
        Student tshifhiwa = new Student("Tshifhiwa", 105, "10A", tshifhiwaScores);
        Score[] amahleScores = {
                new Score(english, 91), new Score(french, 70), new Score(mechanics, 79), new Score(physicalSciences, 73), new Score(mathematics, 88),

        };
        Student amahle = new Student("Amahle", 106, "10A", amahleScores);
        Score[] leratoScores = {
                new Score(english, 96), new Score(french, 90), new Score(mechanics, 78), new Score(physicalSciences, 89), new Score(mathematics, 87),

        };
        Student lerato = new Student("Lerato", 107, "10A", leratoScores);
        Score[] lekeScores = {
                new Score(english, 63), new Score(french, 51), new Score(mechanics, 76), new Score(physicalSciences, 60), new Score(mathematics, 55), new Score(football, 83),

        };
        Student leke = new Student("Leke", 108, "10A", lekeScores);
        Score[] eugeneScores = {
                new Score(english, 63), new Score(french, 59), new Score(mechanics, 66), new Score(physicalSciences, 73), new Score(mathematics, 80), new Score(football, 76),

        };
        Student eugene = new Student("Eugene", 109, "10A", eugeneScores);

        //students class 10B (Finance):

        Score[] karaboScores = {
                new Score(spanish, 74), new Score(italian, 60), new Score(mathematics, 91), new Score(accounting, 82), new Score(trading, 68), new Score(basketball, 60),
        };
        Student karabo = new Student("Karabo", 110, "10B", karaboScores);

        Score[] palesaScores = {
                new Score(spanish, 88), new Score(italian, 77), new Score(mathematics, 65), new Score(accounting, 70), new Score(trading, 79),
        };
        Student palesa = new Student("Palesa", 111, "10B", palesaScores);

        Score[] sipheScores = {
                new Score(spanish, 59), new Score(italian, 66), new Score(mathematics, 77), new Score(accounting, 48), new Score(trading, 71), new Score(athletics, 90),
        };
        Student siphe = new Student("Siphe", 112, "10B", sipheScores);

        Score[] boitumeloScores = {
                new Score(spanish, 91), new Score(italian, 85), new Score(mathematics, 72), new Score(accounting, 58), new Score(trading, 80),
        };
        Student boitumelo = new Student("Boitumelo", 113, "10B", boitumeloScores);

        Score[] kagisoScores = {
                new Score(spanish, 67), new Score(italian, 54), new Score(mathematics, 58), new Score(accounting, 90), new Score(trading, 61), new Score(basketball, 71),
        };
        Student kagiso = new Student("Kagiso", 114, "10B", kagisoScores);

        Score[] refilweScores = {
                new Score(spanish, 80), new Score(italian, 72), new Score(mathematics, 84), new Score(accounting, 66), new Score(trading, 90),
        };
        Student refilwe = new Student("Refilwe", 115, "10B", refilweScores);

        Score[] mpumeScores = {
                new Score(spanish, 62), new Score(italian, 58), new Score(mathematics, 49), new Score(accounting, 55), new Score(trading, 40), new Score(athletics, 66),
        };
        Student mpume = new Student("Mpume", 116, "10B", mpumeScores);

        Score[] tumeloScores = {
                new Score(spanish, 85), new Score(italian, 79), new Score(mathematics, 90), new Score(accounting, 73), new Score(trading, 68),
        };
        Student tumelo = new Student("Tumelo", 117, "10B", tumeloScores);

        Score[] nomvulaScores = {
                new Score(spanish, 71), new Score(italian, 63), new Score(mathematics, 66), new Score(accounting, 60), new Score(trading, 77), new Score(basketball, 82),
        };
        Student nomvula = new Student("Nomvula", 118, "10B", nomvulaScores);

//students class 10C (Art/Philosophy):

        Score[] mandlaScores = {
                new Score(zulu, 69), new Score(xhosa, 55), new Score(art, 84), new Score(poetry, 71), new Score(history, 60), new Score(athletics, 75),
        };
        Student mandla = new Student("Mandla", 119, "10C", mandlaScores);

        Score[] zaneleScores = {
                new Score(zulu, 93), new Score(xhosa, 88), new Score(art, 67), new Score(poetry, 84), new Score(history, 79),
        };
        Student zanele = new Student("Zanele", 120, "10C", zaneleScores);

        Score[] tebogoScores = {
                new Score(zulu, 58), new Score(xhosa, 49), new Score(art, 63), new Score(poetry, 52), new Score(history, 70), new Score(basketball, 84),
        };
        Student tebogo = new Student("Tebogo", 121, "10C", tebogoScores);

        Score[] itumelengScores = {
                new Score(zulu, 76), new Score(xhosa, 68), new Score(art, 89), new Score(poetry, 74), new Score(history, 82),
        };
        Student itumeleng = new Student("Itumeleng", 122, "10C", itumelengScores);

        Score[] lindiweScores = {
                new Score(zulu, 84), new Score(xhosa, 70), new Score(art, 56), new Score(poetry, 66), new Score(history, 73), new Score(athletics, 68),
        };
        Student lindiwe = new Student("Lindiwe", 123, "10C", lindiweScores);

        Score[] thandoScores = {
                new Score(zulu, 65), new Score(xhosa, 60), new Score(art, 77), new Score(poetry, 58), new Score(history, 63),
        };
        Student thando = new Student("Thando", 124, "10C", thandoScores);

        Score[] onthatileScores = {
                new Score(zulu, 90), new Score(xhosa, 83), new Score(art, 71), new Score(poetry, 88), new Score(history, 92), new Score(basketball, 79),
        };
        Student onthatile = new Student("Onthatile", 125, "10C", onthatileScores);

        Score[] bonganiScores = {
                new Score(zulu, 60), new Score(xhosa, 52), new Score(art, 68), new Score(poetry, 45), new Score(history, 55),
        };
        Student bongani = new Student("Bongani", 126, "10C", bonganiScores);

        Score[] ayandaScores = {
                new Score(zulu, 78), new Score(xhosa, 65), new Score(art, 80), new Score(poetry, 69), new Score(history, 74), new Score(athletics, 88),
        };
        Student ayanda = new Student("Ayanda", 127, "10C", ayandaScores);

//class groups:

        Student[] class10AStudents = {thabo, naledi, amanda, nhlanhla, tshifhiwa, amahle, lerato, leke, eugene};
        ClassGroup group10A = new ClassGroup("10A", class10AStudents);

        Student[] class10BStudents = {karabo, palesa, siphe, boitumelo, kagiso, refilwe, mpume, tumelo, nomvula};
        ClassGroup group10B = new ClassGroup("10B", class10BStudents);

        Student[] class10CStudents = {mandla, zanele, tebogo, itumeleng, lindiwe, thando, onthatile, bongani, ayanda};
        ClassGroup group10C = new ClassGroup("10C", class10CStudents);

        //HODs:

        HOD hodSciences = new HOD("Dr W.Maluleke", 501, "Sciences");
        HOD hodFinancials = new HOD("Ms K.Simerone", 502, "Financials");
        HOD hodArts = new HOD("Ms s.Sithole", 503, "Arts & Philosophy");

//Departments:

        Teacher[] scienceTeachers = {Teacher1, Teacher2, Teacher3, Teacher7};
        ClassGroup[] scienceClasses = {group10A};
        Department scienceDept = new Department("Sciences", scienceTeachers, scienceClasses, hodSciences);

        Teacher[] financeTeachers = {Teacher4, Teacher5, Teacher7, Teacher11, Teacher12, Teacher3};
        ClassGroup[] financeClasses = {group10B};
        Department financeDept = new Department("Financials", financeTeachers, financeClasses, hodFinancials);

        Teacher[] artsTeachers = {Teacher5, Teacher6, Teacher8, Teacher9, Teacher12, Teacher3};
        ClassGroup[] artsClasses = {group10C};
        Department artsDept = new Department("Arts & Philosophy", artsTeachers, artsClasses, hodArts);

//Principal:

        Principal principal = new Principal("M M.Mdoka", 601);
        Department[] allDepartments = {scienceDept, financeDept, artsDept};


        //save to dynamodb cloud
        DynamoDbClient dynamoClient = DynamoDbClient.builder().build();
        DynamoDbEnhancedClient enhancedClient = DynamoDbEnhancedClient.builder()
                .dynamoDbClient(dynamoClient)
                .build();

        DynamoDbTable<StudentRecord> studentTable = enhancedClient.table(
                "Students", TableSchema.fromBean(StudentRecord.class));

        ClassGroup[] allClassGroups = {group10A, group10B, group10C};

        for (ClassGroup group : allClassGroups) {
            for (Student student : group.students) {
                StudentRecord existing = studentTable.getItem(Key.builder().partitionValue(String.valueOf(student.id)).build());

                StudentRecord record = new StudentRecord();
                record.setStudentId(String.valueOf(student.id));
                record.setName(student.name);
                record.setClassGroup(student.classGroup);

                Map<String, Integer> scoresMap = new HashMap<>();
                for (Score s : student.scores) {
                    scoresMap.put(s.subject.name, s.mark);
                }
                record.setScores(scoresMap);

                if (existing != null && existing.getPassword() != null) {
                    record.setPassword(existing.getPassword());
                } else {
                    record.setPassword(String.valueOf(student.id));
                }

                studentTable.putItem(record);
            }
        }

        DynamoDbTable<teacherRecord> teacherTable = enhancedClient.table(
                "Teachers", TableSchema.fromBean(teacherRecord.class));
        Teacher[] allTeachers = {Teacher1, Teacher2, Teacher3, Teacher4, Teacher5, Teacher6,
                Teacher7, Teacher8, Teacher9, Teacher10, Teacher11, Teacher12};

        for (Teacher teacher : allTeachers) {
            teacherRecord existing = teacherTable.getItem(Key.builder().partitionValue(String.valueOf(teacher.id)).build());

            teacherRecord record = new teacherRecord();
            record.setTeacherId(String.valueOf(teacher.id));
            record.setName(teacher.name);

            List<String> subjectNames = new ArrayList<>();
            for (Subject subj : teacher.subjectTaught) {
                subjectNames.add(subj.name);
            }
            record.setSubjectsTaught(subjectNames);

            if (existing != null && existing.getPassword() != null) {
                record.setPassword(existing.getPassword());
            } else {
                record.setPassword(String.valueOf(teacher.id));
            }

            teacherTable.putItem(record);
        }

        DynamoDbTable<departmentRecord> departmentTable = enhancedClient.table(
                "Department", TableSchema.fromBean(departmentRecord.class));

        Department[] allDeptsForSaving = {scienceDept, financeDept, artsDept};

        for (Department dept : allDeptsForSaving) {
            departmentRecord record = new departmentRecord();
            record.setDepartmentName(dept.departmentName);
            record.setHodName(dept.hod.name);

            List<String> teacherNames = new ArrayList<>();
            for (Teacher t : dept.teachers) {
                teacherNames.add(t.name);
            }
            record.setTeacherNames(teacherNames);

            List<String> classGroupNames = new ArrayList<>();
            for (ClassGroup cg : dept.classGroups) {
                classGroupNames.add(cg.groupName);
            }
            record.setClassGroupNames(classGroupNames);

            departmentTable.putItem(record);

        }

        //get password from dynamo after its been updated
        for (ClassGroup group : allClassGroups) {
            for (Student student : group.students) {
                StudentRecord record = studentTable.getItem(Key.builder().partitionValue(String.valueOf(student.id)).build());
                if (record != null && record.getPassword() != null) {
                    student.setPassword(record.getPassword());
                }
            }
        }

        for (Teacher teacher : allTeachers) {
            teacherRecord record = teacherTable.getItem(Key.builder().partitionValue(String.valueOf(teacher.id)).build());
            if (record != null && record.getPassword() != null) {
                teacher.setPassword(record.getPassword());
            }
        }


        Person[] allPeople = new Person[class10AStudents.length + class10BStudents.length + class10CStudents.length
                + allTeachers.length + 3 + 1]; // +3 HODs, +1 principal

        int index = 0;
        for (Student s : class10AStudents) allPeople[index++] = s;
        for (Student s : class10BStudents) allPeople[index++] = s;
        for (Student s : class10CStudents) allPeople[index++] = s;
        for (Teacher t : allTeachers) allPeople[index++] = t;
        allPeople[index++] = hodSciences;
        allPeople[index++] = hodFinancials;
        allPeople[index++] = hodArts;
        allPeople[index++] = principal;

        //login

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your ID:");
        int loginId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your password:");
        String loginPassword = scanner.nextLine();

        Person loggedInUser = null;
        for (Person p : allPeople) {
            if (p.id == loginId && p.checkPassword(loginPassword)) {
                loggedInUser = p;
                break;
            }
        }

        if (loggedInUser == null) {
            System.out.println("Login failed. Invalid ID or password.");
        } else {
            System.out.println("Welcome, " + loggedInUser.name + "!");
            if (loggedInUser.checkPassword(String.valueOf(loggedInUser.id))) {
                System.out.println("You're using your default password. Set a new one now:");
                String newPassword = scanner.nextLine();
                loggedInUser.setPassword(newPassword);
                System.out.println("Password updated.");

                if (loggedInUser instanceof Student) {
                    Student s = (Student) loggedInUser;
                    StudentRecord record = studentTable.getItem(Key.builder().partitionValue(String.valueOf(s.id)).build());
                    record.setPassword(newPassword);
                    studentTable.putItem(record);
                } else if (loggedInUser instanceof Teacher) {
                    Teacher t = (Teacher) loggedInUser;
                    teacherRecord record = teacherTable.getItem(Key.builder().partitionValue(String.valueOf(t.id)).build());
                    record.setPassword(newPassword);
                    teacherTable.putItem(record);
                } else {
                    System.out.println("(Note: password change not yet saved to the cloud for HOD/Principal.)");
                }
            }

                if (loggedInUser instanceof Student) {
                    Student self = (Student) loggedInUser;   // "cast" back to Student to access its specific fields/methods
                    boolean studentRunning = true;
                    while (studentRunning) {
                        System.out.println("\n--- Student Menu ---");
                        System.out.println("1. View my performance (all subjects + GPA)");
                        System.out.println("2. View my class group");
                        System.out.println("3. Logout");
                        int choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                self.viewMyPerformance();
                                break;
                            case 2:
                                System.out.println("You are in class: " + self.classGroup);
                                break;
                            case 3:
                                studentRunning = false;
                                break;
                            default:
                                System.out.println("Invalid option");
                                break;
                        }
                } }
                else if (loggedInUser instanceof Teacher) {
                    Teacher self = (Teacher) loggedInUser;
                    boolean teacherRunning = true;
                    while (teacherRunning) {
                        System.out.println("\n--- Teacher Menu ---");
                        System.out.println("1. View subjects I teach");
                        System.out.println("2. View a class's performance");
                        System.out.println("3. Logout");
                        int choice = scanner.nextInt();
                        scanner.nextLine(); // clear leftover newline before any String reads

                        switch (choice) {
                            case 1:
                                System.out.println("You teach: ");
                                for (Subject subj : self.subjectTaught) {
                                    System.out.println(" - " + subj.name);
                                }
                                break;
                            case 2:
                                System.out.println("Which class? (10A / 10B / 10C)");
                                String classChoice = scanner.nextLine();
                                if (classChoice.equalsIgnoreCase("10A")) {
                                    self.viewClassPerformance(group10A);
                                } else if (classChoice.equalsIgnoreCase("10B")) {
                                    self.viewClassPerformance(group10B);
                                } else if (classChoice.equalsIgnoreCase("10C")) {
                                    self.viewClassPerformance(group10C);
                                } else {
                                    System.out.println("Invalid class.");
                                }
                                break;
                            case 3:
                                teacherRunning = false;
                                break;
                            default:
                                System.out.println("Invalid option");
                        }
                    }

                } else if (loggedInUser instanceof HOD) {
                    HOD self = (HOD) loggedInUser;
                    Department myDept = null;
                    for (Department d : allDepartments) {
                        if (d.hod == self) { myDept = d; break; }
                    }

                    boolean hodRunning = true;
                    while (hodRunning) {
                        System.out.println("\n--- HOD Menu ---");
                        System.out.println("1. View department performance");
                        System.out.println("2. View teachers in department");
                        System.out.println("3. View classes in department");
                        System.out.println("4. Logout");
                        int choice = scanner.nextInt();

                        switch (choice) {
                            case 1:
                                if (myDept != null) self.viewDepartmentPerformance(myDept);
                                break;
                            case 2:
                                for (Teacher t : myDept.teachers) {
                                    System.out.println(" - " + t.name);
                                }
                                break;
                            case 3:
                                for (ClassGroup c : myDept.classGroups) {
                                    System.out.println(" - " + c.groupName);
                                }
                                break;
                            case 4:
                                hodRunning = false;
                                break;
                            default:
                                System.out.println("Invalid option");
                        }
                    }
                } else if (loggedInUser instanceof Principal) {
                    Principal self = (Principal) loggedInUser;
                    boolean principalRunning = true;
                    while (principalRunning) {
                        System.out.println("\n--- Principal Menu ---");
                        System.out.println("1. View whole school performance");
                        System.out.println("2. View a specific department");
                        System.out.println("3. Logout");
                        int choice = scanner.nextInt();
                        scanner.nextLine();

                        switch (choice) {
                            case 1:
                                self.viewSchoolPerformance(allDepartments);
                                break;
                            case 2:
                                System.out.println("Which department? (Sciences / Financials / Arts)");
                                String deptChoice = scanner.nextLine();
                                Department chosen = null;
                                for (Department d : allDepartments) {
                                    if (d.departmentName.equalsIgnoreCase(deptChoice)) {
                                        chosen = d;
                                        break;
                                    }
                                }
                                if (chosen != null) {
                                    chosen.hod.viewDepartmentPerformance(chosen);
                                } else {
                                    System.out.println("Department not found.");
                                }
                                break;
                            case 3:
                                principalRunning = false;
                                break;
                            default:
                                System.out.println("Invalid option");
                        }
                    }
                }
            }
        dynamoClient.close();

        }

        }

