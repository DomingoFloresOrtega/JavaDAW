/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcarlos.backendjavajson;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Libro{
    
    @JsonProperty("ID") 
    private String iD;
    private String title;
    private String author;
    private String content;
    private String content_short;
    private String publisher;
    private String publisher_date;
    private String pages;
    private String language;
    private String url_details;
    private String url_download;
    private String cover;
    private String thumbnail;
    private String num_comments;
    private List<Category> categories;
    private List<Tag> tags;

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

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

    public String getContent_short() {
        return content_short;
    }

    public void setContent_short(String content_short) {
        this.content_short = content_short;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher_date() {
        return publisher_date;
    }

    public void setPublisher_date(String publisher_date) {
        this.publisher_date = publisher_date;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getUrl_details() {
        return url_details;
    }

    public void setUrl_details(String url_details) {
        this.url_details = url_details;
    }

    public String getUrl_download() {
        return url_download;
    }

    public void setUrl_download(String url_download) {
        this.url_download = url_download;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getNum_comments() {
        return num_comments;
    }

    public void setNum_comments(String num_comments) {
        this.num_comments = num_comments;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Libro{" + "iD=" + iD + ", title=" + title + ", author=" + author + ", content=" + content + ", content_short=" + content_short + ", publisher=" + publisher + ", publisher_date=" + publisher_date + ", pages=" + pages + ", language=" + language + ", url_details=" + url_details + ", url_download=" + url_download + ", cover=" + cover + ", thumbnail=" + thumbnail + ", num_comments=" + num_comments + ", categories=" + categories + ", tags=" + tags + '}';
    }
    
    
}
