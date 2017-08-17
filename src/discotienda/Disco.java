package discotienda;

/**
 *
 * @author Estudiante
 */
public class Disco {

    private String Nombre;
    private String Artista;
    private String Genero;
    private String Imagen;

    public Disco(String Nombre, String Artista, String Genero, String Imagen) {
        this.Nombre = Nombre;
        this.Artista = Artista;
        this.Genero = Genero;
        this.Imagen = Imagen;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }

}
