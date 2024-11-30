package quickpassproject;



/**
 *
 * @author Lipsky
 */
public class QuickpassAcceso {
    
    private String filial;
    private String codigo;
    private String placa;
    private String condicion; 
    private String fechaHora;
    
    
    public QuickpassAcceso (String filial, String codigo, String placa, String condicion, String fechaHora){
        
        this.filial = filial;
        this.codigo = codigo;
        this.placa = placa;
        this.condicion = condicion;
        this.fechaHora = fechaHora;
        
    }
    
    public String getFilial() {
        return filial;
    }
    
    public String getCodigo(){
        return codigo;
        
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public String getCondicion(){
        return condicion;
    }
    
    public String getFechaHora(){
        return fechaHora;
    }

    @Override
    public String toString() {
        return "Filial: " + filial +
                "\nCodigo: " + codigo + 
                "\nPlaca: " + placa + 
                "\nCondicion: " + condicion + 
                "\nFecha: " + fechaHora;
    }
    
}
