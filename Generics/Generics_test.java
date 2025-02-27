package Generics;

public class Generics_test {
    public static void main(String args[]) {
        Box<Integer> box = new Box<>();
        box.setItem(1);
        ArrayBox<Integer> arrayIntBox = new ArrayBox<>();
        arrayIntBox.add(4);
        arrayIntBox.add(5);
        arrayIntBox.print();
        ArrayBox<String> arrayIntBox2 = new ArrayBox<>();
        arrayIntBox2.add("hai");
        arrayIntBox2.add("bye");
        arrayIntBox2.print();

    }
}

