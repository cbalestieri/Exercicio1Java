import java.util.ArrayList;
import java.util.List;

public class Array {
    ccString[] args) {
        List<String> nomesAlunos = new ArrayList<>();
        String nome1 = "Camille";
        nomesAlunos.add(nome1);

        String nome2 = "Lia";
        nomesAlunos.add(nome2);

        String nome3 = "Sara";
        nomesAlunos.add(nome3);

        String nome4 = "Rosa";
        nomesAlunos.add(nome4);

        System.out.println(nomesAlunos);

        System.out.println(nomesAlunos.get(0));

        System.out.println(nomesAlunos.get(1));

        for (int i= 0; i < nomesAlunos.size(); i++){
            System.out.println(nomesAlunos.get(i));
        }
    }
}