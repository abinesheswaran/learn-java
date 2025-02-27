package Generics;

import java.util.ArrayList;

public class ArrayBox<T>{
    private ArrayList<T> arrayList;
    public ArrayBox(){
        arrayList = new ArrayList<>();
    }
    public void add(T item){
        arrayList.add(item);
    }
    public void print(){
        System.out.println(arrayList.toString());
    }
}
