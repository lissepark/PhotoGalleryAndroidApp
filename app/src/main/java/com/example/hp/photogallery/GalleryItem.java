package com.example.hp.photogallery;

/**
 * Created by hp on 10.08.15.
 */
public class GalleryItem {
    private String mCaption;
    private String mID;
    private String mURL;
    private String mOwner;

    public String getCaption() {
        return mCaption;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    public String getID() {
        return mID;
    }

    public void setID(String ID) {
        mID = ID;
    }

    public String getURL() {
        return mURL;
    }

    public void setURL(String URL) {
        mURL = URL;
    }

    public String getOwner(){
        return mOwner;
    }

    public void setOwner(String owner){
        mOwner = owner;
    }

    public String getPhotoPageUrl(){
        return "http://www.flickr.com/photos/"+mOwner+"/"+mID;
    }

    public String toString(){
        return mCaption;
    }
}
