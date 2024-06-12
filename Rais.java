import java.util.Calendar;
import java.util.ArrayList;

public class Rais extends RegimenPensional
{
    private ArrayList<Trabajador> trabajadoresRais = new ArrayList<>();
    
    public Rais(){
        
    }
    //Start GetterSetterExtension Source Code

    /**GET Method Propertie trabajadoresRais*/
    public java.util.ArrayList<Trabajador> getTrabajadoresRais(){
        return this.trabajadoresRais;
    }//end method getTrabajadoresRais

    /**SET Method Propertie trabajadoresRais*/
    public void setTrabajadoresRais(java.util.ArrayList<Trabajador> trabajadoresRais){
        this.trabajadoresRais = trabajadoresRais;
    }//end method setTrabajadoresRais

    //End GetterSetterExtension Source Code
    public void afiliarTrabajadorRais(Trabajador trabajador) {
        trabajadoresRais.add(trabajador);
        for (Trabajador trabajador2 : trabajadoresRais )    {
            System.out.println("se a afiliado al trabajador " +  trabajador2.getNombre() + " al Rais");
        }
    }
    
    @Override
    public double calcularPension(Trabajador trabajador) {
        
        double saldoAcumulado = calcularSaldoAcumulado(trabajador);
        int expectativaVida = 35;
    
        return saldoAcumulado / expectativaVida;
    }   

    private double calcularSaldoAcumulado(Trabajador trabajador) {
    
    double aportes = trabajador.calcularAporte(); 
    double rendimientos = calcularRendimientos(trabajador); 
    return aportes + rendimientos;
    }

    private double calcularRendimientos(Trabajador trabajador) {
   
    double aportes = trabajador.calcularAporte();
    return aportes * 0.5;//5% de rendimiento
    }

}//End class