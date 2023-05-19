package Creacionales.abstract_factory.example.factories;

import Creacionales.abstract_factory.example.cellular.Cellular;
import Creacionales.abstract_factory.example.cellular.SamsungCellular;
import Creacionales.abstract_factory.example.laptop.Laptop;
import Creacionales.abstract_factory.example.laptop.SamsungLaptop;

public class SamsungFactory implements Factory{
    @Override
    public Cellular createCellular() {
        return new SamsungCellular();
    }

    @Override
    public Laptop createLaptop() {
        return new SamsungLaptop();
    }
}
