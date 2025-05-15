import java.util.Scanner;

public class CoffeeShopMenu {
    public static void main(String[] args) {

        System.out.println("Well Come to SixT9 Coffee");
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            System.out.println("-- MENU --");
            System.out.println("For selection press corresponding button: ");
            System.out.println("1. Espresso");
            System.out.println("2. Latte");
            System.out.println("3. Exit");
            choice = in.nextInt();

            if(choice == 1 || choice == 2){
                System.out.println("Type True/False according to addons preferences: ");
                System.out.println("MILK: ");
                boolean milk = in.nextBoolean();
                System.out.println("SUGAR: ");
                boolean sugar = in.nextBoolean();
                System.out.println("WHIPPED CREAM: ");
                boolean whippedCream = in.nextBoolean();
                Coffee coffee;
                if(choice == 1){
                    coffee = new Espresso(milk, sugar, whippedCream);
                    System.out.println("Thanks for Ordering: Espresso!");
                }else{
                    coffee = new Latte(milk, sugar, whippedCream);
                    System.out.println("Thanks for Ordering: Latte!");
                }
                System.out.println("Add-ons: "+(coffee.getAddOns().isEmpty() ? "None" : coffee.getAddOns()));
                System.out.print("Final Cost (in ₹)\n");
                System.out.println(coffee.calculateFinalCost());

            }
        }while(choice!=3);
        System.out.println("THANK YOU FOR VISITING! HOPE TO SEE YOU AGAIN.");
        in.close();
    }
}