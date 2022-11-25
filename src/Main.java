import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин");
        Author eckel = new Author("Брюс", "Эккель");

        Book queenOfSpades = new Book("Пиковая дама", pushkin, 1833);
        Book thinkingInJava = new Book("Философия Java", eckel, 2006);

        System.out.println(queenOfSpades.getTitle() + " " + queenOfSpades.getAuthorName() + " " +
                queenOfSpades.getAuthorSurname() + " " + queenOfSpades.getPublishingYear());
        System.out.println(thinkingInJava.getTitle() + " " + thinkingInJava.getAuthorName() + " " +
                thinkingInJava.getAuthorSurname() + " " + thinkingInJava.getPublishingYear());

        queenOfSpades.setPublishingYear(1933);
        System.out.println(queenOfSpades.getTitle() + " " + queenOfSpades.getAuthorName() + " " +
                queenOfSpades.getAuthorSurname() + " " + queenOfSpades.getPublishingYear());

        // Задание 2
        System.out.println("Задание 2");

        System.out.println(pushkin.toString());
        System.out.println(queenOfSpades);

        System.out.println(pushkin.equals(pushkin));
        System.out.println(queenOfSpades.equals(queenOfSpades));

        System.out.println(pushkin.hashCode());
        System.out.println(queenOfSpades.hashCode());

    }
}