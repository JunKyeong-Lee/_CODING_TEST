package _1006;

public class Main {
    public static void main(String[] args) {
        System.out.println("\"!@#$%^&*()\"");
    }
}
/*
 * println 의 경우 %f 와 같은 포맷 지정자 방식이 아니다.
 * 그래서 포맷 지정자 방식에서의 % 그 자체를 의미하는
 * %% 로 쓰지 않는다.
 *
 * 대신 \n 같은 \가 붙은건 이스케이프 문자인데.
 * 이것은 여전히 사용하기 때문에 \\ 로 써줘야 \ 그 자체가 나온다.*/
