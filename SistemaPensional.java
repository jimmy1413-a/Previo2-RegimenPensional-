
import java.util.ArrayList;
import java.util.List;
public class SistemaPensional
{
    private List<Trabajador> trabajadoresSistema;

    public SistemaPensional() {
        trabajadoresSistema = new ArrayList<>();
        
    }

    public void afiliarTrabajadorSistema(Trabajador trabajador) {
        
        trabajadoresSistema.add(trabajador);
        for (Trabajador trabajador3: trabajadoresSistema )    {
            System.out.println("ahora pertenece al sistema " +  trabajador3.getNombre());
        }
        
        
    }

    public void calcularAportes() {
        for (Trabajador trabajador : trabajadoresSistema) {
            double aporte = trabajador.calcularAporte();
            System.out.println("Aporte mensual para " + trabajador.getNombre() + ": $" + aporte);
        }
    }

    public void simularPensiones() {
        for (Trabajador trabajador : trabajadoresSistema) {
            double pension = trabajador.simularPension();
            System.out.println("Pensión estimada para " + trabajador.getNombre() + ": $" + pension);
        }
    }
    
     public static void main(String[] args) {
        Rpm rpm = new Rpm();
        Rais rais = new Rais();

        Trabajador trabajador1 = new Trabajador("Juan", "123456", "dependiente", 1000000, rpm);
        Trabajador trabajador2 = new Trabajador("Maria", "789012", "independiente", 1500000, rais);

        SistemaPensional sistema = new SistemaPensional();
        sistema.afiliarTrabajadorSistema(trabajador1);
        sistema.afiliarTrabajadorSistema(trabajador2);
        
        rpm.afiliarTrabajadorRpm(trabajador1);
        rais.afiliarTrabajadorRais(trabajador2);

        sistema.calcularAportes();
        sistema.simularPensiones();
    }
}


