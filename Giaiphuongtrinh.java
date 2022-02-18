/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package giaiphuongtrinh;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class Giaiphuongtrinh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    try {
        Scanner sc=new Scanner(System.in);
       System.out.println("moi nhap a");
        Double a=sc.nextDouble();
       System.out.println("moi nhap b");
        Double b=sc.nextDouble();
        if(a==0&&b==0){
            System.out.println(" phuong trinh vo so nghiem");}
        else
        if(a==0&&b!=0){System.out.println("phuong trinh vo nghiem");}
            
         else{System.out.println("phuong trinh co nghhiemlà x="+(-b/a));}
        
    }catch(Exception e){System.out.println("nhap sai");}
    }
    
    
    }
    

