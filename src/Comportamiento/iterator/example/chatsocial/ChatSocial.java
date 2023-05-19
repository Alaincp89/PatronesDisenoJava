package Comportamiento.iterator.example.chatsocial;

import Comportamiento.iterator.example.iterators.ProfileIterator;
import Comportamiento.iterator.example.profile.Profile;
import Comportamiento.iterator.example.redes_sociales.RedSocial;




public class ChatSocial {
    public ProfileIterator iterator;
    public RedSocial red;

    public ChatSocial(RedSocial red){
        this.red = red;

    }
    public void sendSpamToFriends(String profileEmail, String message) {
        System.out.println("\nIterating over friends...\n");
        iterator = red.crearAmigosIterator(profileEmail);
        while (iterator.siguiente()) {
            Profile profile = iterator.getSiguiente();
            sendMessage(profile.getEmail(), message);
        }
    }
    public void sendMessage(String email, String message) {
        System.out.println("Sent message to: '" + email + "'. Message body: '" + message + "'");
    }
}
