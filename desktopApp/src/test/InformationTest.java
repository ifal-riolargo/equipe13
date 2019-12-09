package test;

import app.information.Information;

public class InformationTest {
    public static void main(String[] args) {
        String[] bibliography = { "teste", "foi mesmo oia" };
        Information information = new Information("Titulo ok", "Content ok", "Descrição ok", bibliography);

        information.listBiblography();

    }
}