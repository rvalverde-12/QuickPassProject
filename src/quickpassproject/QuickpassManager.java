/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quickpassproject;
import javax.swing.JOptionPane;
import java.time.LocalDateTime; // Fecha Y Hora
import java.time.format.DateTimeFormatter; // Dar Formato a Fecha y Hora

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author Lipsky
 */
    public class QuickpassManager {
   
    private Quickpass[] quickpassLista = new Quickpass[20]; //tamaño maximo se puede ampliar a mas de ser necesario
    private Quickpass[] quickpassEliminados = new Quickpass[50];
    private QuickpassAcceso[] quickpassRegistro = new QuickpassAcceso[1000];
    private int contador = 0;
    private int contadorEliminados = 0;
    private int contadorRegistro = 0;
    
    
        public boolean validarCodigo(String codigo) {
            if (codigo.length()!=11) { //valida que cumpla con los 11 digitos
                return false; 
            }
            
            if (!codigo.substring(0,4).equals("101-")){ //valida que empiece con 101-
                return false; 
            }
            return true;
        }
        
        private String valStringNoVacio(String parametro){  //Validar espacios vacios, nulls
            String r;
            do {
                r = JOptionPane.showInputDialog("Ingrese el " +parametro);
                if(r==null || r.equals(" ")|| r.equals("")){  
                    
                    JOptionPane.showMessageDialog(null,"Error: valor incorrecto");
                }     
                
            }while(r==null || r.equals(" ") || r.equals(""));
            return r;
        }
        

        public void agregarQuickpass(){
            
        String filial = this.valStringNoVacio("filial");
        String codigo = this.valStringNoVacio("codigo");
        String placa = this.valStringNoVacio("placa");
        
        
            if (validarCodigo(codigo)) {
                if (contador < quickpassLista.length) {
                    quickpassLista[contador++] = new Quickpass(filial, codigo, placa, "Activo"); //constructor añade objetos a la lista
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
            Boolean encontrado = false;

            filnum1 = JOptionPane.showInputDialog("Ingrese el numero de filial: ");
           for (int i = 0; i< contador; i++) {
                if (quickpassLista[i].getFilial().equals(filnum1)) {
                    JOptionPane.showMessageDialog(null, "Filial encontrada: \n" +
                        "Filial: " + quickpassLista[i].getFilial() + "\n" +
                        "Codigo: " + quickpassLista[i].getCodigo() + "\n" +
                        "Placa: " +quickpassLista[i].getPlaca() + "\n" +
                        "Estado: " + quickpassLista[i].getEstado());
                    encontrado = true;
                } else if (encontrado == false) {
                    JOptionPane.showMessageDialog(null,"Filial no encontrado");
    
                                                }
                    
            }
        }
        
        public void consultarPlacaCodigo() {
            String num1;
            Boolean encontrado = false;
            
            num1 = JOptionPane.showInputDialog("Ingrese el numero de placa o codigo: ");
            for (int i = 0; i < contador; i++) {
                
                if (quickpassLista[i].getCodigo().equals(num1) || quickpassLista[i].getPlaca().equals(num1)) {
                    if (quickpassLista[i].getEstado().equals("Bloqueado")){
                        JOptionPane.showMessageDialog(null,"Quickpass esta bloqueado. Contacte gerencia.");
                    } else {
               
               
                        if(quickpassLista[i].getCodigo().equals(num1) || quickpassLista[i].getPlaca().equals(num1)) {
                            JOptionPane.showMessageDialog(null, "Datos encontrados: \n" +
                                "Filial: " + quickpassLista[i].getFilial() + "\n" +
                                "Codigo: " + quickpassLista[i].getCodigo() + "\n" +
                                "Placa: " +quickpassLista[i].getPlaca() + "\n" +
                                "Estado: " + quickpassLista[i].getEstado());
                            encontrado = true;

                        } else if (encontrado == false) {
                            JOptionPane.showMessageDialog(null,"Datos ingresados invalidos");
                                                        }
                        }  
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
      
       public boolean validarUsuario(String codigoPlaca) {
        for(int i = 0; i< contador; i++) {
            if(quickpassLista[i].getCodigo().equals(codigoPlaca) || quickpassLista[i].getPlaca().equals(codigoPlaca)) {
                if(quickpassLista[i].getEstado().equals("Activo")) {
                    return true;
                    
                } else {
                    JOptionPane.showMessageDialog(null, "El Quickpass existe, pero su estado es: " +quickpassLista[i].getEstado());
                    return false;
                }
            }    
        }
        JOptionPane.showMessageDialog(null, "Quickpass no registrado en el sistema.");
        return false;
    }
       
       
      public void registrarAcceso(){
         String codigoPlaca = JOptionPane.showInputDialog("Ingrese el código o placa del acceso:");

         
            for (int i = 0; i< quickpassLista.length; i++){
                if (quickpassLista[i] != null && (quickpassLista[i].getCodigo().equals(codigoPlaca) || quickpassLista[i].getPlaca().equals(codigoPlaca))) {
                     if(quickpassLista[i].getEstado().equals("Activo")) {
                         JOptionPane.showMessageDialog(null, "Acceso permitido. Quickpass encontrado.");
                      
                         if (contadorRegistro < quickpassRegistro.length){
                          quickpassRegistro[contadorRegistro++] = new QuickpassAcceso(quickpassLista[i].getFilial(), 
                                  quickpassLista[i].getCodigo(), 
                                  quickpassLista[i].getPlaca(),
                                  "Aceptado",
                                 obtenerFechaHora());

                            JOptionPane.showMessageDialog(null, "Acceso registrado exitosamente: \n" +
                                                                            "Filial: " + quickpassRegistro[contadorRegistro-1].getFilial() + "\n" +
                                                                            "Codigo: " + quickpassRegistro[contadorRegistro-1].getCodigo() + "\n" +
                                                                            "Placa: " + quickpassRegistro[contadorRegistro-1].getPlaca() + "\n" +
                                                                            "Condicion: " +quickpassRegistro[contadorRegistro-1].getCondicion() + "\n" +
                                                                            "Fecha y Hora: " + quickpassRegistro[contadorRegistro-1].getFechaHora());
                            
                            escribirTxT(quickpassLista[i].getFilial(), quickpassLista[i].getCodigo(),quickpassLista[i].getPlaca(),"Aceptado",obtenerFechaHora());
                            
                            } else {
                            JOptionPane.showMessageDialog(null, "No hay espacio para registrar mas accesos \n");
                            }return;
                                

                    } else {
                       JOptionPane.showMessageDialog(null, "El Quickpass no esta activo. No se permite acceso \n");
                       return;
                    }
                }
                
            }  
                JOptionPane.showMessageDialog(null, "Quickpass no encontrado. Acceso denegado");
      
    }
       
       public String obtenerFechaHora() {
           LocalDateTime fechaHoraActual = LocalDateTime.now();
           DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
           return fechaHoraActual.format(formato); 
      
       }
       
       
       
       public void escribirTxT(String filial, String codigo, String placa, String condicion, String fechaHora){
            String directorio = "C:\\Users\\Lipsky\\Desktop\\Tools\\Universidad\\Cuatri 2\\Intro Progra\\FinalProject\\DB_Registros.txt";
            String datos = "Filial: " + filial + "\n" +
                           "Codigo: " + codigo + "\n" +
                           "Placa: " + placa + "\n" +
                           "Condicion: " + condicion + "\n" +
                           "Fecha y Hora: " + fechaHora + "\n"+
                           "-----------------------\n";
            try { 
                FileWriter writer = new FileWriter(directorio, true);
                writer.write(datos); //escribir
                writer.close(); //cerrar archivo
                
            } catch (IOException e) {
                e.printStackTrace();
                
            }
           
       } 
       
       
        public void consultarAccesoFilial() {
            String filialBuscada = JOptionPane.showInputDialog("Ingrese el numero de filial:");
            String directorio = "C:\\Users\\Lipsky\\Desktop\\Tools\\Universidad\\Cuatri 2\\Intro Progra\\FinalProject\\DB_Registros.txt";
            String registrosEncontrados = ""; // Inicializamos como una cadena vacía

            try {
                FileReader fileReader = new FileReader(directorio);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                String linea;
                boolean encontrado = false;

                while ((linea = bufferedReader.readLine()) != null) {
                    if (linea.contains("Filial: " + filialBuscada)) {
                        encontrado = true;
                        registrosEncontrados += linea + "\n"; // Agregamos la línea de la filial encontrada
                        // Continuamos acumulando las líneas relacionadas hasta encontrar el separador
                        while ((linea = bufferedReader.readLine()) != null && !linea.equals("-----------------------")) {
                            registrosEncontrados += linea + "\n";
                        }
                        registrosEncontrados += "-----------------------\n";
                    }
                }

                bufferedReader.close();

                if (encontrado) {
                    JOptionPane.showMessageDialog(null, "Registros encontrados:\n" + registrosEncontrados);
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontraron registros para la filial: " + filialBuscada);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage());
                e.printStackTrace();
            }
        }




       
       
       
           
       }
    
    
    
    
    
    
 
    
