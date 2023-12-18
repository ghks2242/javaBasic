package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름:" + student1.name + "나이:" + student1.age + "성적:" + student1.grade);
        System.out.println("이름:" + student2.name + "나이:" + student2.age + "성적:" + student2.grade);

        /*
        * 객체는 클레스에서 정의한 속성과 기능을 가진 실체 ex) Student
        * 인스턴스는 특정 클래스로부터 생성된 객체를 의미 ex) student1, student2
        * */

    }
}
