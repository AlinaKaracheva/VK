package ru.netology.domain;

public class ActPost {

    private boolean bookmark;
    private boolean complane;
    private int repost;
    private int like;

    public boolean isBookmark() {
        return bookmark;
    }

    public void setBookmark(boolean bookmark) {
        this.bookmark = bookmark;
    }

    public boolean isComplane() {
        return complane;
    }

    public void setComplane(boolean complane) {
        this.complane = complane;
    }

    public int getRepost() {
        return repost;
    }

    public void setRepost(int repost) {
        this.repost = repost;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
}
