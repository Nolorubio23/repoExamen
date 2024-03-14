package evf.javadoc.original;

public class Artista {
    String nombreArtista;

    public Artista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombreArtista='" + nombreArtista + '\'' +
                '}';
    }

    public void setNombreArtista(String nuevoNombre) {
	this.nombreArtista = nuevoNombre;
	//Este metodo es el que ha añadido NOLO :D
}

    public String getNombreArtista() {
        return nombreArtista;
	//Esto es un comentario
    }
    
}


