

public class Trabajador extends Persona
{
    private double salario;
    private RegimenPensional regimenPensional;
    
    public Trabajador(){
        
    }
    
    public Trabajador(String nombre,String identificacion,String tipoTrabajador,int salario,RegimenPensional regimenPensional)
    {
      super(nombre,identificacion,tipoTrabajador);
      this.salario = salario;
      this.regimenPensional = regimenPensional;
    }

    
    public double getSalario(){
        return this.salario;
    }

    
    public void setSalario(double salario){
        this.salario = salario;
    }

    
    public RegimenPensional getRegimenPensional(){
        return this.regimenPensional;
    }

    
    public void setRegimenPensional(RegimenPensional regimenPensional){
        this.regimenPensional = regimenPensional;
    }

    

       public double calcularAporte() {
        return salario * 0.16;
    }

    public double simularPension() 
    {
     return regimenPensional.calcularPension(this);
                 
    }
    
}

    