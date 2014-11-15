package Dijkstra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Admin on 2014-11-15.
 */
public class ActionListenerDodajWierzcholek implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Singleton.getInstance().okno.getRbDodajWierzcholek().setSelected(true);
        Singleton.getInstance().okno.getRbDodajKrawedz().setSelected(false);
        Singleton.getInstance().okno.setKSZTALT(true);
    }
}
