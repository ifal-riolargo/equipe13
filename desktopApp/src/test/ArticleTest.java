package test;

import app.information.Article;

public class ArticleTest {
    public static void main(String[] args) {
        String[] bibliography = { "uma", "duas referências" };

        Article article = new Article("Titulo do artigo", "Conteudo principal", "Descrição sobre o tema", bibliography,
                "Resumo do artigo");

        System.out.println(article.getAbstrakt());
        System.out.println(article.getTitle());
        System.out.println(article.getContent());
        System.out.println(article.getDescription());

        article.listBiblography();
    }
}