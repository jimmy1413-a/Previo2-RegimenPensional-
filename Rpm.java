
import java.util.ArrayList;
import java.util.List;
public class Rpm extends RegimenPensional
{
    private ArrayList<Trabajador> trabajadoresRpm = new ArrayList<>();
    
    int semanasCotizada; 
    
    public Rpm(){
        
    }
    
    public Rpm(int semanasCotizada){
        this.semanasCotizada = semanasCotizada;
    }

    //Start GetterSetterExtension Source Code

    /**GET Method Propertie trabajadoresRpm*/
    public java.util.ArrayList<Trabajador> getTrabajadoresRpm(){
        return this.trabajadoresRpm;
    }//end method getTrabajadoresRpm

    /**SET Method Propertie trabajadoresRpm*/
    public void setTrabajadoresRpm(java.util.ArrayList<Trabajador> trabajadoresRpm){
        this.trabajadoresRpm = trabajadoresRpm;
    }//end method setTrabajadoresRpm

    /**GET Method Propertie semanasCotizada*/
    public int getSemanasCotizada(){
        return this.semanasCotizada;
    }//end method getSemanasCotizada

    /**SET Method Propertie semanasCotizada*/
    public void setSemanasCotizada(int semanasCotizada){
        this.semanasCotizada = semanasCotizada;
    }//end method setSemanasCotizada

    //End GetterSetterExtension Source Code
    
    public void afiliarTrabajadorRpm(Trabajador trabajador) {
        trabajadoresRpm.add(trabajador);
        
        for (Trabajador trabajador1 : trabajadoresRpm )    {
            System.out.println("se a afiliado al trabajador " +  trabajador1.getNombre()  + " al Rpm");
        }
        
        }
    
    @Override
        public double calcularPension(Trabajador trabajador) {
        double IBL = calcularIBL(trabajador);
        int semanasCotizada= 540; 
        double porcentajePension = calcularPorcentajePension(semanasCotizada);
        return IBL * porcentajePension;
    }

    private double calcularIBL(Trabajador trabajador) {
        double salarioPromedio = trabajador.getSalario(); // Se toma el salario actual
        return salarioPromedio;
        }

    private double calcularPorcentajePension(int semanasCotizadas) {
    double porcentaje = 0.0;
    if (semanasCotizada <= 1300) {
        porcentaje = 0.65;
    } else {
        int semanasAdicion= semanasCotizada - 1300;
        double incrementoPorSemana = semanasAdicion / 50 * 0.015;
        porcentaje = 0.65 + incrementoPorSemana;
        if (porcentaje > 0.8) {
            porcentaje = 0.8;
        }
    }
    return porcentaje;
    }

}