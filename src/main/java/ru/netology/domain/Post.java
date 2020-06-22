package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int replyOwnerId;
    private int replyPostId;
    private int fromId;
    private int friendsOnly;
    private int createdBy;
    private String postType;
    private String copyright;
    private String text;
    private int datePost;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private int postponedId;
    private Place place;
    private PostSource postSource;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private CommentsInfo commentsInfo;
    private ViewsInfo viewsInfo;
    private Geo geo;
}