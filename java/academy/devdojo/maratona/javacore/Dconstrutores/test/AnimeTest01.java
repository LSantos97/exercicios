package academy.devdojo.maratona.javacore.Dconstrutores.test;


import academy.devdojo.maratona.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime("HxH", "TV", 12, "Drama", "A-1 Pictures");
        anime.imprime();
    }
}
