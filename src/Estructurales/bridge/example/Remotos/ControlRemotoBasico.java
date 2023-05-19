package Estructurales.bridge.example.Remotos;

import Estructurales.bridge.example.Dispositivos.Dispositivo;

public class ControlRemotoBasico implements Remotos{

    protected Dispositivo dispositivo;

    public ControlRemotoBasico (){

    }
    public ControlRemotoBasico(Dispositivo dispositivo){
        this.dispositivo = dispositivo;
    }
    @Override
    public void power() {
        System.out.println("Control remoto: Interructor de encendido");
        if (dispositivo.estaEncendido()){
            dispositivo.encendido();
        }else{
            dispositivo.apagado();
        }

    }

    @Override
    public void subirVolumen() {
        System.out.println("Control remoto: Subir volumen");
        dispositivo.setVolumen(dispositivo.getVolumen() + 10);
    }

    @Override
    public void bajarVolumen() {
        System.out.println("Control remoto: Bajar volumen");
        dispositivo.setVolumen(dispositivo.getVolumen() - 10);

    }

    @Override
    public void subirCanal() {
        System.out.println("Control remoto: Subir canal");
        dispositivo.setCanal(dispositivo.getCanal() + 1);

    }

    @Override
    public void bajarCanal() {
        System.out.println("Control remoto: Bajar volumen");
        dispositivo.setCanal(dispositivo.getCanal() - 1);

    }
}
