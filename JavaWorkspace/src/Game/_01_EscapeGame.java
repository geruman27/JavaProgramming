package Game;
import java.util.Scanner;
public class _01_EscapeGame {

    public class EscapeRoomGame {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("당신은 방에 갇혔습니다. 방에서 탈출하려면 열쇠를 찾아야 합니다.");
            boolean hasKey = false;
            while (true) {
                System.out.println("어디를 살펴볼까요?");
                System.out.println("1. 침대");
                System.out.println("2. 책상");
                System.out.println("3. 창문");
                System.out.println("4. 문");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("침대에서는 열쇠가 발견되지 않았습니다.");
                } else if (choice == 2) {
                    System.out.println("책상 위에 열쇠가 있습니다.");
                    hasKey = true;
                } else if (choice == 3) {
                    System.out.println("창문은 잠겨 있습니다.");
                } else if (choice == 4) {
                    if (hasKey) {
                        System.out.println("방에서 탈출에 성공했습니다!");
                        break;
                    } else {
                        System.out.println("문은 잠겨 있습니다. 열쇠가 필요합니다.");
                    }
                } else {
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
                }
            }
            scanner.close();
        }

    }
}
}}
