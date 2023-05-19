package Comportamiento.iterator.example.redes_sociales;

import Comportamiento.iterator.example.iterators.ProfileIterator;

public interface RedSocial {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);

}
