import java.util.Scanner;

import static java.lang.StrictMath.pow;

class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String shape=scanner.nextLine();
        double area=0;
        switch(shape){
            case "triangle":{
                double a=scanner.nextDouble();
                double b=scanner.nextDouble();
                double c=scanner.nextDouble();
                double s=(a+b+c)/2;
                area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println(area);
                break;
            }
            case "rectangle":{
                int a=scanner.nextInt();
                int b=scanner.nextInt();
                area=a*b;
                System.out.println(area);
                break;
            }
            case "circle":{
                int r=scanner.nextInt();
                area=3.14*r*r;
                System.out.println(area);
                break;
            }
        }
    }
}