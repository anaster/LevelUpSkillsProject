
public class Reading {
    private int Page;
    private int PagesCount;

    public int getPage() {
        return Page;
    }
    public int getPagesCount() {
        return PagesCount;
    }
    public void setPage(int Page) {
        this.Page = Page;
    }
    public void setPagesCount(int PagesCount) {
        this.PagesCount = PagesCount;
    }
    @Override
    public String toString(){
        return "\nYou are on page " + Page + "." +
                "\nYou've read " + PagesCount + " pages.";
    }
}
