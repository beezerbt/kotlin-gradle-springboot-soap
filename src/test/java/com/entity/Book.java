package com.entity;

import javax.xml.bind.annotation.*;
import java.util.Date;

@XmlRootElement(name = "book")
@XmlType(propOrder = {"id", "name"})
public class Book {
    public Long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    private Long id;
    private String name;
    private String author;
    private Date date;

    @XmlAttribute
    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement(name = "title")
    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    // constructor, getters and setters
}
