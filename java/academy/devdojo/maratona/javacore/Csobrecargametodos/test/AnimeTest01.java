package academy.devdojo.maratona.javacore.Csobrecargametodos.test;

import academy.devdojo.maratona.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime();
        anime.init("Shigatsu wa kimi no uso", "TV", 12);
        anime.init("Shigatsu wa kimi no uso 2", "TV", 12, "Drama");
        anime.imprime();
    }
}
