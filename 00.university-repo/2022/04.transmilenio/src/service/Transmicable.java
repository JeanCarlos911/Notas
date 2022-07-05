package service;

import model.Destination;
import model.Usuario;

public class Transmicable implements Transporte {
    private static final int COST =2650;

    @Override
    public double getCost() {
        return COST;
    }

    @Override
    public void transportarUsuario(Usuario usuario, Destination destination) {
        usuario.setLocation(destination.getName());
    }
}
