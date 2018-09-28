package turing;

/**
 * Creation of a class to run the program Turing Tape machine, this class can be tested with
 * the help the TestTape class, this class creates empty cells and populates them
 * to finally return the entire content of the Turing Tape
 *
 */

public class Tape {
    private Cell currentCell; //pointer to the current cell 
    
 //creates a new tape with a new cell, this cell only contains a blank space
    Tape() {
        Cell newCell = new Cell();
        newCell.content = ' ';
        newCell.prev = null;
        newCell.next = null;
        currentCell = newCell;
        
    }
 
/**
 * points to the current cell
 */
    public Cell getCurrentCell() {
        return currentCell;
    }
    
    /**
     * points to the current cell content
     */
 
    public char getContent() {
        return currentCell.content;
    }
 
    
    /**
     * sets a value ch in the current cell
     */
    public void setContent(char ch) { 
        currentCell.content = ch;
    }
    
    /**
     * Moves to the previous position on the tape "left"
     */
 
    public void moveLeft() {
        if (currentCell.prev == null){
            Cell newCell = new Cell();
            newCell.content = ' ';
            newCell.prev = null;
            newCell.next = currentCell;
            currentCell.prev = newCell;
            }
        currentCell = currentCell.prev;
    }
    
    /**
     * Moves to the next position on the tape "right"
     */
 
 
    public void moveRight() {
        if (currentCell.next == null){
            Cell newCell = new Cell();
            newCell.content = ' ';
            newCell.next = null;
            newCell.prev = currentCell;
            currentCell.next = newCell;
            }
        currentCell = currentCell.next;
    }
    
    
/**
 * returns a String consisting of the chars from all the cells on the tape, 
 * read from left to right, except that leading or trailing blank characters 
 * should be discarded.
 * @return Tape content
 */
    
    public String getTapeContents() { 
        Cell pointer = currentCell;
        while (pointer.prev != null)
            pointer = pointer.prev;
        String strContent = "";
        while (pointer != null) {
            strContent += pointer.content;
            pointer = pointer.next;
            }
        strContent = strContent.trim();
        return strContent;
        }
    
    }
 
    


