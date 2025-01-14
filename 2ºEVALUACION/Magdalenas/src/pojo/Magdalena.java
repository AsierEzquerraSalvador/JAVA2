package pojo;

public class Magdalena {

    private String nombre;
    private String sabor;


    public Magdalena(String sabor, String nombre) {
        this.sabor = sabor;
        this.nombre = nombre;

    }

    public String addSabor() {
        return sabor;
    }

    public String addNombre() {
        return nombre;
    }

    private void ImprimirMagdanela(){
        System.out.println("Magdalea" + "Sabor" + sabor + "Nombre" + nombre);
    }


}


