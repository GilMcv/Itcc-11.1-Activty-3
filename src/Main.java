public class Main {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("Java Programming", "John Doe", 2020);
        Book book2 = new Book("Data Structures", "Jane Smith", 2018);

        // Create DVDs
        DVD dvd1 = new DVD("The Avengers", "Joss Whedon", 143);
        DVD dvd2 = new DVD("Inception", "Christopher Nolan", 148);

        // Create student and teacher
        Student student = new Student();
        Teacher teacher = new Teacher();

        // Demonstrate borrowing and returning items
        student.borrowItem(book1);
        student.borrowItem(dvd1);
        teacher.borrowItem(book2);
        teacher.borrowItem(dvd2);

        student.printItemsBorrowed();
        teacher.printItemsBorrowed();

        student.returnItem(book1);
        teacher.returnItem(dvd2);

        student.printItemsBorrowed();
        teacher.printItemsBorrowed();
    }
}
