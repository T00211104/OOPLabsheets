package Lab4.exercise3;

public class book {
    String title;
    double price;
    String ISBN;
    int pages;

    public book(){
        this("Title Not Available",0.00,"ISBN Not Available",0);
    }

    public book(String title,double price,String ISBN,int pages){
        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setPages(pages);
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;

    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public String toString() {
        return "Title: " + getTitle() + "Price: " + getPrice() + "ISBN: " + getISBN() +
                "No. of Pages: " + getPages();
    }


}
