package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
        // 이렇게되면 아래의 name , age 부분이 코드가 중복된다. 중복을 없애기위해서는
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
        // 자기자신의 생성자를 호출한다 생성자안에서만 사용가능
        this(name, age, 50);
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name= " + name + ", age= " + age + ", grade= " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }



}
