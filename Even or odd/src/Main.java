import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= Integer.valueOf(scanner.nextLine());
        while(true){
            if(n%2==0&&n!=0){
                System.out.println("even");
                n=scanner.nextInt();
                continue;
            }else if(n%2!=0){
                System.out.println("odd");
                n=scanner.nextInt();
                continue;
            }else if(n==0){
                break;
            }

        }
    }
}