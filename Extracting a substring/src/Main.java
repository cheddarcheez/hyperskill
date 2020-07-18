import java.util.Scanner;

class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        int begin = scanner.nextInt();
        int end = scanner.nextInt();

        System.out.println(word.substring(begin, end + 1));
    }
}