

public class Persona
{
    protected String nombre,identificacion,tipoTrabajador;

    public Persona(){
        
    }
    
    public Persona(String nombre,String identificacion,String tipoTrabajador)
    {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.tipoTrabajador = tipoTrabajador;
    }

    
    public String getNombre(){
        return this.nombre;
    }

    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    
    public String getIdentificacion(){
        return this.identificacion;
    }

    
    public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }

    
    public String getTipoTrabajador(){
        return this.tipoTrabajador;
    }

    
    public void setTipoTrabajador(String tipoTrabajador){
        this.tipoTrabajador = tipoTrabajador;
    }

    


    }//End class