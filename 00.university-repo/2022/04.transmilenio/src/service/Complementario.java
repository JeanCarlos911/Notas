package service;

import model.Destination;
import model.Usuario;

public class Complementario implements Transporte {
    private static final int COST =2450;

    @Override
    public double getCost() {
        return COST;
    }

    @Override
    public void transportarUsuario(Usuario usuario, Destination destination) {
        usuario.setLocation(destination.getName());
    }
}
