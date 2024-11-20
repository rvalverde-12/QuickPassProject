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
        int modulo1;
        QuickpassManager manager = new QuickpassManager();
        
 
       
        //Menu Principal
        
        do {     
            menuprincipal = Menus.MenuPrincipal();
            switch(menuprincipal) {

                case 1:  //Modulo 1   - Gestion       
                    do {             
                        modulo1 = Menus.GestionQuickpass(); //para evitar bucle infinito
                        switch (modulo1) {

                        case 1: //Consultas
                            manager.consultarTodos();
                            break;   
                        case 2:  // Agregar Sticker
                            String filial = JOptionPane.showInputDialog("Ingrese la filial: ");
                            String codigo = JOptionPane.showInputDialog("Ingrese el codigo: ");
                            String placa = JOptionPane.showInputDialog("Ingrese la placa: ");
                            manager.agregarQuickpass(filial, codigo, placa);
                            
                            break;
                        case 3: //Bloquear Sticker
                            // Ingresar accion
                            break;
                        case 4: // Eliminar Sticker
                            // Ingresar accion
                            break;
                        case 5 : //Salir
                            break;
                        default: 
                            JOptionPane.showMessageDialog(null, "Ingrese una opcion valida: ");
                            break;
                        }  
                    } while (modulo1 != 5);
                                            
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
         } while (menuprincipal != 4);
        
        
        
        
        
        
        
        
    }
    
}