// Inside Main class
public static void addStudent() {
    System.out.print("Enter ID: ");
    int id = sc.nextInt();
    System.out.print("Enter Name: ");
    String name = sc.next();
    System.out.print("Enter Grade: ");
    String grade = sc.next();
    students.add(new Student(id, name, grade));
    System.out.println("Student added successfully.");
}

static void viewStudents() {
    if (students.isEmpty()) {
    System.out.println("No students found.");
    return;
    }
    System.out.println("\n--- List of Students ---");
    for (Student s : students) {
    System.out.println(s);
    }
    }
    static void searchStudent() {
    System.out.print("Enter Student ID to search: ");
    int id = sc.nextInt();
    for (Student s : students) {
    if (s.getId() == id) {
    System.out.println("Student Found: " + s);
    return;
    }
    }
    System.out.println("Student with ID " + id + " not found.");
    }
    