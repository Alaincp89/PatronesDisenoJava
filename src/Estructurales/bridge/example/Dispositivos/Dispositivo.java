package Estructurales.bridge.example.Dispositivos;

public interface Dispositivo {
    boolean estaEncendido();

    void encendido();

    void apagado();

    int getVolumen();

    void setVolumen(int percent);

    int getCanal();

    void setCanal(int channel);

    void printStatus();
}
