

public class MagdalenaFactory {
    int contador = 0;
    private Magdalena[] lstMagdalena = new Magdalena[4];

    private void addMagdalena(Magdalena miMagdalena){
        lstMagdalena[contador] = miMagdalena;
        contador++;

    }
    private void printMagdalena(){
        Magdalena magdalena;
        for (int i = 0; i <lstMagdalena.length ; i++) {
            magdalena = lstMagdalena[i];
            System.out.print("Magdalena: ["+ i +"]");
            System.out.print("Atributos: Sabor - " + magdalena.getSabor());
            System.out.println("Atributos: Color - " + magdalena.g );

        }
    }
}