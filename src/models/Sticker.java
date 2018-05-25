/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Dell
 */
public class Sticker {
    private int number;
    private Sticker next;
    private int y;

    public Sticker(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

 
    public Sticker getNext() {
        return next;
    }

    public void setNext(Sticker next) {
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
