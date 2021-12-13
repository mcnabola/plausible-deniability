package com.blog.plausibledeniability;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

//the example guide isnt great - has mistakes in it - also the file dir was diff. to the one used in this
//also no imports in teh example


@Entity //(1)
public class Blog {


    private @Id @GeneratedValue Long id; //(2)
    private String title;
    private String author;
    private String content;

    private Blog() {}

    public Blog(String title, String author, String content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }

    //Wont have an equals in this - or actually maybe we will
    //was thinking cant ahve two of the same employees
    //probably used for searching

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blog blog = (Blog) o;
        return Objects.equals(id, blog.id) &&
                Objects.equals(title, blog.title) &&
                Objects.equals(author, blog.author) &&
                Objects.equals(content, blog.content);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, title, author, content);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //add lombok eventually
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
