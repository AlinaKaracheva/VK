package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private boolean canPost;
    private int sorting;
    private int likes;
    private boolean delete;
    private boolean reply;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanPost() {
        return canPost;
    }

    public void setCanPost(boolean canPost) {
        this.canPost = canPost;
    }

    public int getSorting() {
        return sorting;
    }

    public void setSorting(int sorting) {
        this.sorting = sorting;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public boolean isDelete() {
        return delete;
    }

    public void setDelete(boolean delete) {
        this.delete = delete;
    }

    public boolean isReply() {
        return reply;
    }

    public void setReply(boolean reply) {
        this.reply = reply;
    }
}