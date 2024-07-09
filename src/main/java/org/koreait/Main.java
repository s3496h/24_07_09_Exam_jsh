package org.koreait;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Article> articles = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int lastArticleId = 0;

        System.out.println("== 명언 앱 실행 == ");
        while (true) {
            System.out.print("명령어 : ");
            String cmd = sc.nextLine().trim();

            if (cmd.equals("exit")) {
                break;
            }
            if (cmd.equals("등록")) {
                int id = lastArticleId + 1;
                System.out.println("작가 : ");
                String author = sc.nextLine();
                System.out.println("명언 : ");
                String content = sc.nextLine();

                Article article = new Article(id, author, content);
                articles.add(article);

                System.out.println(id + "번 명언이 등록되었습니다.");
                lastArticleId++;
            }
            if (cmd.equals("목록")) {
                System.out.println("번호/ 작가 / 명언 ");
                for (int i = articles.size() - 1; i >= 0; i--) {
                    Article article = articles.get(i);
                    System.out.printf("%d / %s / %s \n", article.getId(), article.getAuthor(), article.getContent());
                }
                if (cmd.startsWith("상세보기"));
                String[] cmdbits = cmd.split(" ");

                }
            }
        }


        System.out.println("==프로그램 종료==");
    }
}

class Article {
    private int id;
    private String author;
    private String content;

    public Article(int id, String author, String content) {
        this.id = id;
        this.author = author;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}