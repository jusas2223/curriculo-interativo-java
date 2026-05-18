package org.example;

import org.example.controller.LeitorCurriculo;
import org.example.model.Curriculo;
import org.example.model.Experiencia;
import org.example.model.Formacao;
import org.example.model.Projeto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LeitorCurriculo leitor = new LeitorCurriculo();
        Curriculo curriculo = leitor.lerArquivoJson();

        if (curriculo == null) {
            System.out.println("Encerrando o sistema. Verifique os erros acima.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("\n=======================================================");
            System.out.println("      CURRÍCULO INTERATIVO - " + curriculo.getNome().toUpperCase());
            System.out.println("=======================================================");
            System.out.println("1. Ver Objetivo Profissional");
            System.out.println("2. Ver Habilidades Técnicas");
            System.out.println("3. Ver Experiência Profissional");
            System.out.println("4. Ver Formação Acadêmica");
            System.out.println("5. Ver Projetos do Portfólio");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção digitando o número: ");

            if (!scanner.hasNextInt()) {
                System.out.println("\n[!] Opção inválida! Por favor, digite apenas números.");
                scanner.next(); // Limpa o "lixo" que o usuário digitou
                continue;
            }

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- OBJETIVO PROFISSIONAL ---");
                    System.out.println(curriculo.getObjetivo());
                    break;
                case 2:
                    System.out.println("\n--- HABILIDADES TÉCNICAS ---");
                    for (String hab : curriculo.getHabilidades()) {
                        System.out.println("• " + hab);
                    }
                    break;
                case 3:
                    System.out.println("\n--- EXPERIÊNCIA PROFISSIONAL ---");
                    for (Experiencia exp : curriculo.getExperiencias()) {
                        System.out.println("Cargo: " + exp.getCargo());
                        System.out.println("Empresa: " + exp.getEmpresa() + " | Período: " + exp.getPeriodo());
                        System.out.println("Atividades: " + exp.getDescricao());
                        System.out.println("-----------------------------");
                    }
                    break;
                case 4:
                    System.out.println("\n--- FORMAÇÃO ACADÊMICA ---");
                    for (Formacao form : curriculo.getFormacoes()) {
                        System.out.println("Curso: " + form.getCurso());
                        System.out.println("Instituição: " + form.getInstituicao() + " | Período: " + form.getPeriodo());
                        System.out.println("-----------------------------");
                    }
                    break;
                case 5:
                    System.out.println("\n--- PROJETOS DO PORTFÓLIO ---");
                    for (Projeto proj : curriculo.getProjetos()) {
                        System.out.println("Projeto: " + proj.getNome());
                        System.out.println("Tecnologias: " + proj.getTecnologias());
                        System.out.println("Descrição: " + proj.getDescricao());
                        System.out.println("Link GitHub: " + proj.getLink());
                        System.out.println("-----------------------------");
                    }
                    break;
                case 6:
                    System.out.println("\nObrigado por acessar o currículo interativo. Até a próxima!");
                    break;
                default:
                    System.out.println("\n[!] Opção inexistente. Tente um número de 1 a 6.");
            }
        }

        scanner.close();
    }
}