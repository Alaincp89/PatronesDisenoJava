package Comportamiento.iterator.example.iterators;


import Comportamiento.iterator.example.profile.Profile;

public interface ProfileIterator {

        boolean hasNext();

        Profile getNext();

        void reset();
}
