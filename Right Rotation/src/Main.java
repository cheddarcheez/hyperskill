import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        String[] newArray = new String[arr.length];
        int move = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            newArray[(i + move % arr.length) % arr.length] = arr[i];
        }
        for (String item : newArray) {
            System.out.print(item + " ");
        }
    }
}