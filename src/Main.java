import br.com.dio.desafio.dominio.*;

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

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devCamila.getNome() + ": " + devCamila.getConteudosInscritos());

        devCamila.progredir();
        devCamila.progredir();
        System.out.println("====");
        System.out.println("Conteúdos Inscritos " + devCamila.getNome() + ": " + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos " + devCamila.getNome() + ": " + devCamila.getConteudosConcluidos());
        System.out.println("XP " + devCamila.getNome() + ": " + devCamila.calcularTotalXP());

        System.out.println("##################################");

        Dev devLazaro = new Dev();
        devLazaro.setNome("Lázaro");
        devLazaro.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devLazaro.getNome() + ": " + devLazaro.getConteudosInscritos());

        devLazaro.progredir();
        devLazaro.progredir();
        devLazaro.progredir();
        System.out.println("====");
        System.out.println("Conteúdos Inscritos " + devLazaro.getNome() + ": " + devLazaro.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos " + devLazaro.getNome() + ": " + devLazaro.getConteudosConcluidos());
        System.out.println("XP " + devLazaro.getNome() + ": " + devLazaro.calcularTotalXP());


    }
}
