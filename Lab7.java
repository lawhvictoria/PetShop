import java.util.Scanner;

/**
 *
 * @author vhlaw
 */
public class Lab7 {
    public static void main(String[] args) {
        Invoice inv = new Invoice();
        
        Scanner scan = new Scanner(System.in);
        double price = 0;
        boolean isPet;
        
        while(true){
            System.out.println("Enter the Price: (Enter -1 if you are done)");
            price = scan.nextDouble();
            
            if(price == -1) break;
        
            System.out.println("Enter the quantity: ");
            int quantity = scan.nextInt();
        
            System.out.println("Is it a pet? (Y/N) ");
            String res = scan.next();
            if(res.equalsIgnoreCase("Y"))
            {
                isPet = true;
            }
            else
            {
                isPet = false;
            }
            
            Item i = new Item(price, isPet, quantity);
            inv.add(i);
        } 
        
        double v = inv.getDiscount();
        double tp = inv.getTotalPrice();
        double fp = tp - v;
        System.out.println("The total price before the discount is: $" + tp);
        System.out.println("You saved a total of: $" + v);
        System.out.println("The final price of your purchase is: $" + fp);
    }
}
