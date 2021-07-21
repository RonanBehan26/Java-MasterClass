public class Song {
    //Tim's work

    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override //good easy way of printing out the contents of the objects
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
