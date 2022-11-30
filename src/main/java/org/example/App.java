package org.example;

import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, informe o seu nome");
        String nome = scanner.next();
        System.out.println("Informe o seu sobrenome");
        String sobrenome = scanner.next();
        System.out.println("Informe o ano do seu nascimento");
        LocalDate datanascimento = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.printf("Ola meu nome %s %s tenho d%", nome, sobrenome, LocalDate.now().until(datanascimento, ChronoUnit.YEARS));
    }
}
