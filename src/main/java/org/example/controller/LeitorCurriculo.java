package org.example.controller;

import com.google.gson.Gson;
import org.example.model.Curriculo;

import java.io.FileReader;
import java.io.Reader;

public class LeitorCurriculo {
    public Curriculo lerArquivoJson() {
        Gson gson = new Gson();

        try (Reader leitor = new FileReader("curriculo.json")) {

            return gson.fromJson(leitor, Curriculo.class);

        } catch (Exception e) {
            System.out.println("Erro: Não foi possível ler o arquivo do currículo.");
            System.out.println("Detalhe técnico: " + e.getMessage());
            return null;
        }
    }

}
