package Comportamiento.iterator.example.iterators;


import Comportamiento.iterator.example.profile.Profile;

public interface ProfileIterator {

        boolean siguiente();
        Profile getSiguiente();
        void reiniciar();
}
