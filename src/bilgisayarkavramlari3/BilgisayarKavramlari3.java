/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilgisayarkavramlari3;

/**
 *
 * @author maytemur
 * break ve continue kavramlari
 * break ve continue kavramlarının kullanılmasının yasak olduğu kod standarlarıda vardır! 
 */
public class BilgisayarKavramlari3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i==5){
               // break;   //for döngüsünü kırar ve 5 de çıkar
               continue;   //5 değerini atla döngüye devam et
            }
            System.out.println(i);            
        }
        System.out.println("Her Zaman");
    }    
}
