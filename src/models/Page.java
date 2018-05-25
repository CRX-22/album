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
    private Sticker[] stickers;
    private Page next;
    private int number;
    
    public Page(int number) {
        stickers = new Sticker[10];
        switch(number){
            case 1: 
                for (int i = 0; i < 10; i++) {
                    stickers[i]= new Sticker(i+1);
                }
                break;
            case 2: 
                for (int i = 0; i < 10; i++) {
                    stickers[i]= new Sticker(i+11);
                }
                break;
            case 3: 
                for (int i = 0; i < 10; i++) {
                    stickers[i]= new Sticker(i+21);
                }
                break;
            case 4: 
                for (int i = 0; i < 10; i++) {
                    stickers[i]= new Sticker(i+31);
                }
                break;
            case 5: 
                for (int i = 0; i < 10; i++) {
                    stickers[i]= new Sticker(i+41);
                }
                break;
            case 6: 
                for (int i = 0; i < 10; i++) {
                    stickers[i]= new Sticker(i+51);
                }
                break;
            case 7: 
                for (int i = 0; i < 10; i++) {
                    stickers[i]= new Sticker(i+61);
                }
                break;
            case 8: 
                for (int i = 0; i < 10; i++) {
                    stickers[i]= new Sticker(i+71);
                }
                break;
            case 9: 
                for (int i = 0; i < 10; i++) {
                    stickers[i]= new Sticker(i+81);
                }
                break;
            case 10: 
                for (int i = 0; i < 10; i++) {
                    stickers[i]= new Sticker(i+91);
                }
                break;
        }
        }

    public Sticker[] getStickers() {
        return stickers;
    }

    public void setStickers(Sticker[] stickers) {
        this.stickers = stickers;
    }

    public Page getNext() {
        return next;
    }

    public void setNext(Page next) {
        this.next = next;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
        
    

    
    
    
}
