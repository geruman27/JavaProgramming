package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = false;
        boolean 계란말이 = true;
        boolean 제육볶음 = false;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // 하나라도 true이면 true
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // 모두 true이면 true, 하나라도 거짓이면 false


        //AND 연산
        System.out.println((5 > 3) && (3 > 1)); // 5 는 3 보다 크고, 3 은 1 보다 크다.(true)
        System.out.println((5 > 3) && (3 < 1)); // 5는 3 보다 크고, 3은 1 보다 작다.(false)

        // OR 연산
        System.out.println((5 > 3) || (3 > 1)); // 5 는 3 보다 크거나, 3 은 1 보다 크다. (true)
        System.out.println((5 > 3) || (3 < 1)); // 5 는 3 보다 크거나, 3 은 1 보다 작다. (true)
        System.out.println((5 < 3) || (3 < 1)); // 5 는 3보다 작거나, 3 은 1 보다 작다. (false)

        //논리 부정 연산자
        System.out.println(!true); //false
        System.out.println(!false); // true

        System.out.println(!(5 == 5)); //false
        System.out.println(!(5 == 3)); //true
    }
}
