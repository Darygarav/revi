/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canal.de.yutube;

/**
 *
 * @author vina
 */
public class reglas {
    
    public boolean validadorOp(int num){
        if (num>=1 && num<=5) {
          return true;  
        }else {
           return false;
        }
            
        
        
    }
    
    
    
     public boolean validadorCuenta(String nom){
        if (nom.length()>=1 && nom.length()<=100) {
          return true;  
        }else {
           return false;
           
           
        }
           
     }
    
     
     
     public boolean validadorContra(String nom){
        if (nom.length()>=6 && nom.length()<=10 ) {
          return true; 
        }else {
           return false;}
     }
     
      public boolean validadorCanalNombre(String nom){
        if (nom.length()>=3  ) {
          return true; 
        }else {
           return false;}
     }
     
     
}
