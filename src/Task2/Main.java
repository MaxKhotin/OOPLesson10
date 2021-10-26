package Task2;

import java.util.NoSuchElementException;

public class Main <T> implements Iterator<T>{
    int index;
    T[] array;
    public Main(T[] array){
        this.array = array;
    }
    @Override
    public boolean hasNext(){
    try {
        T test = array[index];
        return true;
    } catch (NoSuchElementException e) {
        e.getMessage();
    }
    return false;
    }

    @Override
    public T next() {
        if (this.hasNext()) return array[index];
        else return null;
    }
}

class Realisation {
    public static void main(String[] args) {
        Integer[] array = {1,2,3};
        Main<Integer> main= new Main<Integer>(array);
        System.out.println(main.hasNext());
        System.out.println(main.next());

    }
}
