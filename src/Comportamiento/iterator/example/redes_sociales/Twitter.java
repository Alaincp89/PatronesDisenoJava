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

    public Profile requestProfileFromTwitter(String profileEmail) {
        // Aquí habría una solicitud POST a uno de los puntos finales de la API de Twitter.
        // En su lugar, emulamos una conexión de red larga, que es de esperar en la vida real
        simulateNetworkLatency();
        System.out.println("Twitter: Cargando perfil '" + profileEmail + "' a la red...");

        // Nos devuelve datos de prueba
        return findProfile(profileEmail);
    }

    public List<String> requestProfileFriendsFromTwitter(String profileEmail, String contactType) {

        simulateNetworkLatency();
        System.out.println("Twitter: Cargando '" + contactType + "' lista de '" + profileEmail + "' a la red...");


        Profile profile = findProfile(profileEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    private Profile findProfile(String profileEmail) {
        for (Profile profile : profiles) {
            if (profile.getEmail().equals(profileEmail)) {
                return profile;
            }
        }
        return null;
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new TwitterItetaror(this, "Amigos", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new TwitterItetaror(this, "Compañeros de trabajo", profileEmail);
    }
}
