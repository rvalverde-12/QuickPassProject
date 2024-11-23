/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quickpassproject;

import javax.swing.JOptionPane;

/**
 *
 * @author Lipsky
 */
public class Menus {
 
    
     public static int MenuPrincipal() {
        return Integer.parseInt(JOptionPane.showInputDialog("""
                                                            ---Bienvenido al Menu Principal--- 
                                                            Seleccione una opcion del menu 
                                                            1- Gestion Quickpass 
                                                            2- Gestion de accesos 
                                                            3- Reportes 
                                                            4- Salir 
                                                            """));

                        
    }   
    
    
    public static int GestionQuickpass() {
        return Integer.parseInt(JOptionPane.showInputDialog("""
                                                                   ---Gestion Quickpass--- 
                                                                   Seleccione una opcion del menu
                                                                   1- Realizar Consulta 
                                                                   2- Agregar Sticker 
                                                                   3- Bloquear Sticker 
                                                                   4- Eliminar Sticker 
                                                                   5- Volver al menu principal 
                                                                   """));

    }

    
    public static int GestionAccessos() {
        return Integer.parseInt(JOptionPane.showInputDialog("""
                                                                    ---Gestion de Accessos--- 
                                                                    Seleccione una opcion del menu 
                                                                    1- Consulta por filial 
                                                                    2- Consulta por fecha 
                                                                    3- Consulta por codigo 
                                                                    4- Consulta por placa 
                                                                    5- Volver al menu principal"""));

        
    }
    
    public static int Reportes() {
        return Integer.parseInt(JOptionPane.showInputDialog("""
                                                                    ---Reportes-- 
                                                                    Seleccione una opcion del menu: 
                                                                    1- Total de Accesos Registrados 
                                                                    2- Total de Accesos por filial 
                                                                    3- Total de Quickpass registrados 
                                                                    4- Total de Quickpass Activos e Inactivos 
                                                                    5- Total de Quickpass eliminados- Volver al menu principal"""));
         
  
        
    }    
    
    
    public static int SubMenuConsulta() {
        return Integer.parseInt(JOptionPane.showInputDialog( """
                                                             ---Consulta---
                                                             Seleccione una opcion del menu:
                                                              1- Consultar todos 
                                                              2- Consultar eliminados
                                                              3- Consulta por filial 
                                                              4- Consulta por placa
                                                              5- Volver
                                                             """));
    }
    
    //esta ya no va hacer falta***
    public static int SubMenuEliminar() {
        return Integer.parseInt(JOptionPane.showInputDialog("""
                                                           ---Eliminar Sticker---
                                                           Seleccione una opcion del menu:
                                                           1- Eliminar por Codigo
                                                           2- Eliminar por Placa
                                                           3- Cancelar
                                                           """));
    }
    
}
