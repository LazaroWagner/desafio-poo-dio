import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Mentoria mentoria = new Mentoria();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

    }
}
