import java.util.List;
import java.util.ArrayList;

class Inventory{
    public static void main(String[]args){
        System.out.println("Renalyn's Sotre");
        List<Item> prod = new ArrayList();
        float total = 0.0f;

        Item a1 = new Item("VFresh", "Candy", 1.00f);
        Item c2 = new Item("Carefree", "Pantyliner", 7.00f);
        Item b2 = new Item("Breeze", "Detergent", 6.00f);
        Item e4 = new Item("Wings", "Detergent", 6.00f);
        Item d5 = new Item("Star Wax", "Floorwax", 12.00f);
       

        inv.add(a1);
        inv.add(c2);
        inv.add(b2);
        inv.add(e4);
        inv.add(d5);
      
        for(Item p: inv){
           
           if(e.Getname()=="Detergent"){
                System.out.println("Item found!");
            }
            
            else{
                System.out.println("Item not found!");
            }
            total = total + e.Getprice();
        }
        
        System.out.println(total);
    }
}
