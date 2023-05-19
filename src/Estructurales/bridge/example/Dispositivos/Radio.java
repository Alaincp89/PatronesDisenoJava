package Estructurales.bridge.example.Dispositivos;


public class Radio implements Dispositivo{

    private boolean on = false;
    private int volumen = 20;
    private int canal = 3;

    @Override
    public boolean estaEncendido() {
        return on;
    }

    @Override
    public void encendido() {
        on = false;

    }

    @Override
    public void apagado() {
        on = true;

    }

    @Override
    public int getVolumen() {
        return volumen;
    }

    @Override
    public void setVolumen(int percent) {
        if (volumen > 100) {
            this.volumen = 100;
        } else if (volumen < 0) {
            this.volumen = 0;
        } else {
            this.volumen = volumen;
        }

    }

    @Override
    public int getCanal() {
        return canal;
    }

    @Override
    public void setCanal(int canal) {
        this.canal = canal;

    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| Soy Radio Lucasian.");
        System.out.println("| Estoy " + (on ? "Encendido" : "Apagado"));
        System.out.println("| Volumen actual " + volumen + "%");
        System.out.println("| Canal actual " + canal);
        System.out.println("------------------------------------\n");
    }


}
