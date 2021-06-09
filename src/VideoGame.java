public class VideoGame {
    private String title;
    private String developer;
    private int releaseDate;
    private double price;
    private String genre;
    private String esrb;
    private double metaCriticScore;
    private String platform;

    //constructors
    VideoGame(String title, String developer, int releaseDate, double price, String genre, String esrb, double metaCriticScore, String platform) {
        this.title = title;
        this.developer = developer;
        this.releaseDate = releaseDate;
        this.price = price;
        this.genre = genre;
        this.esrb = esrb;
        this.metaCriticScore = metaCriticScore;
        this.platform = platform;
    }

    VideoGame(String title) {
        this.title = title;
        developer = "no developer";
        releaseDate = 000000;
        price = 0;
        genre = "no genre";
        esrb = "no ESRB";
        metaCriticScore = 0.0;
        platform = "no platform";
    }

    VideoGame(int releaseDate) {
        title = "no title";
        developer = "no developer";
        this.releaseDate = releaseDate;
        price = 0;
        genre = "no genre";
        esrb = "no ESRB";
        metaCriticScore = 0.0;
        platform = "no platform";
    }

    //accessors
    public String getTitle() {
        return title;
    }

    public String getDeveloper() {
        return developer;
    }

    public int getDate() {
        return releaseDate;
    }

    public double getPrice() {
        return price;
    }

    public String getGenre() {
        return genre;
    }

    public String getESRB() {
        return esrb;
    }

    public double getScore() {
        return metaCriticScore;
    }

    public String getPlatform() {
        return platform;
    }

    //mutators
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public void setDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setESRB(String esrb) {
        this.esrb = esrb;
    }

    public void setScore(double metaCriticScore) {
        this.metaCriticScore = metaCriticScore;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    //additional operations
    @Override public String toString() {
        return " ";
    }

    @Override public boolean equals(Object o) {
        return false;
    }

    public int hashCode() {
        return 0;
    }
}
