public class DVD implements LibraryItem {
    private String title;
    private String director;
    private int runningTime;
    private boolean borrowed;

    public DVD(String title, String director, int runningTime) {
        this.title = title;
        this.director = director;
        this.runningTime = runningTime;
        this.borrowed = false;
    }

    @Override
    public void borrowItem() {
        if (!borrowed) {
            borrowed = true;
            System.out.println("DVD '" + title + "' directed by " + director + " has been borrowed.");
        } else {
            System.out.println("DVD is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        if (borrowed) {
            borrowed = false;
            System.out.println("DVD '" + title + "' directed by " + director + " has been returned.");
        } else {
            System.out.println("DVD is not borrowed.");
        }
    }

    @Override
    public boolean isBorrowed() {
        return borrowed;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getRunningTime() {
        return runningTime;
    }
}
