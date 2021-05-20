/*
* This is a class that pushes
* and prints out elements.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-05-19
*/

import java.util.ArrayList;

public final class MrCoxallStack {
    /** This is an ArrayList for stacking data. */
    private ArrayList<Integer> stackList = new ArrayList<Integer>();

    /**
    * This function returns the top
    * element but doesn't remove it.
    * @return topElement
    */
    public int peekElement() {
        int topElement = this.stackList.get(this.stackList.size() - 1);
        return (topElement);
    }

    /**
    * This function removes the
    * last element and returns it.
    * @return lastElement
    */
    public int popElement() {
        int lastElement = this.stackList.remove(this.stackList.size() - 1);
        return (lastElement);
    }

    /**
    * This function pushes
    * elements in to the ArrayList.
    * @param anElement
    */
    public void pushNumber(final int anElement) {
        this.stackList.add(anElement);
    }

    /** This function pritns out the elements in the ArrayList. */
    public void printStack() {
        for (int counter = 0; counter < this.stackList.size(); counter++) {
            System.out.println(this.stackList.get(counter));
        }
    }
}
