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
    private Sticker[] stickers;
    private int y;
    private Pack next;

    public Pack() {
        this.stickers = new Sticker[5];
        for (int i = 0; i < 5; i++) {
            stickers[i] = new Sticker((int) (Math.random()*100));
        }
    }

    public Sticker[] getStickers() {
        return stickers;
    }

    public void setStickers(Sticker[] stickers) {
        this.stickers = stickers;
    }

    public Pack getNext() {
        return next;
    }

    public void setNext(Pack next) {
        this.next = next;
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
