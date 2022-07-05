import sitp.v2018.destination.Perdomo;
import sitp.v2018.destination.Usaquen;
import model.Usuario;
import sitp.SITP;
import sitp.v2018.SITP2018;

public class Main {
    public static void main(String[] args) {
        Usuario user = new Usuario();

        // este usuario va a usar el sitp para transportarse desde el Portal tunal hasta Manitas en el 2018
        System.out.println("year 2018");
        SITP sitp2018 = new SITP2018();
        user.transportarse(sitp2018, Perdomo.PORTAL_TUNAL, Usaquen.VERBENAL);

    }
}
