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
public class Pack {
    private ArrayList<Sticker> stickers;
    private int y;

    public Pack(ArrayList<Sticker> stickers) {
        this.stickers = stickers;
    }

    public ArrayList<Sticker> getStickers() {
        return stickers;
    }

    public void setStickers(ArrayList<Sticker> stickers) {
        this.stickers = stickers;
    }

    public int getY() {
		return y;
	}

	public void move() {
		if (y < 300) {
			
			y+=3;
		}
	}
    
}
