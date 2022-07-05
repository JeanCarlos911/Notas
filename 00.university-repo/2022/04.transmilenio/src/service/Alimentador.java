package service;

import model.Destination;
import model.Usuario;

public class Alimentador implements Transporte {
    private static final int COST =0;

    @Override
    public double getCost() {
        return COST;
    }

    @Override
    public void transportarUsuario(Usuario usuario, Destination destination) {
        usuario.setLocation(destination.getName());
    }
}
