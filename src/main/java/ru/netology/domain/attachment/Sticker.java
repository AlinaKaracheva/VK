package ru.netology.domain.attachment;

public class Sticker {
    private int productId;
    private int stickerId;

    private Sticker[] images() {
        String url;
        int width;
        int height;
        return null;
    }

    private Sticker[] imagesWithBackground() {
        String url;
        int width;
        int height;
        return null;
    }

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
}
