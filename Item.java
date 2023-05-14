import java.util.ArrayList;
public class Item {
//    ArrayList<Object> items = new ArrayList<>();
    String name,description,brand,solidOrLiquid;
    int price,discountPercentage;
    public static void main(String[] args){
        
    }
    public Item(){
    }
    public Item(String nam,String des,String b,String sOrL,int p,int discount){
        name=nam;
        description = des;
        brand = b;
        solidOrLiquid = sOrL;
        price = p;
        discountPercentage = discount;
    }
    void displayCatalog(ArrayList<Object> items){
        for(int i=0;i<items.size();i++){
            Object obj = items.get(i);
            Item it = (Item) obj;
            System.out.println(it.name + " : " + it.price);
        }
    }
}

