package Creacionales.abstract_factory.example.factories;

import Creacionales.abstract_factory.example.cellular.Cellular;
import Creacionales.abstract_factory.example.cellular.MacOS_Cellular;
import Creacionales.abstract_factory.example.laptop.Laptop;
import Creacionales.abstract_factory.example.laptop.MacOSLaptop;

public class MacOS_Factory implements Factory{
    @Override
    public Cellular createCellular() {
        return new MacOS_Cellular();
    }

    @Override
    public Laptop createLaptop() {
        return new MacOSLaptop();
    }
}
