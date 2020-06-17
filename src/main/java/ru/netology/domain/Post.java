package ru.netology.domain;

import ru.netology.domain.ActPost;
import ru.netology.domain.CommentsInfo;
import ru.netology.domain.NamePost;

public class Post {
    private int id;
    private NamePost namePost;
    private String text;
    private CommentsInfo commentsInfo;
    private int datePost;
    private int urlImage;
    private int attachmentURL;
    private ActPost actPost;
    private Views views;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NamePost getNamePost() {
        return namePost;
    }

    public void setNamePost(NamePost namePost) {
        this.namePost = namePost;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public int getDatePost() {
        return datePost;
    }

    public void setDatePost(int datePost) {
        this.datePost = datePost;
    }

    public int getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(int urlImage) {
        this.urlImage = urlImage;
    }

    public int getAttachmentURL() {
        return attachmentURL;
    }

    public void setAttachmentURL(int attachmentURL) {
        this.attachmentURL = attachmentURL;
    }

    public ActPost getActPost() {
        return actPost;
    }

    public void setActPost(ActPost actPost) {
        this.actPost = actPost;
    }

    public Views getViews() {
        return views;
    }

    public void setViews(Views views) {
        this.views = views;
    }
}
