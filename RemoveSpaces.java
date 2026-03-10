import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String res = ""; // initialize as empty string

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                res += s.charAt(i);
            }
        }

        System.out.print(res);
        sc.close();
    }
}
