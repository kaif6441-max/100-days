import java.util.Scanner;

class LengthofLastWord {

    public int LengthOfLastWord(String s) {
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int count = 0;

        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        LengthofLastWord obj = new LengthofLastWord();

        int result = obj.LengthOfLastWord(s);

        System.out.println("Length of last word: " + result);

        sc.close();
    }
}