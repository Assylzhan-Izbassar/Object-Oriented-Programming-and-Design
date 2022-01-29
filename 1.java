abstract class Worker {
    public abstract double work();
    public abstract int getQuantity();
    public abstract static String estimatedProjectTime(Worker[] workers, int projectSize);
}

class Runner extends Worker {
    public double work() {
        return 2.0;
    }
    
    public int getQuantity() {

    }

    public static String estimatedProjectTime(Worker[] workers, int projectSize) {

    }
}

class Jogger extends Worker {

    public double work() {
        return 1.0;
    }
    
    public int getQuantity() {

    }

    public static String estimatedProjectTime(Worker[] workers, int projectSize) {

    }
}

class Walker extends Worker {
    
    public double work() {
        return 1.0;
    }
    
    public int getQuantity() {

    }

    public static String estimatedProjectTime(Worker[] workers, int projectSize) {

    }
}

class Rider extends Worker {
    
    public double work() {
        return 0.5;
    }
    
    public int getQuantity() {

    }

    public static String estimatedProjectTime(Worker[] workers, int projectSize) {

    }
}

class Driver extends Worker {

    public double work() {
        return 1.0;
    }
    
    public int getQuantity() {

    }

    public static String estimatedProjectTime(Worker[] workers, int projectSize) {

    }
}





public class Triplet <U, V, T> {
    public U a; 
    public V b;
    public T c;

    Triplet(U a, V b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public U getFirst() {
        return this.a;
    }

    public V getSecond() {
        return this.b;
    }

    public T getThird() {
        return this.c;
    }

    public void setFirst(U a) {
        this.a = a;
    }

    public void setSecond(V b) {
        this.b = b;
    }

    public void setThird(T c) {
        this.c = c;
    }
}