package com.company;

import java.util.Arrays;

public class MyList<E> {
    private  int size = 0;
    private static final int DEFAUT_CAPACYTI = 1;
    private Object element[];

    public MyList() {
        element = new Object[DEFAUT_CAPACYTI];
    }

    private void ensureCape(){
        int newSize = element.length*2;
        element = Arrays.copyOf(element,newSize);
    }
    public void add(E e) {
        if (size==element.length){
            ensureCape();
        }
        element[size++] = e;
    }
    public E get(int i){
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) element[i];
    }
}
