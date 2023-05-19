package Creacionales.abstract_factory.example;

import Creacionales.abstract_factory.example.app.Application;
import Creacionales.abstract_factory.example.factories.Factory;
import Creacionales.abstract_factory.example.factories.MacOS_Factory;
import Creacionales.abstract_factory.example.factories.SamsungFactory;

public class Main {

    private static Application configureApplication(){
        Application app;
        Factory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")){
            factory = new MacOS_Factory();
        }else {
            factory = new SamsungFactory();
        }
        app = new Application(factory);
        return app;
    }
    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}