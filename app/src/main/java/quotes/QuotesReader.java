package quotes;

import java.io.*;
import java.util.ArrayList;


public class QuotesReader {
    ArrayList<String> tags;
    String author;
    String likes;
    String text;


    public QuotesReader( ) {

        this.author = author;

        this.text = text;

    }


    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public String toString() {
        return "{" +
                "author='" + author + '\'' +
                ", text='" + text + '\'' +
                '}';

    }
}