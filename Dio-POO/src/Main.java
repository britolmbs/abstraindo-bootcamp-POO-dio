import br.com.dio.dominio.Bootcamp;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Dev;
import br.com.dio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Java");
        curso2.setDescricao("Descrição Curso Java");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.increverBootcamp(bootcamp);
        System.out.println("Conteudos Iscritos Lucas: " + devLucas.getConteudosInscritos());
        devLucas.progredir();
        System.out.println("Conteudos Concluidos Lucas: " + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.CalcularTotalXp());

        System.out.println("----------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.increverBootcamp(bootcamp);
        System.out.println("Conteudos Iscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteudos Concluidos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.CalcularTotalXp());

            }
}
