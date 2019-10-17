/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan33.userlogin;

/**
 *
 * @author
 * NAMA     : Sandy Akbar
 * KELAS    : PBO-Ulang
 * NIM      : 10114504
 * DESKRIPSI:Program Ini berisi class user login
 */
public class UserLogin {
    private final String username = "Sandy akbar";
    private final String password = "123456789";
    private boolean statusAkun;

    private boolean cekAkun(String username, String password){
        statusAkun = this.username.equals(username) && this.password.equals(password);
       
        return statusAkun;
    }
    
    private void hasilLogin(boolean statusAkun, String username){
        this.cekAkun(username, password);
        statusAkun = this.statusAkun;
        if (statusAkun == true){
            System.out.println("*****HALLO " + username.toUpperCase()+"*****");
            System.out.println("Selamat Datang Di Aplikasi Ini");
            }
        else {
            System.out.println("Opppss. Username atau Password Anda Salah");
        }
    }    
    public void pengecekanLogin(String username, String password){
        this.cekAkun(username, password);  
        this.hasilLogin(statusAkun, username);
    
    
}
