package Estructurales.bridge.example;

import Estructurales.bridge.example.Dispositivos.Dispositivo;
import Estructurales.bridge.example.Dispositivos.Radio;
import Estructurales.bridge.example.Dispositivos.Tv;
import Estructurales.bridge.example.Remotos.ControlRemotoAvanzado;
import Estructurales.bridge.example.Remotos.ControlRemotoBasico;

public class Main {
    public static void main(String[] args) {
        testDispositivo(new Tv());
        testDispositivo(new Radio());
    }

    public static void testDispositivo(Dispositivo dispositivo){
        System.out.println("Test control remoto basico");
        ControlRemotoBasico controlBasico = new ControlRemotoBasico(dispositivo);
        controlBasico.power();
        dispositivo.printStatus();

        System.out.println("Test control remoro avanzado");
        ControlRemotoAvanzado controlAvanzado = new ControlRemotoAvanzado(dispositivo);
        controlAvanzado.power();
        controlAvanzado.mute();
        dispositivo.printStatus();

    }
}
