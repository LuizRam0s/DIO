public class exemploForArray {

    public static void main(String[] args) {
        String alunos[] = {" FELIPE", " JONAS", " JULIA", " MARCOS"};

/*primeiro modo arrays com metodo for
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x =" + x + " é" + alunos[x]);
        }
 */
// segundo metodo com for each
for (String aluno : alunos){
    System.out.println("Nome do aluno é: "+ aluno);
}

    }
}