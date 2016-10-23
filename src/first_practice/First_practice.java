/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_practice;

/**
 *
 * @author Sajib
 */
public class First_practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("welcome to java");
        System.out.println("welcome to computer science");
        System.out.println("programming is fun ");
        First_practice a=new First_practice();
        a.display();
        a.designe();
        a.second_designe();
        a.math();
    }
   public  void display (){
       for(int a=0;a<4;a++){
           System.out.println("welcome to java");   
       }
   } 
   public void designe(){
         System.out.println    ("    J              A       V     V          A  ");
         System.out.println    ("    J             A A       V   V          A A ");
         System.out.println    ("J   J            AAAAA       V V          AAAAA");
         System.out.println    (" J J            A     A       V          A     A");
                                  
   }
    public void second_designe(){
         System.out.println    ("a      a^2     a^3");
         System.out.println    ("1      1       1");
         System.out.println    ("2      4       8");
         System.out.println    ("3      9       27");
         System.out.println    ("4      16      64");
    }
    public void math(){
        System.out.println(((9.5*4.5)-(2.5*3))/(45.5-3.5));
    }
}
