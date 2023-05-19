package Comportamiento.iterator.example.redes_sociales;

import Comportamiento.iterator.example.iterators.LinkedInIterator;
import Comportamiento.iterator.example.iterators.ProfileIterator;
import Comportamiento.iterator.example.profile.Profile;

import java.util.ArrayList;
import java.util.List;

public class LinkedIn implements RedSocial{
    private List<Profile> contacts;

    public LinkedIn(List<Profile> cache) {
        if (cache != null) {
            this.contacts = cache;
        } else {
            this.contacts = new ArrayList<>();
        }
    }

    public Profile requestContactInfoFromLinkedInAPI(String profileEmail) {
        simulateNetworkLatency();
        System.out.println("LinkedIn: Cargando perfil '" + profileEmail + "' a la red...");
        
        return findContact(profileEmail);
    }

    public List<String> requestRelatedContactsFromLinkedInAPI(String profileEmail, String contactType) {
       
        simulateNetworkLatency();
        System.out.println("LinkedIn: Cargando '" + contactType + "' Lista de '" + profileEmail + "' a la red...");

        
        Profile profile = findContact(profileEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    private Profile findContact(String profileEmail) {
        for (Profile profile : contacts) {
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
        return new LinkedInIterator(this, "Amigos", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new LinkedInIterator(this, "Compañeros de trabajo", profileEmail);
    }
}
