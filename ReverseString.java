import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        ReverseString rev = new ReverseString();
        Scanner scan = new Scanner(System.in); // can input into terminal(Scanner use)
        System.out.println("Enter String here: ");

        String word = scan.nextLine();
        System.out.println("The reverse of your String is: " + rev.reverse(word)); 
    }

    public static String reverse(String s) {
        String rev = "";
        for(int j = s.length(); j > 0; --j) {
            rev = rev + (s.charAt(j - 1));
        }
        return rev;
    }
}