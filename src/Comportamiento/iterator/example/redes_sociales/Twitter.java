package Comportamiento.iterator.example.redes_sociales;

import Comportamiento.iterator.example.iterators.ProfileIterator;
import Comportamiento.iterator.example.iterators.TwitterItetaror;
import Comportamiento.iterator.example.profile.Profile;


import java.util.ArrayList;
import java.util.List;

public class Twitter implements RedSocial{
    private List<Profile> profiles;

    public Twitter(List<Profile> cache) {
        if (cache != null) {
            this.profiles = cache;
        } else {
            this.profiles = new ArrayList<>();
        }
    }

    public Profile requestProfileDeTwitter(String perfilEmail) {
        simulaLaRed();
        System.out.println("Twitter: cargando perfil " + perfilEmail + " sobre la red...." );
        return findProfile(perfilEmail);
    }
    public List<String> requestProfileAmigosTwitter(String perfilEmail, String contactType) {

        simulaLaRed();
        System.out.println("Twitter: cargando perfil de " + contactType + " a lista de contactos " + perfilEmail + " a la red....");


        Profile profile = findProfile(perfilEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    private Profile findProfile(String perfilEmail){
        for(Profile profile : profiles){
            if (profile.getEmail().equals(perfilEmail)){
                return profile;
            }
        }
        return null;
    }
    private static void simulaLaRed() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ProfileIterator crearAmigosIterator(String perfilEmail) {
        return new TwitterItetaror(this,"amigos", perfilEmail);
    }
}
