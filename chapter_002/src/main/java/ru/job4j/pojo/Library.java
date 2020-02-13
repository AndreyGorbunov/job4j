package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book cleanCode = new Book("Clean code", 1000);
        Book gameOfThrones = new Book("Game of Thrones", 2000);
        Book garryPotter = new Book("Garry Potter", 3000);
        Book theWitcher = new Book("The Witcher", 4000);

        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = gameOfThrones;
        books[2] = garryPotter;
        books[3] = theWitcher;

        for(int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getSumOfPages());
        }

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for(int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getSumOfPages());
        }

        for(int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if(bk.equals(cleanCode)) {
                System.out.println(bk.getName() + " - " + bk.getSumOfPages());
            }
        }
    }
}
