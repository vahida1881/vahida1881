import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i == 0 && s.charAt(i) != ' ') {
                count++;
            } else if (s.charAt(i) != ' ' && s.charAt(i - 1) == ' ') {
                count++;
            }
        }

        System.out.println("Number of words: " + count);
        sc.close();
    }
}
