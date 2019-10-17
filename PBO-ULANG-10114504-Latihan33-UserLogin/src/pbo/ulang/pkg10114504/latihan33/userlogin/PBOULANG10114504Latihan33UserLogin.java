/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan33.userlogin;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI:Program Ini berisi user login
 */
public class PBOULANG10114504Latihan33UserLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UserLogin login = new UserLogin();
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukan User Name\t:");
        String user = scan.next();
        System.out.print("Masukan Password\t:");
        String password = scan.next();
        System.out.println("");
        
        login.pengecekanLogin(user, password);
    }
    
}
