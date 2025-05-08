package problemSolving.problem2;

public class ques_1 {
    String title;
    String author;
    double price;

    ques_1(String title,String author, double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String toString()
    {
        return title + "\n" + author + "\n" + "Rs."+ price;
    }

    public static void main(String[] args) {
        ques_1 book1 = new ques_1("Atomic Habits", "Munal Poudel", 400);
        ques_1 book2 = new ques_1("Atomic Habits", "Namita Limbu", 450);
        System.out.println(book1.toString());
        System.out.println();
        System.out.println(book2.toString());
    }
}
