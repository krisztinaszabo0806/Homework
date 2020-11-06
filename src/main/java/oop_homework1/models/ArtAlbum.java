package oop_homework1.models;

public class ArtAlbum extends Book {

    private String paperQuality;

    public ArtAlbum(String name, int numberOfPages, String paperQuality) {
        this.paperQuality = paperQuality;
        super.name = name;
        super.numberOfPages = numberOfPages;
    }

}
