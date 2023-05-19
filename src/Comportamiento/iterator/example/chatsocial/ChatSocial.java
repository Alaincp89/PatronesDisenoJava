package Comportamiento.iterator.example.chatsocial;

import Comportamiento.iterator.example.iterators.ProfileIterator;
import Comportamiento.iterator.example.profile.Profile;
import Comportamiento.iterator.example.redes_sociales.RedSocial;




public class ChatSocial {
    public RedSocial network;
    public ProfileIterator iterator;

    public ChatSocial(RedSocial network) {
        this.network = network;
    }

    public void sendSpamToFriends(String profileEmail, String message) {
        System.out.println("\nInteractuando con amigos de redes sociales...\n");
        iterator = network.createFriendsIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendSpamToCoworkers(String profileEmail, String message) {
        System.out.println("\nInteractuando con compañeros de trabajo...\n");
        iterator = network.createCoworkersIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendMessage(String email, String message) {
        System.out.println("Mensaje enviado a : '" + email + "'. Cuerpo del mensaje: '" + message + "'");
    }
}
