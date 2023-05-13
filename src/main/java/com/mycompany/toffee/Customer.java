/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.toffee;

/**
 *
 * @author Administrator
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Customer {
    String address,email,password, name;
    int phoneNumber;
    ArrayList<ArrayList<Object>> cart = new ArrayList<>();
     ArrayList<ArrayList<Object>> data = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public Customer(){
    }
//    public Customer(String add, String em, String pass, int phNum){
//        address = add;
//        email=em;
//        password=pass;
//        phoneNumber = phNum;
//    }
    
    
    void regester(){
        ArrayList<Object> dataOneUser = new ArrayList<>();
        System.out.println("Please Enter Your Name :)");
        name = sc.next();
        dataOneUser.add(name);
        System.out.println("Please Enter The Email:)");
        email = sc.next();
        dataOneUser.add(email);
        System.out.println("Please Enter The Address:)");
        address = sc.next();
        dataOneUser.add(address);
        System.out.println("Please Enter The Password:)");
        password = sc.next(); 
        dataOneUser.add(password);
        System.out.println("Please Enter The Phone Number:)");
        phoneNumber = sc.nextInt();
        dataOneUser.add(phoneNumber);
        data.add(dataOneUser);
    }
    void login(){
        System.out.println("######################");
        System.out.println(data);
        System.out.println("######################");
        System.out.println("Please Enter Your Email :)");
        String e = sc.next();
        for(int i=0;i<data.size();i++){
            String em = (String) data.get(i).get(1);
            System.out.println("######################Email");
            System.out.println(em.getClass().getSimpleName() + "\n" + e.getClass().getSimpleName());
            System.out.println("######################Email");
            if(em.equals(e)) {
                System.out.println("Please Enter Your Password :)");
                String pass = sc.next();
                String p = (String) data.get(i).get(3);
                if(p.equals(pass)) {
                    System.out.println("Data IS True :)");
                    break;
                }
            }
        }
    }
    
    
    void addPorduct(Item ite){
        ArrayList<Object> product = new ArrayList<>();
        Item it =(Item) ite;
        product.add(ite.name);
        product.add(ite.price);
        cart.add(product);
    }
     ArrayList<ArrayList<Object>> getCart(){
         return cart;
    }
}
