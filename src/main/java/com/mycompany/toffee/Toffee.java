/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.toffee;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class Toffee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Registeration_and_login obj = new Registeration_and_login();
        String name,email,address,password;
        int phoneNumber;
        int proc=0;
        while(proc != -1){
            System.out.println("Hello Ya User Ya Happepy :)");
            System.out.println("if You Want Regester Write 1\nif You Want Log In Write 2\nif You Want Exit Write -1");
            proc = sc.nextInt();
            if(proc==1) {
               obj.regester();
            }
            else if (proc == 2) {
               obj.login();
            }
            else if(proc == -1) {
                break;
            }
        }
    }
}
