/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quickpassproject;
import javax.swing.JOptionPane;

/**
 *
 * @author Lipsky
 */
public class QuickPassProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        int menuprincipal;
        menuprincipal = Menus.MenuPrincipal();
       
       
        //Menu Principal
        
        do {     
            switch(menuprincipal) {

                case 1:  //Modulo 1         

                    Menus.GestionQuickpass();                         
                    break;     
                    
                case 2: //Modulo 2
                 
                    Menus.GestionAccessos();
                    break;
                    
                case 3: //Modulo 3
                    Menus.Reportes();                    
                    break;
                    
                case 4: 
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;    
                    
                default:
                    JOptionPane.showMessageDialog(null, "Datos proporcionados incorrectos"); 
            }
         } while (Menus.MenuPrincipal() != 4);
        
        
        //Test
        
        

        
        
        
        
        
        
        
        
        
    }
    
}