package com.company.polymorphism;

class Publication {
    protected String title;

    public Publication(String title) {
        this.title = title;
    }

    public final String getInfo() {
        return getType() + getDetails() + ": " + title;
    }

    public String getType() {
        return "Publication";
    }

    public String getDetails() {
        return "";
    }
}

class Newspaper extends Publication {
    private String source;

    public Newspaper(String title, String source) {
        super(title);
        this.source = source;
    }

    public String getType() {
        return "Newspaper";
    }

    public String getDetails() {
        return " (source - " + source + ")";
    }
}

class Article extends Publication {
    private String author;

    public Article(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public String getType() {
        return "Article";
    }
    @Override
    public String getDetails() {
        return " (author - " + author + ")";
    }
}

class Announcement extends Publication {
    private int daysToExpire;

    public Announcement(String title, int daysToExpire) {
        super(title);
        this.daysToExpire = daysToExpire;
    }

    @Override
    public String getType() {
        return "Announcement";
    }
    @Override
    public String getDetails() {
        return " (days to expire - " + daysToExpire + ")";
    }
}

/**
 * method overriding is a kind of dynamic polymorphism
 */
public class Subclasses {
    public static void main(String[] args) {
        Publication publication = new Publication("The new era");
        System.out.println(publication.getInfo());
        Newspaper newspaper = new Newspaper("Football results", "Sport News");
        System.out.println(newspaper.getInfo());
        Article article = new Article("Why the Sun is hot", "Dr James Smith");
        System.out.println(article.getInfo());
        Announcement announcement = new Announcement("Will sell a house", 30);
        System.out.println(announcement.getInfo());
    }
}
