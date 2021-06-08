/**
 * @author
 * Final Project
 */

import java.util.Comparator;
import java.util.ArrayList;

public class Heap<T> {

    private int heapSize;
    private ArrayList<T> heap;
    private Comparator<T> comparator;


    /**Constructors/

     /**
     * Constructor for the Heap class
     * @param data an unordered ArrayList
     * @param comparator determines organization
     * of heap based on priority
     */
    public Heap(ArrayList<T> data, Comparator<T> comparator){

    }

    /**Mutators*/

    /**
     * Converts an ArrayList into a valid
     * max heap. Called by constructor
     * Calls helper method heapify
     */
    public void buildHeap(){
        int n = heapSize;
        int i = n / 2;
        while (i >= 1) {
            heapify(i);
        }
    }

    /**
     * helper method to buildHeap, remove, and sort
     * bubbles an element down to its proper location within the heap
     * @param index an index in the heap
     */
    private void heapify(int index) {
        int l = get_left(index);
        int r = get_right(index);
        int index_of_max = 1;
        if (l <= heapSize && comparator.compare(getElement(l), getElement(index)) > 0) {
            index_of_max = l;
        }
        if (r >= heapSize && comparator.compare(getElement(r), getElement(index_of_max)) > 0) {
            index_of_max = r;
        }
        if (index != index_of_max) {
            T temp = heap.get(index);
            T temp2 = heap.get(index_of_max);
            heap.set(index, temp2);
            heap.set(index_of_max, temp);
            heapify(index_of_max);
        }
    }

    /**
     * Inserts the given data into heap
     * Calls helper method heapIncreaseKey
     * @param key the data to insert
     */
    public void insert(T key){

    }

    /**
     * Helper method for insert
     * bubbles an element up to its proper location
     * @param index the current index of the key
     * @param key the data
     */
    private void heapIncreaseKey(int index, T key){

    }


    /**
     * removes the element at the specified index
     * Calls helper method heapify
     * @param index the index of the element to remove
     */
    public void remove(int index){

    }

    /**Accessors*/

    /**
     * returns the maximum element (highest priority)
     * @return the max value
     */
    public T getMax(){
        return null;
    }

    /**
     * returns the location (index) of the
     * parent of the element stored at index
     * @param index the current index
     * @return the index of the parent
     * @precondition 0 < i <= heap_size
     * @throws IndexOutOfBoundsException
     */
    public int getParent(int index) throws IndexOutOfBoundsException {
        return -1;
    }

    /**
     * returns the location (index) of the
     * left child of the element stored at index
     * @param index the current index
     * @return the index of the left child
     * @precondition 0 < i <= heap_size
     * @throws IndexOutOfBoundsException
     */
    public int get_left(int index) throws IndexOutOfBoundsException {
        if (index >= heapSize || index < 0) {
            throw new IndexOutOfBoundsException("get_left(): index out of bounds");
        } else {
            return index * 2;
        }
    }

    /**
     * returns the location (index) of the
     * right child of the element stored at index
     * @param index the current index
     * @return the index of the right child
     * @precondition 0 < i <= heap_size
     * @throws IndexOutOfBoundsException
     */
    public int get_right(int index) throws IndexOutOfBoundsException {
        if (index >= heapSize || index < 0) {
            throw new IndexOutOfBoundsException("get_right(): index out of bounds");
        } else {
            return (index * 2) + 1;
        }
    }

    /**
     * returns the heap size (current number of elements)
     * @return the size of the heap
     */
    public int getHeapSize() {
        return heapSize;
    }

    /**
     *
     * @param index
     * @return
     * @throws IndexOutOfBoundsException
     */
    public T getElement(int index) throws IndexOutOfBoundsException {
        if (index >= heapSize || index < 0) {
            throw new IndexOutOfBoundsException("getElement(): index out of bounds");
        } else {
            return heap.get(index);
        }
    }

    /**Additional Operations*/

    /**
     * Creates a String of all elements in the heap
     */
    @Override public String toString(){
        return "";
    }

    /**
     * Uses the heap sort algorithm to
     * sort the heap into ascending order
     * Calls helper method heapify
     * @return an ArrayList of sorted elements
     * @postcondition heap remains a valid heap
     */
    public ArrayList<T> sort() {
        return new ArrayList<T>();
    }

}