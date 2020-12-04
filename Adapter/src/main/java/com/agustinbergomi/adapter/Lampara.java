package com.agustinbergomi.adapter;

public class Lampara {

    private boolean encendida;

    public boolean estaEncendida(){
        return encendida;
    }

    public void encender(){
        encendida=true;
    }
    private void apagar(){
        encendida=false;
    }

}
