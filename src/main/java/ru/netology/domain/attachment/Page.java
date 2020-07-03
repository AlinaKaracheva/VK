package ru.netology.domain.attachment;

public class Page {
    private int id;
    private int groupId;
    private int creatorId;
    private String title;
    private int currentUserCanEdit;
    private int currentUserCanEditAccess;
    private int whoCanView;
    private int whoCanEdit;
    private int lastModifiedDate;
    private int dateOfCreation;
    private int editorId;
    private int views;
    private String parentPageForNavigation;
    private String parentPageForNavigation2;
    private String source;
    private String html;
    private String viewUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(int creatorId) {
        this.creatorId = creatorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCurrentUserCanEdit() {
        return currentUserCanEdit;
    }

    public void setCurrentUserCanEdit(int currentUserCanEdit) {
        this.currentUserCanEdit = currentUserCanEdit;
    }

    public int getCurrentUserCanEditAccess() {
        return currentUserCanEditAccess;
    }

    public void setCurrentUserCanEditAccess(int currentUserCanEditAccess) {
        this.currentUserCanEditAccess = currentUserCanEditAccess;
    }

    public int getWhoCanView() {
        return whoCanView;
    }

    public void setWhoCanView(int whoCanView) {
        this.whoCanView = whoCanView;
    }

    public int getWhoCanEdit() {
        return whoCanEdit;
    }

    public void setWhoCanEdit(int whoCanEdit) {
        this.whoCanEdit = whoCanEdit;
    }

    public int getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(int lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public int getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(int dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public int getEditorId() {
        return editorId;
    }

    public void setEditorId(int editorId) {
        this.editorId = editorId;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public String getParentPageForNavigation() {
        return parentPageForNavigation;
    }

    public void setParentPageForNavigation(String parentPageForNavigation) {
        this.parentPageForNavigation = parentPageForNavigation;
    }

    public String getParentPageForNavigation2() {
        return parentPageForNavigation2;
    }

    public void setParentPageForNavigation2(String parentPageForNavigation2) {
        this.parentPageForNavigation2 = parentPageForNavigation2;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getViewUrl() {
        return viewUrl;
    }

    public void setViewUrl(String viewUrl) {
        this.viewUrl = viewUrl;
    }
}
