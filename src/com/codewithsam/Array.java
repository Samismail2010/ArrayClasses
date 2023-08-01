package com.codewithsam;

public class Array {
    private  int[] items;
    private int count;

    public Array(int length){
        items = new int[length];

    }
    public void insert(int item){
        //adding a count to the array

        if (items.length == count) {

            int[] newItems = new int[count * 2];

            for (int  i = 0; i < count; i++)
                newItems[i] = items[i];
            items = newItems;
        }
        //Add the new item at the end
        items[count++] = item;
    }
    public Array intersect(Array other){
        var intersection = new Array(count);

        for (int item : items)
            if (other.indexOf(item) >= 0)
                intersection.insert(item);

        return intersection;
    }

    public void removeAt(int index) {
        //removing an array index for example
        //[10, 20, 30, 40]
        //removing index 1 = [10, 30, 40]
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();

        for (int i = index; i < count; i++)
            items[i] = items [i + 1];

        count--;
    }


    public int indexOf(int item){
        //returns the index of a value for example
        //[10, 20, 30, 40] if we (System.out.println(numbers.indexOf(10));
        //returns 0;
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;

        return -1;
    }
    public  void reverse() {
        //returns the array in reverse
        int[] newItems = new int[count];
        for (int i = 0; i < count; i++)
            newItems[i] = items[count - i - 1];

        items = newItems;
    }
    public int max(){
        //returns the max value
        int max = 0;
        for( int item : items)
            if(item > max)
                max = item;
        return max;
    }

    public void print() {
        for (int  i = 0; i < count; i++)
        System.out.println(items[i]);
    }
}
