package com.example.playeasw.data.projectUtils;



public class InfoItems {
    public int image;
    public String Information;

    public InfoItems(int imageView,String information){
        image=imageView;
        Information=information;
    }
    public int getImage(){
       return   image;
    }
    public String getInformation(){
        return  Information;
    }
}
