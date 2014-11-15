package Dijkstra;

import java.util.ArrayList;

/**
 * Created by Admin on 2014-11-15.
 */
public final class Singleton {
    private final static Singleton ourInstance = new Singleton();
    public GUI okno;
    public static Singleton getInstance() {
        return ourInstance;
    }
    public ArrayList<Wierzcholek> wierzcholki = new ArrayList<Wierzcholek>();
    //żeby uniknąć automatycznego tworzenia domyślnego, publicznego, bezargumentowego konstruktora
    private Singleton() {
    }
}