public class Book {
    private String title;
    private String author;
    private double prize;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        if(prize>0) {
            this.prize = prize;
        }
    }
    @Override
    public String toString()
    {
        return "Title:"+title+" Author:"+author+" Prize:"+prize;
    }
}
