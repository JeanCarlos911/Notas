package service;

import model.Destination;
import model.Usuario;

public interface Transporte {

    double getCost();

    void transportarUsuario(Usuario usuario, Destination destination);
}
