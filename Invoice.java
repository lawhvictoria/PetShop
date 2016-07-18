import java.util.ArrayList;

/**
 *
 * @author vhlaw
 */
public class Invoice {
    private ArrayList<Item> invoice;
    
/*    public ArrayList<Item> getInvoice()
    {
        return invoice;
    } */
    
    public Invoice()
    {
        invoice = new ArrayList<>();
    }
    
    public void add(Item anItem)
    {
        invoice.add(anItem);
    }
    
    public double getDiscount()
    {
        double discount = 0;
        boolean hasPet = false;
        
        for(Item i : invoice)
        {
//            System.out.println(i.getIsPet() + " " + i.getPrice() + " " + i.getQuantity());
            if(i.getIsPet())
            {
                hasPet = true;
            }
        }
        
        if(!hasPet || getCount() < 5)
        {
            return 0;
        }
        
        else
        {
            return getPrice() * 0.20;
        }
        
    }
    
    public int getCount()
    {
        int count = 0;
        
        for(Item i : invoice)
        {
            if(i.getIsPet() == false)
            {
                count += i.getQuantity();              
            }
        }
        return count;
    }
    
    public double getPrice()
    {
        double price = 0;
        for(Item i: invoice)
        {
            if(i.getIsPet() == false)
            {
            price += (i.getPrice() * i.getQuantity());
            }
        }
//        System.out.println(price);
        return price;
    }
    
    public double getTotalPrice()
    {
        double price = 0;
        for(Item i: invoice)
        {
            price += i.getPrice() * i.getQuantity();
        }
        return price;
    }
}
