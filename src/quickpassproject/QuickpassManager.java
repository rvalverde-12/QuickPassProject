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
    public class QuickpassManager {
    private Quickpass[] quickpassLista = new Quickpass[20]; //tamaño maximo se puede ampliar a mas de ser necesario
    private int contador = 0;
    private int contadorEliminados = 0;
    
    
        public boolean validarCodigo(String codigo) {
            return codigo.matches("101-\\d{7}");
        }

        public void agregarQuickpass(String filial, String codigo, String placa){
            if (validarCodigo(codigo)) {
                if (contador < quickpassLista.length) {
                    quickpassLista[contador++] = new Quickpass(filial, codigo, placa, "Activo");
                    JOptionPane.showMessageDialog(null, "Quickpass agregado exitosamente." + "\nFilial: " + filial +"\nCodigo"
                            + codigo + "\nPlaca: " + placa);

                } else {
                    JOptionPane.showMessageDialog(null, "Error: No hay espacio para mas stickers.");   
                }

            } else { 
                JOptionPane.showMessageDialog(null, "Codigo invalido.");
            }
        }


       public void consultarTodos() {
            for (int i = 0; i < contador; i++) {
                JOptionPane.showMessageDialog(null, quickpassLista[i]);
                
            }
      
       }
    
       public void eliminarQuickpass(String i) {
           
       }
    
    
    
    }
