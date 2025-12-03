import java.nio.file.Watchable;

public class Movie {
    private String title;


    public Movie(String title)
    {
        this.title=title;
    }
    public void WatchMovie()

    {
        String a=this.getClass().getSimpleName();
        System.out.println(title+" is the "+a);
    }

}
class Adventures extends Movie
{
    public Adventures(String title)
    {

        super(title);
    }



    @Override
    public void WatchMovie()
    {
        super.WatchMovie();
        System.out.printf("..%s%n".repeat(3),"plesent","Scary","Something fishy");
    }


}
class Comdey extends Movie
{
    public Comdey(String t)
    {
        super(t);
    }
    @Override
    public void WatchMovie()
    {
        super.WatchMovie();
        System.out.printf("..%s%n".repeat(3),"comedy","More comedy","Happy end");
    }

}
class Scientific extends Movie
{
    public Scientific(String t)
    {
        super(t);
    }
    @Override
    public void WatchMovie()
    {
        super.WatchMovie();
        System.out.printf("..%s%n".repeat(3),"Bad Aliens do bad stuff","Space guys chase Aliens","Planet glow up");
    }

}
