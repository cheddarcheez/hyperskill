import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        long first=scanner.nextLong();
        String sign= scanner.next();
        long second=scanner.nextLong();
        switch(sign){
            case "+":{
                System.out.println(first+second);
                break;
            }
            case "-":{
                System.out.println(first-second);
                break;
            }
            case "/":{
                if(second==0){
                    System.out.println("Division by 0!");
                    break;
                }else{
                    System.out.println(first/second);
                    break;
                }
            }
            case "*":{
                System.out.println(first*second);
                break;
            }
            default:{
                System.out.println("Unknown operator");
                break;
            }
        }
    }
}