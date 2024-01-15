package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;
    }

    // this 는 생략할수있다 이경우 변수를 찾을때 가까운 지역변수(매개변수도 지역변수이다) 를 먼저 찾고 없으면 그다음으로 맴버변수를 찾는다 맴버변수도 없으면 오류를 뱉는다.
}
