import pojo.Magdalena;



public class Main {
    public static void main(String[] args) {

        Magdalena magdalena = new Magdalena("picante", "EL GUERO");
        Magdalena magdalena2 = new Magdalena("chocolate", "NEGRITON");
        Magdalena magdalena3 = new Magdalena("limon", "LIMONCIN");
        Magdalena magdalena4 = new Magdalena("vainilla", "BLANQUITO");

        Magdalena[] ListaMagdalena = new Magdalena[4];
        ListaMagdalena[0] = magdalena;
        ListaMagdalena[1] = magdalena2;
        ListaMagdalena[2] = magdalena3;
        ListaMagdalena[3] = magdalena4;

        for (int i = 0; i < ListaMagdalena.length; i++) {
            System.out.println(ListaMagdalena[i].toString() + " Sabor: " + ListaMagdalena[i].addSabor() + " Nombre: " + ListaMagdalena[i].addNombre());
        }



    }
}