package pojo;

public class Magdalena {
    //ATRIBUTOS
    private String sabor;
    private String color;
    private String forma;
    private String relleno;

    //CONSTRUCTOR
    //public Magdalena(){} //CONTRASEÑA VACÍA
    public Magdalena(String sabor, String color,String forma, String relleno){
        System.out.println("Color" + color);
        System.out.println("Sabor" + sabor);
        System.out.println("Forma" + forma);
        System.out.println("Relleno" + relleno);
        this.sabor=sabor;
        this.color=color;
        this.forma=forma;
        this.relleno=relleno;
    }
    //MÉTODO
    public void hornear(){
        System.out.println("Hornear la mag ");
        System.out.println(" de" + this.sabor + "y "+ this.color);
        System.out.println("Estoy horneando la mag");
    }
    public void partirla(){
        System.out.println("Partir la mag ");
        System.out.println(" de" + this.forma + " y" + this.relleno);
        System.out.println("Estoy partiendo la mag");
    }
}
