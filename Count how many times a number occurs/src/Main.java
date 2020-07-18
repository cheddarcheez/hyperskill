import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int size=scanner.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scanner.nextInt();
        }
        int count=0;
        int search=scanner.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]==search){
              count++;
            }
        }
        System.out.println(count);
    }
}