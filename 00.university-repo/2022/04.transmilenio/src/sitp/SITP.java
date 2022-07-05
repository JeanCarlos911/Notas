package sitp;

import model.Destination;
import model.Usuario;
import service.Transporte;

import java.util.ArrayList;

public interface SITP {

    void transportarUsuario(Usuario usuario, Destination start, Destination end);
    ArrayList<Transporte> getServices();
}
