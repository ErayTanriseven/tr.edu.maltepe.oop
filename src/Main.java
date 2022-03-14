public class Main {
    public static void main(String[] args) {

        Book b1 =new Book("The 100",336, "Kass Morgan", "Brown Books");
        b1.setNumberOfPage(200);
        System.out.println(b1.getNumberOfPage());

        Book b2 =new Book("LOTR",479, "J.R.R. Tolkien", "Allen&Unwin");
        b2.setName("LOTR");
        System.out.println(b2.getName());

    }
}