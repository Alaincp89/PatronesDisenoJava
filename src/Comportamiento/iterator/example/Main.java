package Comportamiento.iterator.example;

import Comportamiento.iterator.example.chatsocial.ChatSocial;
import Comportamiento.iterator.example.profile.Profile;
import Comportamiento.iterator.example.redes_sociales.RedSocial;
import Comportamiento.iterator.example.redes_sociales.Twitter;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        RedSocial red;

            red = new Twitter(createTestProfiles());


        ChatSocial spammer = new ChatSocial(red);
        spammer.sendSpamToFriends("alaincervantesp@gmail.com",
                "¡Ey! Este es el amigo de Alain, Milena. ¿Puedes hacerme un favor y darle me gusta a esta publicación ");

    }

    public static List<Profile> createTestProfiles() {
        List<Profile> data = new ArrayList<Profile>();
        data.add(new Profile("alaincervantesp@gmail.com", "Alain", "friends:alaincervantesp@gmail.com"));
        data.add(new Profile("vanecortina85@gmail.com", "Vanessa", "friends:vanecortina85@gmail.com", "coworkers:vcortina@amazon.com"));
        data.add(new Profile("jimmy@microsoft.eu", "Jimmy", "coworkers:jimmy@tecnar.edu"));
        data.add(new Profile("sebastianr.net", "John Day", "coworkers:srivera@microsoft.eu"));

        return data;
    }
}
