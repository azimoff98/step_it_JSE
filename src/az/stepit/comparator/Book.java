package az.stepit.comparator;

public class Book implements Comparable<Book>{

    private Long id;
    private String name;
    private String author;
    private double ranking;
    private double price;

    public Book() {
    }

    public Book(Long id, String name, String author, double ranking, double price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.ranking = ranking;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getRanking() {
        return ranking;
    }

    public void setRanking(double ranking) {
        this.ranking = ranking;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Book{ id: ")
                .append(this.id)
                .append(", ranking: ")
                .append(this.ranking)
                .append(" }");

        return sb.toString();
    }

    @Override
    public int compareTo(Book o) {
       return (this.ranking > o.ranking) ? 1 : (this.ranking < o.ranking) ? -1 : 0;
    }
}
