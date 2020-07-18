import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String first= scanner.nextLine();
        String second=scanner.nextLine();
        String fnew=first.replaceAll(" ","");
        String snew=second.replaceAll(" ","");
        if(fnew.equals(snew)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}