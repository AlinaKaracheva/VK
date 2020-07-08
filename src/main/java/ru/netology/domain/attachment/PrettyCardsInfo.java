package ru.netology.domain.attachment;

public class PrettyCardsInfo {
    private PrettyCardsInfo[] cards;
        private String cardIn;
        private String linkUrl;
        private String title;
        private String price;
        private String priceOld;
        
    private PrettyCardsInfo[] images;
        private String url;
        private int width;
        private int height;

    public PrettyCardsInfo[] getCards() {
        return cards;
    }

    public void setCards(PrettyCardsInfo[] cards) {
        this.cards = cards;
    }

    public String getCardIn() {
        return cardIn;
    }

    public void setCardIn(String cardIn) {
        this.cardIn = cardIn;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPriceOld() {
        return priceOld;
    }

    public void setPriceOld(String priceOld) {
        this.priceOld = priceOld;
    }

    public PrettyCardsInfo[] getImages() {
        return images;
    }

    public void setImages(PrettyCardsInfo[] images) {
        this.images = images;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
