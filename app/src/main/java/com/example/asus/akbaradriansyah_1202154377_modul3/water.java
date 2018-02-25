package com.example.asus.akbaradriansyah_1202154377_modul3;

public class water {
    String title, description, detail;
    int image;

    public water(String title, String description, String detail, int image){
        this.title= title;
        this.description=description;
        this.detail= detail;
        this.image= image;

    }

    public String getTitle() {
        return title;
    }

    public String getDescpription() {
        return description;
    }

    public String getDetail() {
        return detail;
    }

    public int getImage() {
        return image;
    }
}