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
public class Album {

   private Page[] pages;
   private boolean fill;

    public Album() {
        this.pages = new Page[10];
        for (int i = 0; i < 10; i++) {
            pages[i]= new Page(i+1);
        }
        this.fill = false;
    }

    public Page[] getPages() {
        return pages;
    }

    public void setPages(Page[] pages) {
        this.pages = pages;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }
    
    
}
