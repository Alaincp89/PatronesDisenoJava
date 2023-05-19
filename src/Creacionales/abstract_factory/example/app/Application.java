package Creacionales.abstract_factory.example.app;

import Creacionales.abstract_factory.example.cellular.Cellular;
import Creacionales.abstract_factory.example.factories.Factory;
import Creacionales.abstract_factory.example.laptop.Laptop;

public class Application {
    private Cellular cellular;
    private Laptop laptop;

    public Application(Factory factory){
        cellular = factory.createCellular();
        laptop = factory.createLaptop();

    }

    public void paint(){
        cellular.paint();
        laptop.paint();

    }
}
