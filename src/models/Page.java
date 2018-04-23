/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Page {
    private ArrayList<Sticker> stickers;
    private Page next;

    public Page(ArrayList<Sticker> stickers) {
        this.stickers = stickers;
    }

    public ArrayList<Sticker>openPack(){
        
    }
    public ArrayList<Sticker> getStickers() {
        return stickers;
    }

    public void setStickers(ArrayList<Sticker> stickers) {
        this.stickers = stickers;
    }
    
    
}
