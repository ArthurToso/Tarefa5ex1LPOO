public class UsaBicicleta {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta(){
            @Override
            void aplicarFreios(int decremento){
                velocidade = velocidade - 2 * decremento;
            }
        };

        bicicleta.mudarCadencia(10);
        bicicleta.mudarMarcha(3);
        bicicleta.aumentarVelocidade(30);

        System.out.println("Bicicleta antes de aplicar os freios: ");
        bicicleta.printStates();

        bicicleta.aplicarFreios(5);

        System.out.println("Bicicleta apos aplicar freios");
        bicicleta.printStates();

    }
}