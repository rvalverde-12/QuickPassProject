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
   
        int main_menu;
        int modulo_1;
        int modulo_2;
        int modulo_3;
        
        //Main Menu
        
        main_menu = Integer.parseInt(JOptionPane.showInputDialog("---Bienvenido al Menu Principal--- \n" + "Seleccione una opcion del menu \n" 
            + "1- Gestion Quickpass \n" + "2- Gestion de accessos. \n" + "3- Reportes \n" +"4- Salir \n"));
        
        do {
            switch(main_menu){

                case 1:  //Modulo 1         

                 modulo_1 = Integer.parseInt(JOptionPane.showInputDialog("---Gestion Quickpass--- \n" + "Seleccione una opcion del menu \n" 
            + "1- Realizar Consulta \n" + "2- Agregar Sticker \n" + "3- Bloquear Sticker \n" +"4- Eliminar Sticker \n" + "5- Volver al menu principal"));
                    break;     
                    
                case 2: //Modulo 2
                 
                 modulo_2 = Integer.parseInt(JOptionPane.showInputDialog("---Gestion de Accessos--- \n" + "Seleccione una opcion del menu \n" 
            + "1- Consulta por filial \n" + "2- Consulta por fecha \n" + "3- Consulta por codigo \n" +"4- Consulta por placa \n" + "5- Volver al menu principal"));
                    break;
                    
                case 3: //Modulo 3
                 modulo_3 = Integer.parseInt(JOptionPane.showInputDialog("---Reportes-- \n" + "Seleccione una opcion del menu \n" 
            + "1- Total de Accesos Registrados \n" + "2- Total de Accesos por filial \n" + "3- Total de Quickpass registrados \n" +"4- Total de Quickpass Activos e Inactivos \n" 
                + "5-Total de Quickpass eliminados"+ "6- Volver al menu principal"));
                    break;
                    
                case 4: 
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;
                    
                default:
                        JOptionPane.showMessageDialog(null, "Datos proporcionados incorrectos"); 
            }
         } while (main_menu < 4);
        
        
        //Test
        
        

        
        
        
        
        
        
        
        
        
    }
    
}