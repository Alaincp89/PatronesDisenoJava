package Estructurales.bridge.example.Remotos;

import Estructurales.bridge.example.Dispositivos.Dispositivo;

public class ControlRemotoAvanzado extends ControlRemotoBasico{
    public ControlRemotoAvanzado(Dispositivo dispositivo){
        super.dispositivo = dispositivo;
    }
    public void mute() {
        System.out.println("Control remoto: mute");
        dispositivo.setVolumen(0);
    }
}
