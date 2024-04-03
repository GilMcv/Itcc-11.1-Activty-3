import java.util.ArrayList;
import java.util.List;

public abstract class LibraryUser {
    protected List<LibraryItem> borrowedItems;

    public LibraryUser() {
        this.borrowedItems = new ArrayList<>();
    }

    public void borrowItem(LibraryItem item) {
        item.borrowItem();
        borrowedItems.add(item);
    }

    public void returnItem(LibraryItem item) {
        item.returnItem();
        borrowedItems.remove(item);
    }

    public abstract void printItemsBorrowed();
}
