import com.dio.desafio.dominio.Bootcamp;
import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Dev;
import com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Curso 1
        Curso c = new Curso();
        c.setTitulo("Curso de Poo");
        c.setCargaHoraria(10);
        c.setDesc("CURSO DE POO");

        System.out.println(c.toString());

        //Curso 2
        Curso p = new Curso();
        p.setTitulo("Curso de Pentest");
        p.setCargaHoraria(150);
        p.setDesc("CURSO DE PENTEST WEB");

        System.out.println(p.toString());

        //Mentoria
        Mentoria m = new Mentoria();
        m.setData(LocalDate.now());
        m.setTitulo("Mentoria Java POO");
        m.setDesc("Mentoria");

        System.out.println(m.toString());

        Bootcamp b = new Bootcamp();
        b.setNome("Java Dev");
        b.setDesc("Java POO");
        b.getContents().add(c);
        b.getContents().add(p);
        b.getContents().add(m);


        Dev d = new Dev();
        d.setNome("Matheu");
        d.inscreverBootcamp(b);
        d.progredir();


        Dev e = new Dev();
        e.setNome("João");


        System.out.println("Conteudos Inscritos: " + d.getConteudosInscritos());
        System.out.println("Conteudos Concluidos: " + d.getConteudosConcluidos());
        System.out.println(d.calcularTotalXp());

        d.progredir();
        System.out.println(d.calcularTotalXp());

    }
}