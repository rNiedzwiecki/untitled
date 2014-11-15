package Dijkstra;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Admin on 2014-11-15.
 */
public class Graf {
    private ArrayList<ArrayList<Integer>> graf;
    ArrayList<ArrayList<Integer>> getGraf()
    {
        return graf;
    }
    void wczytaj (ArrayList<Wierzcholek> temp)
    {
        int iloscWierzcholkow = temp.size();
        stworzTablice(iloscWierzcholkow);
        System.out.println(iloscWierzcholkow);
        for (int i=0;i<iloscWierzcholkow;i++)
        {
            ArrayList<Krawedz> kr = temp.get(i).getKrawedzie();
            for (int j=0;j<kr.size();j++)
            {
               dodajKrawedz(kr.get(j));
            }
        }
    }
    void stworzTablice(int ile)
    {
        for(int i=0;i<ile;i++)
        {
            graf.add(new ArrayList<Integer>());
        }
    }
    void dodajKrawedz(int pocz,int kon,int waga)
    {
        graf.get(pocz).set(kon,waga);
    }
    void dodajKrawedz(Krawedz temp)
    {

        }
    @Override
    public String toString()
    {
        String tablica = new String("");
        for (int i=0;i<graf.size();i++)
        {
            tablica+=graf.get(i).toString();
            tablica+='\n';
        }
        System.out.println(tablica);
        return tablica;
    }
    public static void main(String[] args)
    {
        ArrayList<Wierzcholek> lista =  new ArrayList<Wierzcholek>();
        lista.add(new Wierzcholek( new Point(0,0)));
        lista.add(new Wierzcholek( new Point(10,50)));
        System.out.println(lista.size());
        Graf graf= new Graf();
        graf.wczytaj(lista);
        System.out.println(graf.toString());
    }
}
