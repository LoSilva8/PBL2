import java.util.ArrayList;

class Usuario {
    String nome;
    ArrayList<Playlist> playlists;

    public Usuario(String nome) {
        this.nome = nome;
        this.playlists = new ArrayList<>();
    }

    public void adicionarPlaylist(Playlist playlist) {
        playlists.add(playlist);
    }
}

class Playlist {
    String nome;
    ArrayList<Musica> musicas;

    public Playlist(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }
}

class Genero {
    String nome;

    public Genero(String nome) {
        this.nome = nome;
    }
}

class Artista {
    String nome;

    public Artista(String nome) {
        this.nome = nome;
    }
}

class PlanoAssinatura {
    String tipo;

    public PlanoAssinatura(String tipo) {
        this.tipo = tipo;
    }
}

class Musica {
    String titulo;
    Artista artista;
    Genero genero;

    public Musica(String titulo, Artista artista, Genero genero) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
    }
}

public class Main {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Juninho");
        Playlist playlist1 = new Playlist("Rotacao do Juninho");
        Musica musica1 = new Musica("Solo Dolo, PT III", new Artista("Kid Cudi"), new Genero("Rap"));
        Musica musica2 = new Musica("way back", new Artista("Travis Scott"), new Genero("Rap"));
        Musica musica3 = new Musica("Doing It Wrong", new Artista("Drake"), new Genero("R&B"));
        PlanoAssinatura plano1 = new PlanoAssinatura("Premium");


        usuario1.adicionarPlaylist(playlist1);
        playlist1.adicionarMusica(musica1);
        playlist1.adicionarMusica(musica2);
        playlist1.adicionarMusica(musica3);


        System.out.println("Nome do usuario: " + usuario1.nome);
        System.out.println("Playlists de " + usuario1.nome + ":");
        for (Playlist playlist : usuario1.playlists) {
            System.out.println("- " + playlist.nome);
            System.out.println("   Musicas:");
            for (Musica musica : playlist.musicas) {
                System.out.println("   - " + musica.titulo + " (" + musica.artista.nome + ", " + musica.genero.nome + ")");

            }
        }
        System.out.println("Plano de assinatura: " + plano1.tipo);
    }
}
