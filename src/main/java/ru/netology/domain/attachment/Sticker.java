package ru.netology.domain.attachment;

public class Sticker {
    private int productId;
    private int stickerId;
    private String url;
    private int width;
    private int height;

    private Sticker[] images;
    private Sticker[] imagesWithBackground;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getStickerId() {
        return stickerId;
    }

    public void setStickerId(int stickerId) {
        this.stickerId = stickerId;
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

    public Sticker[] getImages() {
        return images;
    }

    public void setImages(Sticker[] images) {
        this.images = images;
    }

    public Sticker[] getImagesWithBackground() {
        return imagesWithBackground;
    }

    public void setImagesWithBackground(Sticker[] imagesWithBackground) {
        this.imagesWithBackground = imagesWithBackground;
    }
}






