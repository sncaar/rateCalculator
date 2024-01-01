import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price, totalPrice, ratePrice, rate;

        System.out.print("Please enter price:");
        price = input.nextDouble();


        if (500 >= price && price >= 0) {
            rate = 18;
            System.out.println("Rate amount: %" + rate);
            ratePrice = price * (rate / 100);
            System.out.println("Rate Price: " + ratePrice);
            totalPrice = price + ratePrice;
            System.out.println("Total Price: " + totalPrice);
        }
        else {
            rate = 8;
            System.out.println("Rate amount: %" + rate);
            ratePrice = price * (rate / 100);
            System.out.println("Rate Price: " + ratePrice);
            totalPrice = price + ratePrice;
            System.out.println("Total Price: " + totalPrice);
        }
    }
}
