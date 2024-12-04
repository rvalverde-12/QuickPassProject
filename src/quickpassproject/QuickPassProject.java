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
        int modulo2;
        int subConsulta;
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
                            do {
                                subConsulta = Menus.SubMenuConsulta();
                            
                                switch (subConsulta) {
                                    case 1: // Ver todos
                                        manager.consultarTodos();
                                        break;
                                    case 2: // ver eliminados
                                        manager.consultarEliminados();
                                        break;
                                    case 3: //consultar por filial
                                        manager.consultarFilial();
                                        break;
                  
                                    case 4: // consultar por placa o codigo
                                        manager.consultarPlacaCodigo();
                                        break;
                                    case 5: //volver
                                        break;
                                    default: 
                                        JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
                                        break;
                                         }
                            } while (subConsulta != 5);
                            break;  
                           
                            
                        case 2:  // Agregar Sticker
                            manager.agregarQuickpass();
                            break;
                        case 3: //Bloquear Sticker
                            String num1 = JOptionPane.showInputDialog(null,"Ingrese codigo o placa:");
                            manager.bloquearQuickpass(num1);
                            break;
                        case 4: // Desbloquear Sticker
                            manager.desbloquearQuickpass();
                            break;
                        case 5 : // Eliminar Sticker
                            String num2 = JOptionPane.showInputDialog("Ingrese codigo o placa: ");
                            manager.eliminarQuickpass(num2);
                            break;
                        case 6: //Salir 
                            break;
                        default: 
                            JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
                            break;
                        }  
                    } while (modulo1 != 6);
                                            
                    break;     
                    
                case 2: //Modulo 2     
                    do {
                        
                        modulo2 = Menus.GestionAccessos();   
                        switch(modulo2) {
                            case 1: // Registrar acceso
                                manager.registrarAcceso();
                                break;
                            case 2: // Consulta por filial
                                manager.consultarAccesoFilial();
                                break;
                            case 3: // Consulta por fecha
                                manager.consultarPorFecha();
                                break;
                            case 4: // Consulta por codigo o placa
                                manager.consultarAccsCodigoPlaca();
                                break;
                            case 5: // Volver
                                break;
                            default:
                                JOptionPane.showMessageDialog(null,"Ingrese una opcion valida");
                        }
    
                    } while (modulo2 != 5);
                    
                    break;
                    
                case 3: //Modulo 3
                    Menus.Reportes();                    
                    break;                    
                case 4: 
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;                        
                default:
                    JOptionPane.showMessageDialog(null, "Ingrese una opcion valida"); 
            }
         } while (menuprincipal != 4);
        
        
        
        
        
        
       
        
    }
    
}