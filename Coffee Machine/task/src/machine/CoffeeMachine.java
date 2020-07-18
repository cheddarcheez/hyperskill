package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 550;
        int water = 400;
        int milk = 540;
        int beans = 120;
        int discup = 9;

        while(scanner.hasNextLine()) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();

            switch (action) {
                case "exit": {
                    break;
                }
                case "buy": {
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String which = scanner.nextLine();

                    switch (which) {
                        case "1": {
                            if (water >= 250 && beans >= 16 && discup > 0) {
                                balance = balance + 4;
                                water = water - 250;
                                beans = beans - 16;
                                discup--;
                                System.out.println("I have enough resources, making you a coffee!");
                                break;
                            }else{
                                System.out.println("I don't have enough resources to make you a coffee");
                                break;
                            }
                        }
                        case "2": {
                            if (water >= 350 && milk >= 75 && beans >= 20 && discup > 0) {
                                balance = balance + 7;
                                water = water - 350;
                                milk = milk - 75;
                                beans = beans - 20;
                                discup--;
                                System.out.println("I have enough resources, making you a coffee!");
                                break;
                            }else{
                                System.out.println("I don't have enough resources to make you a coffee");
                                break;
                            }
                        }
                        case "3": {
                            if (water >= 200 && milk >= 100 && beans >= 12 && discup > 0) {
                                balance = balance + 6;
                                water = water - 200;
                                milk = milk - 100;
                                beans = beans - 12;
                                discup--;
                                System.out.println("I have enough resources, making you a coffee!");
                                break;
                            }else{
                                System.out.println("I don't have enough resources to make you a coffee");
                                break;
                            }
                        }
                        case "back": {
                            break;
                        }

                    }
                    break;
                }

                case "fill": {
                    System.out.println("Write how many ml of water do you want to add:");
                    int wadd = scanner.nextInt();
                    water = water + wadd;
                    System.out.println("Write how many ml of milk do you want to add:");
                    int madd = scanner.nextInt();
                    milk = milk + madd;
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int badd = scanner.nextInt();
                    beans = beans + badd;
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int cadd = scanner.nextInt();
                    discup = discup + cadd;
                    break;
                }
                case "take": {
                    System.out.println("I gave you $" + balance);
                    balance = 0;
                    break;
                }
                case "remaining": {
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " of water");
                    System.out.println(milk + " of milk");
                    System.out.println(beans + " of coffee beans");
                    System.out.println(discup + " of disposable cups");
                    System.out.println(balance + " of money");
                    break;
                }
            }
        }

   /* public static void isitenough(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int water= Integer.valueOf(scanner.nextLine());
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milk=Integer.valueOf(scanner.nextLine());
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int beans=Integer.valueOf(scanner.nextLine());
        System.out.println("Write how many cups of coffee you will need:");
        int cups=Integer.valueOf(scanner.nextLine());
        int count=0;
        int a=water/200;
        int b=milk/50;
        int c=beans/15;
        if (a <= b) {
            if (c <= a) {
                count = c;
            } else {
                count = a;
            }
        } else {
            if (c <= b) {
                count = c;
            } else {
                count = b;
            }
        }
        int extra= cups-count;
        if(water>=cups*200&&milk>=50*cups&&beans>=15*cups&&cups==count){
            System.out.println("Yes, I can make that amount of coffee");
        }else if(water>=cups*200&&milk>=50*cups&&beans>=15*cups&&cups<count){
            System.out.println("Yes, I can make that amount of coffee (and even "+ extra +" more than that)");
        }else if(count<cups){
            System.out.println("No, I can only make "+ count+ " cup(s) of coffee");
        }
    }*/

    }
}