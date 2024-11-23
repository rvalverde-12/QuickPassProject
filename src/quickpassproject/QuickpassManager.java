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
    private Quickpass[] quickpassEliminados = new Quickpass[50];
    private int contador = 0;
    private int contadorEliminados = 0;
    
    
        public boolean validarCodigo(String codigo) {
            if (codigo.length()!=11) { //valida que cumpla con los 11 digitos
                return false; 
            }
            
            if (!codigo.substring(0,4).equals("101-")){ //valida que empiece con 101-
                return false; 
            }
            return true;
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
 
       public void eliminarQuickpass(String num1) {
           for(int i = 0; i < contador; i++) {
                if (quickpassLista[i].getCodigo().equals(num1) || quickpassLista[i].getPlaca().equals(num1)) {
                    Quickpass eliminado = quickpassLista[i];
                    quickpassLista[i] = quickpassLista[contador -1];
                    quickpassLista[contador -1] = null;
                    contador--;

                if(contadorEliminados < quickpassEliminados.length) {
                    eliminado.setEstado("Eliminado");
                    quickpassEliminados[contadorEliminados++] = eliminado;
                    JOptionPane.showMessageDialog(null, "Quickpass eliminado exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null,"No hay espacio para mas Quickpass eliminados.");
                    
                }
                return;
                
                }   
                
            }
           JOptionPane.showMessageDialog(null,"Quickpass no encontrado.");
        }
       
       public void consultarEliminados(){
           for (int i = 0; i< contadorEliminados; i++) {
               JOptionPane.showMessageDialog(null,quickpassEliminados[i]);
           }
       }
       
        public void consultarFilial(){
            String filnum1;
            Boolean encontrado;

            filnum1 = JOptionPane.showInputDialog("Ingrese el numero de filial: ");
           for (int i = 0; i< contador; i++) {
                if (quickpassLista[i].getFilial().equals(filnum1)) {
                    JOptionPane.showMessageDialog(null, "Filial encontrada: \n" +
                    "Filial: " + quickpassLista[i].getFilial() + "\n" +
                    "Codigo: " + quickpassLista[i].getCodigo() + "\n" +
                    "Placa: " +quickpassLista[i].getPlaca() + "\n" +
                    "Estado: " + quickpassLista[i].getEstado());

                }
                              
                                   
            }
        }
     
       
       
       
       public void bloquearQuickpass(String num2) {
           for (int i = 0; i < contador; i++) {
               
               if(quickpassLista[i].getCodigo().equals(num2) || quickpassLista[i].getPlaca().equals(num2)) {
                   quickpassLista[i].setEstado("Bloqueado");
                   JOptionPane.showMessageDialog(null,"Quickpass bloqueado exitosamente.");
                   return;
               }
           }
           JOptionPane.showMessageDialog(null,"Quickpass no encontrado.");
       }
      
           
       }
    
    
    
    
    
    
 
    
