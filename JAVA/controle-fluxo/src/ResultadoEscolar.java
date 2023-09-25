public class ResultadoEscolar {

    public static void main(String[] args) {
        int nota =6;

        if(nota >= 7)
            System.out.println("Parabens voce foi aprovado!!");

        else if (nota >= 5 && nota < 7)
            System.out.println("Voce ficou de recuperacao");

        else
            System.out.println("Voce foi reprovado");
    }
}
