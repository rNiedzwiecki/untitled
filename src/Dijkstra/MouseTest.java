package Dijkstra;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;


import java.util.ArrayList;

/**
 * Created by Admin on 2014-11-15.
 */
public class MouseTest extends JPanel implements MouseListener, MouseMotionListener {
    private Krawedz kr;
    private Graphics g;
    private boolean CZYMAMWIERZCHOLEK;
    public MouseTest() {
        addMouseListener(this);
        addMouseMotionListener(this);
        CZYMAMWIERZCHOLEK=false;
        kr= new Krawedz();
    }
    public void mouseExited(MouseEvent e){

    }
    public void mouseReleased(MouseEvent e){
        if(!Singleton.getInstance().okno.getKSZTALT()){
        CZYMAMWIERZCHOLEK=false;
        kr.setKoncowy(Singleton.getInstance().wierzcholki.get(najblizszyWierzcholek(e.getPoint())));
        kr.rysuj(Singleton.getInstance().okno.getSciana());
        }
    }
    public void mouseEntered(MouseEvent e){

    }
    public void mousePressed(MouseEvent e){
        if(!Singleton.getInstance().okno.getKSZTALT())
        {
            int wierzcholekPoczatkowy = najblizszyWierzcholek(e.getPoint());
            kr.setPoczatkowy(Singleton.getInstance().wierzcholki.get(wierzcholekPoczatkowy));

        }
    }
    public void mouseDragged(MouseEvent e){
        if(wspolrzednePoprawne(e.getPoint()) && !Singleton.getInstance().okno.getKSZTALT())
        {
            g=Singleton.getInstance().okno.getSciana().getGraphics();
            JPanel temp=Singleton.getInstance().okno.getSciana();
            //g.create(temp.getX(),temp.getY(),temp.getHeight(),temp.getWidth());
            //Image im= Singleton.getInstance().okno.getSciana().createImage(400,500);



            //Singleton.getInstance().okno.getSciana().printComponents(g);
            if(!CZYMAMWIERZCHOLEK) {
                int wierzcholekPoczatkowy = najblizszyWierzcholek(e.getPoint());
                kr.setPoczatkowy(Singleton.getInstance().wierzcholki.get(wierzcholekPoczatkowy));
            }
            //kr.rysuj(Singleton.getInstance().okno.getSciana(),e.getPoint());

            g.drawLine(kr.getPoczatkowy().getP().x,kr.getPoczatkowy().getP().y,e.getX(),e.getY());


            Singleton.getInstance().okno.update(g);
            //System.out.println("Ilosc komponentow" + Singleton.getInstance().okno.getSciana().getComponentCount());

            //g.drawImage(im,0,0,400,500,this);
            //Singleton.getInstance().okno.getSciana().removeAll();

        }

    }

    public void mouseClicked(MouseEvent e){

        if(wspolrzednePoprawne(e.getPoint()) && Singleton.getInstance().okno.getKSZTALT()) {
            Wierzcholek temp = new Wierzcholek(e.getPoint());
            Singleton.getInstance().wierzcholki.add(temp);
            temp.rysuj(Singleton.getInstance().okno.getSciana());
        }
        }

    public void mouseMoved(MouseEvent e) {
        if (wspolrzednePoprawne(e.getPoint()))
            Singleton.getInstance().okno.getLabWspolrzedne().setText("Współrzędna x = " + e.getX() + " , Współrzędna y = " + e.getY());

    }

    private boolean wspolrzednePoprawne(Point p) {
        if (p.getX() < Singleton.getInstance().okno.getSciana().getWidth() && p.getY() < Singleton.getInstance().okno.getSciana().getHeight())
            return true;
        else
            return false;
    }
    private int najblizszyWierzcholek(Point p)
    {
        ArrayList<Wierzcholek> temp = Singleton.getInstance().wierzcholki;
        int najblizszy= 0;
        double najmniejszaOdleglosc=wyliczOdlegloscMiedzyPunktami(p,temp.get(0).getP());
        for (int i=1;i<temp.size();i++)
        {
            double aktualnaOdleglosc =wyliczOdlegloscMiedzyPunktami(p,temp.get(i).getP());
            System.out.println("Aktualna="+aktualnaOdleglosc+"najmniejsza="+najmniejszaOdleglosc+"najblizszy"+najblizszy);
            if(najmniejszaOdleglosc>aktualnaOdleglosc)
            {
                najblizszy=i;
                najmniejszaOdleglosc=aktualnaOdleglosc;
                System.out.println("JEstem");
            }
        }
        CZYMAMWIERZCHOLEK=true;
        return najblizszy;
    }
    private double wyliczOdlegloscMiedzyPunktami(Point p1, Point p2)
    {
        return Math.sqrt(Math.pow((p1.y-p2.y),2)+Math.pow(p2.x-p1.x,2));

    }
    private void czysc()
    {
        Singleton.getInstance().okno.setSciana(new JPanel());
        //for (int i=0;i<comp.length;i++)
        {
            Singleton.getInstance().okno.getSciana();
        }
    }

}
