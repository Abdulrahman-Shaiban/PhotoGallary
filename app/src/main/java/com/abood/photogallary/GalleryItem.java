package com.abood.photogallary;

public class GalleryItem {

    private String gCaption;
    private String gId;
    private String gUrl;


    @Override
    public String toString() {
        return gCaption;
    }

    public String getgCaption() {
        return gCaption;
    }

    public void setgCaption(String gCaption) {
        this.gCaption = gCaption;
    }

    public String getgId() {
        return gId;
    }

    public void setgId(String gId) {
        this.gId = gId;
    }

    public String getgUrl() {
        return gUrl;
    }

    public void setgUrl(String gUrl) {
        this.gUrl = gUrl;
    }
}
