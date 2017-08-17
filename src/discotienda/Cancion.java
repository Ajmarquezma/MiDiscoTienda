package discotienda;

/**
 *
 * @author Estudiante
 */
public class Cancion {

    private String NombreCancion;
    private double Precio;
    private String Duracion;
    private String Tamaño;

    public Cancion(String NombreCancion, double Precio, String Duracion, String Tamaño) {
        this.NombreCancion = NombreCancion;
        this.Precio = Precio;
        this.Duracion = Duracion;
        this.Tamaño = Tamaño;
    }

    public String getNombreCancion() {
        return NombreCancion;
    }

    public double getPrecio() {
        return Precio;
    }

    public String getDuracion() {
        return Duracion;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setNombreCancion(String NombreCancion) {
        this.NombreCancion = NombreCancion;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

}
