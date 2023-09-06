import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        int ans = 0;
        System.out.println("Click on X or x to stop");
        Scanner in = new Scanner(System.in);
        while (true) {
        System.out.println("Enter operator:");
        char op = in.next().trim().charAt(0);
            if (op == '+' || op == '*' || op == '/' || op == '-' || op == '%' ) {
                System.out.println("Enter 2 numbers:");
                int a = in.nextInt();
                int b = in.nextInt();
                if (op == '+') {
                    ans = a + b;
                }
                if (op == '-') {
                    ans = a - b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if (op == '/') {
                    if (b != 0)
                        ans = a / b;
                }
                if (op == '%') {
                    if (b != 0)
                        ans = a % b;
                }
            }System.out.println(ans);
            if (op == 'x' || op == 'X') {
                break;
            } else
                System.out.println("Invalid Operation");

        }
    }
}
