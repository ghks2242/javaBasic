package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;


//        1 번쨰 배열 선언 사용법
//        Student[] students = new Student[2];
//        students[0] = student1;
//        students[1] = student2;

//        2 번쨰 배열 선언 사용법
//        Student[] students = new Student[]{student1, student2};

//        3 번쨰 배열 선언 사용법
        Student[] students = {student1, student2};

        for (int i = 0; i < students.length; i++) {
        System.out.println("이름:" + students[i].name + "나이:" + students[i].age + "성적:" + students[i].grade);
        }

        for (Student student : students) {
            System.out.println("이름:" + student.name + "나이:" + student.age + "성적:" + student.grade);
        }

    }
}
