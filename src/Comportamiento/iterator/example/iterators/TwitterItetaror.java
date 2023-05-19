package Comportamiento.iterator.example.iterators;

import Comportamiento.iterator.example.profile.Profile;
import Comportamiento.iterator.example.redes_sociales.Twitter;


import java.util.ArrayList;
import java.util.List;

public class TwitterItetaror implements ProfileIterator {
    private Twitter twitter;
    private String tipo;
    private String email;
    private int posicionActual = 0;
    private List<String> emails = new ArrayList<>();
    private List<Profile> profiles = new ArrayList<>();

    public TwitterItetaror(Twitter twitter, String tipo, String email) {
        this.twitter = twitter;
        this.tipo = tipo;
        this.email = email;
    }

    private void cargaLenta() {
        if (emails.size() == 0) {
            List<String> profiles = twitter.requestProfileAmigosTwitter(this.email, this.tipo);
            for (String profile : profiles) {
                this.emails.add(profile);
                this.profiles.add(null);
            }
        }
    }

    @Override
    public boolean siguiente() {
        cargaLenta();
        return posicionActual < emails.size();
    }

    @Override
    public Profile getSiguiente() {
        if (!siguiente()){
            return null;
        }

        String friendEmail = emails.get(posicionActual);
        Profile profileAmigo = profiles.get(posicionActual);
        if (profileAmigo == null) {
            profileAmigo = (Profile) twitter.requestProfileAmigosTwitter("alaincervantesp@gmail.com","Amigos");
            profiles.set(posicionActual, profileAmigo);
        }
        posicionActual++;
        return profileAmigo;
    }

    @Override
    public void reiniciar() {
        posicionActual = 0;

    }
}
