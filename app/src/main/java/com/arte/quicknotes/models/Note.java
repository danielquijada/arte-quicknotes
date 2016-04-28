package com.arte.quicknotes.models;

import java.io.Serializable;

/**
 * Created by dquijada on 27/04/2016.
 */
public class Note implements Serializable {

    private String title;
    private String content;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExcerpt() {
        if (content == null) {
            return "";
        }

        if (content.length() < 100) {
            return content;
        }

        return content.substring(0, 100);
    }
}
