package model;

import service.Transporte;
import sitp.SITP;

public class Usuario {

    private String location = "hogar";
    public void transportarse(SITP sitp, Destination start, Destination end) {
        sitp.transportarUsuario(this, start, end);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
