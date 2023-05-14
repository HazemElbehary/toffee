import java.util.ArrayList;
public class Catalog {
    ArrayList<Object> items = new ArrayList<>();
    public static void main(String[] args){
        
    }
    public Catalog(ArrayList<Object> it){
        for(int i=0;i<it.size();i++){
            items.add(it.get(i));
        }
    }
    void display_catalog(){
        for(int i=0;i<items.size();i++) {
            Object obj = items.get(i);
            Item item = (Item) obj;
            System.out.println(item.name + " : " + item.price);
        }
    }
}