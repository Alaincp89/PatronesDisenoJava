package Comportamiento.iterator.example;

import Comportamiento.iterator.example.chatsocial.ChatSocial;
import Comportamiento.iterator.example.profile.Profile;
import Comportamiento.iterator.example.redes_sociales.LinkedIn;
import Comportamiento.iterator.example.redes_sociales.RedSocial;
import Comportamiento.iterator.example.redes_sociales.Twitter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Especifique la red social para apuntar a la herramienta de spam (predeterminado: Twitter):");
        System.out.println("1. Twitter");
        System.out.println("2. LinkedIn");
        String choice = scanner.nextLine();

        RedSocial network;
        if (choice.equals("2")) {
            network = new LinkedIn(createTestProfiles());
        }
        else {
            network = new Twitter(createTestProfiles());
        }

        ChatSocial spammer = new ChatSocial(network);
        spammer.sendSpamToFriends("alaincervantesp@gmail.com",
                "¡Hola! Ella es amiga de Alain, Milena. ¿Puedes darle me gusta a esta publicación [link]?");
        spammer.sendSpamToCoworkers("vanecortina85@gmail.com",
                "¡Hola! El es el jefe de Milena, Jhon. Milena me dijo que estarías interesado en [link].");
    }


    public static List<Profile> createTestProfiles() {
        List<Profile> data = new ArrayList<Profile>();
        data.add(new Profile("alaincervantesp@gmail.com", "Alain", "friends:alaincervantesp@gmail.com"));
        data.add(new Profile("vanecortina85@gmail.com", "Vanessa", "friends:vanecortina85@gmail.com", "coworkers:vcortina@amazon.com"));
        data.add(new Profile("jimmy@microsoft.eu", "Jimmy", "coworkers:jimmy@tecnar.edu"));
        data.add(new Profile("sebastianr.net", "Sebastian R", "coworkers:srivera@microsoft.eu"));

        return data;
    }
}
