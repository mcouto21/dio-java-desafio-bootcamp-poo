import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);



        ///*
        // Curso 1
        System.out.println("Curso 1:");
        System.out.println(curso1);
        System.out.println();

        // Curso 2
        System.out.println("Curso 2:");
        System.out.println(curso2);
        System.out.println();
        
        // Mentoria
        System.out.println("Mentoria:");
        System.out.println(mentoria);
        System.out.println();

        // Conteudos Bootcamp
        System.out.println("Conteúdos do Bootcamp:");
        System.out.println(bootcamp.getConteudos());
        System.out.println();

        // DEVS Bootcamp
        System.out.println("DEVs Inscritos no Bootcamp:");
        System.out.println(bootcamp.getDevsInscritos());
        System.out.println();



        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());
        

        // Cria novo DEV
        Dev dev1 = new Dev();
        dev1.setNome("Nome Teste");
        
        // Inscreve em um Bootcamp
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("--------------------");
        System.out.println("Inscrição concluída! Segue abaixo os conteúdos inscritos:");
        System.out.println("Conteúdos Inscritos - DEV " + dev1.getNome() + ":\n" + dev1.getConteudosInscritos());
        System.out.println("--------------------\n");

        // System.out.println("Qtd Conteudos Inscritos: " + dev1.getConteudosInscritos().size());
        int qtdConteudos =  dev1.getConteudosInscritos().size();
        for (int i = 0; i < qtdConteudos; i++)
        {
            dev1.progredir();
            System.out.println("--------------------");
            System.out.println("Sucesso! Você concluiu um conteúdo.\nXP atual:" + dev1.calcularTotalXp());
            System.out.println("----------");
            System.out.println("Conteúdos Inscritos  - DEV " + dev1.getNome() + ":\n" + dev1.getConteudosInscritos());
            System.out.println("Conteúdos Concluídos - DEV " + dev1.getNome() + ":\n" + dev1.getConteudosConcluidos());
            System.out.println("--------------------\n");
        }

        // Tenta progredir sem conteúdos inscritos =>  "Você não está matriculado em nenhum conteúdo!"
        dev1.progredir();


        // Inscrição em curso concluído não gera erro
        dev1.inscreverBootcamp(bootcamp);
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("--------------------");
        System.out.println("Inscrição concluída! Segue abaixo os conteúdos inscritos:");
        System.out.println("Conteúdos Inscritos  - DEV " + dev1.getNome() + ":\n" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos - DEV " + dev1.getNome() + ":\n" + dev1.getConteudosConcluidos());
        System.out.println("--------------------\n");
    }
}