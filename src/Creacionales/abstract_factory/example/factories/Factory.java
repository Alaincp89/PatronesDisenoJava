package Creacionales.abstract_factory.example.factories;

import Creacionales.abstract_factory.example.cellular.Cellular;
import Creacionales.abstract_factory.example.laptop.Laptop;

public interface Factory {

    Cellular createCellular();
    Laptop createLaptop();

}
