/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.toffee;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Toffee {
    public static void main(String[] args) {
//Start add items in arrayList of items   
ArrayList<Object> items = new ArrayList<>();
    Item item1 = new Item("item1","this is item1","fruit","solid",10,0);
    items.add(item1);
    Item item2 = new Item("item2","this is item2","fruit","solid",20,0);
    items.add(item2);
    Item item3 = new Item("item3","this is item3","fruit","solid",30,0);
    items.add(item3);
    Item item4 = new Item("item4","this is item4","fruit","solid",40,0);
    items.add(item4);
    Catalog catalog = new Catalog(items);
    ArrayList<Object> items2 = new ArrayList<>();
    Item item12 = new Item("item12","this is item1","fruit","solid",10,0);
    items2.add(item12);
    Item item22 = new Item("item22","this is item2","fruit","solid",20,0);
    items2.add(item22);
    Item item32 = new Item("item32","this is item3","fruit","solid",30,0);
    items2.add(item32);
    Item item42 = new Item("item42","this is item4","fruit","solid",40,0);
    items2.add(item42);
    Catalog catalog2 = new Catalog(items2);
//        Item item = new Item();
//End add items in arrayList of items   
        Orders orders = new Orders();
        Scanner sc = new Scanner(System.in);
        Customer obj = new Customer();
        String name,email,address,password;
        int phoneNumber;
        int proc=0;
        while(proc != -1){
            System.out.println("Hello Ya User Ya Happepy :)");
            System.out.println("if You Want Regester Write 1\nif You Want Log In Write 2\nif you want to display all items write 3\nif You Want Exit Write -1");
            proc = sc.nextInt();
            if(proc==1) {
               obj.regester();
            }
            else if (proc == 2) {
               Scanner scan = new Scanner(System.in);
               obj.login();
               catalog2.display_catalog();
               Customer cust1 = new Customer();
               System.out.println(obj.name+" Please choose the products you want and when finish write -1");
               int num=0;
               while(num!=-1){
                   num=scan.nextInt();
                   if(num==-1)
                       break;
                   System.out.println("you choose product number : " + (num-1));
                   Item it = (Item) items.get(num-1);
                   cust1.addPorduct(it);
               }
               ArrayList<ArrayList<Object>> prod = new ArrayList<>();
               prod = cust1.getCart();
               int pri = 0;
               for(int i=0;i<prod.size();i++){
                   pri+=(int) prod.get(i).get(1);
               }
               System.out.println("Your Total Price = " + pri);
               ArrayList<Object> order = new ArrayList<>();
               order.add(obj.name);
               order.add(pri);
               orders.AddOrder(order);
               System.out.println("Your order in the way :)");
            }
            else if (proc == 3) {
               catalog2.display_catalog();
            }
            else if(proc == -1) {
                break;
            }
        }
    }
}
