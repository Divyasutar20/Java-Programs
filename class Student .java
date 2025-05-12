class Student {
    int studentId;
    String studentName;
    char grade;

    Student() {
        this(1, "John", 'A'); // default values
    }

    Student(int id, String name, char g) {
        studentId = id;
        studentName = name;
        grade = g;
    }

    void show() {
        System.out.println(studentId + " " + studentName + " " + grade);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.show();
    }
}
