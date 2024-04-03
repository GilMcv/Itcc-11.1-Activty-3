public class Student extends LibraryUser {

    @Override
    public void printItemsBorrowed() {
        System.out.println("Student has borrowed the following items:");
        for (LibraryItem item : borrowedItems) {
            if (item instanceof Book) {
                Book book = (Book) item;
                System.out.println("Book: '" + book.getTitle() + "' by " + book.getAuthor());
            } else if (item instanceof DVD) {
                DVD dvd = (DVD) item;
                System.out.println("DVD: '" + dvd.getTitle() + "' directed by " + dvd.getDirector());
            }
        }
    }
}
