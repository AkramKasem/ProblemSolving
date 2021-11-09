/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Advanced.Security;
import java.util.Scanner;
/**
 *
 * @author akram
 * 
 * 
 * @body 
 * 
 */
public class Security {



    public static void main(String[] args) {
        // TODO code application logic here
      
        String array [][] ={{"A","K","U","0"},{"B","L","V","1"},{"C","M","W","2"},{"D","N","X","3"},{"E","O","Y","4"},
                            {"F","P","Z","5"},{"G","Q",".","6"},{"H","R"," ","7"},{"I","S","!","8"},{"J","T","_","9"}};
        
        String All = ""  ;
        Scanner s =new Scanner(System.in);
        
        System.out.print("enter numbers : ");
        String all = s.nextLine();
        
        String item [] = all.split(" ");
        
        
        
        for (int i = 0; i < item.length; i++) {
            int num_normal = Integer.parseInt(item[i]);
            String num_binary_reverse = "" ;
//            System.out.println(item[i]);
            
            String num_binary = Integer.toBinaryString(num_normal);
            
//            System.out.println(num_binary);
            
            for (int j = 0; j < num_binary.length(); j++) {
                if (num_binary.charAt(j)=='0') {
                    num_binary_reverse = num_binary_reverse +'1'; 
                }
                if (num_binary.charAt(j)=='1') {
                    num_binary_reverse = num_binary_reverse +'0'; 
                }   
            } 
//            System.out.println(num_binary_reverse);
            String num_least =num_binary_reverse.substring(num_binary_reverse.length()-2);
            int num_Lest = Integer.parseInt(num_least,2);
//            System.out.println(num_Most);
//            System.out.println(num_most);

            String num_Four =num_binary_reverse.substring(0,4);
            int num_four = Integer.parseInt(num_Four,2);

//            System.out.println(num_Four);
//            System.out.println(num_four);

            String finish =array[num_four][num_Lest];
            
            All = All +finish;
        }
        System.out.println(All);
    }
    
}
