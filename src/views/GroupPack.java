/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import models.Pack;

/**
 *
 * @author Dell
 */
public class GroupPack {
    private Pack head;

    public GroupPack() {
    }

    public Pack getHead() {
        return head;
    }

    public void setHead(Pack head) {
        this.head = head;
    }
    
     public void enqueue(Pack pack){
		if (head != null) {
			Pack actual = head;
			while (actual.getNext() != null) {
				actual = actual.getNext();
			}
			actual.setNext(pack);
		}else{
			head = pack;
		}
	}
    public Pack dequeue(){
        Pack actual = null;
        if (head != null) {
            try {
                actual = head;
                head= head.getNext();
                    return actual;
            } catch (NullPointerException e) {
            }
        }
         return actual;
    }
    public Pack peek(){
        return this.getHead();
    }
}
