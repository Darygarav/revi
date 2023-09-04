/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package canal.de.yutube;
import java.util.Scanner;
import javax.xml.validation.Validator;

/**
 *
 * @author vina
 */
public class CanalDeYutube {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cuenta cuen_1 =new cuenta();
        canal canal_1 = new canal();
        Scanner in =new Scanner(System.in);
        reglas val = new reglas();
        int op,aumen;
        boolean trigger,trigger2,trigger3,trigger4,trigger5;
        String cuenta,contra,nom_canal;
        
        do { 
            System.out.println("----- Bienvenido Youtube! -----");
            System.out.println("pasos a seguir para crear un canal:");
            System.out.println("1.-Crear un canal a una cuenta. ");
            System.out.println("2.- Mostrar la información de la cuenta.");
            System.out.println("3.- Aumentar la cantidad de suscriptores."); 
            System.out.println("4.- Validar la contraseña de la cuenta.");
            System.out.println("Precione 1 para comenzar");
            op= in.nextInt();
            trigger= val.validadorOp(op);
            switch (op) {
                case 1:
                    do {                        
                        System.out.println("---- Creando canal ----");
                        System.out.println("Ingrese su cuenta de google: ");
                        cuenta=in.next();
                        trigger2= val.validadorCuenta(cuenta);
                    } while (trigger2==false);
                        cuen_1.setCorreo_ceunta(cuenta);
                    do { 
          
                        System.out.println("Ingrese su contraseña: ");
                        contra=in.next();
                        trigger3=val.validadorContra(contra);
                        
                    } while (trigger3==false);
                        cuen_1.setContra_cuenta(contra);
                        
                    do {                        
                        System.out.println("Ingrese un nombre para su canal.");
                        nom_canal=in.next();
                        trigger4= val.validadorCanalNombre(nom_canal);
                        
                        
                    } while (trigger4==false);
                        canal_1.setNombre_canal(nom_canal);
                    System.out.println("Cuenta creada!! ");
                    
                    
                    
                    
                   
                    
                case 2:
                    System.out.println("----- Inf. de la Cuenta.-----");
                    canal_1.mostradorInfo();
                      
                case 3:
                    do {         
                        
                        System.out.println("--- Aumentar cantidad de susbs del canal ----");
                        System.out.println("ingrese la cantidad de sub. que le gustaria aumentar:");
                        aumen=in.nextInt();
                        trigger5=val.validadorSubs(aumen);
                        
                    } while (trigger5==false);
                    
                    
                    
                case 4:
                    System.out.println("---- Validando cueta ----");
                    contra2=in
                    if (cuen_1.validadorContra(contra)) {
                        System.out.println("contra. Verificada");
                        
                    }
                    break;
                case 5:
                    System.out.println("Adios!");
                    break;    
                default:
                    throw new AssertionError();
            }
            
            
            
            
        }while (trigger==false);
        // TODO code application logic here
    }
    
}
