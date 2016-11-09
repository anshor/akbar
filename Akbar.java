/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akbar;

/**
 *
 * @author TOSHIBA
 */
public class Akbar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //instance
        mamalia ml=new mamalia();
        
        System.out.println(ml.darat());
        System.out.println(ml.air());
        System.out.println(ml.udara());
        
    }
    
}
class mamalia {
    public String darat (){
        return"manusia,primata";
        
    }
    public String air (){
        return"paus,pari";
    }
    public String udara (){
        return"kelelawar";
    }
    
}