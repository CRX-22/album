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
    private String information;
    private Sticker next;
    private int y;

    public Sticker(int number, String information) {
        this.number = number;
        this.information = information;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
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
