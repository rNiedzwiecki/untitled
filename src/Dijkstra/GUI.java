package Dijkstra;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Admin on 2014-11-14.
 */
public class GUI extends JFrame {//implements MouseListener, MouseMotionListener {
    private JRadioButton rbDodajWierzcholek;
    private JRadioButton rbDodajKrawedz;
    private JButton butDodajKrawedz;
    private JButton butWylicz;
    private JButton butZapisz;
    private JButton butNowy;
    private JButton butCofnij;
    private JButton butDoPrzodu;

    public JRadioButton getRbDodajWierzcholek() {
        return rbDodajWierzcholek;
    }

    public JRadioButton getRbDodajKrawedz() {
        return rbDodajKrawedz;
    }

    public JButton getButDodajKrawedz() {
        return butDodajKrawedz;
    }

    public JButton getButWylicz() {
        return butWylicz;
    }

    public JButton getButZapisz() {
        return butZapisz;
    }

    public JButton getButNowy() {
        return butNowy;
    }

    public JButton getButCofnij() {
        return butCofnij;
    }

    public JButton getButDoPrzodu() {
        return butDoPrzodu;
    }

    public JButton getButDodajWierzcholek() {
        return butDodajWierzcholek;
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public JLabel getLabPodajWage() {
        return labPodajWage;
    }

    public JSpinner getSpinWaga() {
        return spinWaga;
    }

    public JLabel getLabPodajWierzcholekPoczatkowy() {
        return labPodajWierzcholekPoczatkowy;
    }

    public JLabel getLabPodajWierzcholekKoncowy() {
        return labPodajWierzcholekKoncowy;
    }

    public JSpinner getSpinWiePocz() {
        return spinWiePocz;
    }

    public JSpinner getSpinWieKon() {
        return spinWieKon;
    }

    public JLabel getLabAktualnaKopia() {
        return labAktualnaKopia;
    }

    public JLabel getLabWspolrzedne() {
        return labWspolrzedne;
    }

    public JButton getButOblicz() {
        return butOblicz;
    }

    public JButton getButZapisz1() {
        return butZapisz1;
    }

    public JPanel getSciana() {
        return sciana;
    }

    public boolean getKSZTALT() {
        return KSZTALT;
    }

    public void setKSZTALT(boolean KSZTALT) {
        this.KSZTALT = KSZTALT;
    }

    public void setRootPanel(JPanel rootPanel) {
        this.rootPanel = rootPanel;
    }

    public void setRbDodajWierzcholek(JRadioButton rbDodajWierzcholek) {
        this.rbDodajWierzcholek = rbDodajWierzcholek;
    }

    public void setRbDodajKrawedz(JRadioButton rbDodajKrawedz) {
        this.rbDodajKrawedz = rbDodajKrawedz;
    }

    public void setButDodajKrawedz(JButton butDodajKrawedz) {
        this.butDodajKrawedz = butDodajKrawedz;
    }

    public void setButWylicz(JButton butWylicz) {
        this.butWylicz = butWylicz;
    }

    public void setButZapisz(JButton butZapisz) {
        this.butZapisz = butZapisz;
    }

    public void setButNowy(JButton butNowy) {
        this.butNowy = butNowy;
    }

    public void setButCofnij(JButton butCofnij) {
        this.butCofnij = butCofnij;
    }

    public void setButDoPrzodu(JButton butDoPrzodu) {
        this.butDoPrzodu = butDoPrzodu;
    }

    public void setButDodajWierzcholek(JButton butDodajWierzcholek) {
        this.butDodajWierzcholek = butDodajWierzcholek;
    }

    public void setLabPodajWage(JLabel labPodajWage) {
        this.labPodajWage = labPodajWage;
    }

    public void setSpinWaga(JSpinner spinWaga) {
        this.spinWaga = spinWaga;
    }

    public void setLabPodajWierzcholekPoczatkowy(JLabel labPodajWierzcholekPoczatkowy) {
        this.labPodajWierzcholekPoczatkowy = labPodajWierzcholekPoczatkowy;
    }

    public void setLabPodajWierzcholekKoncowy(JLabel labPodajWierzcholekKoncowy) {
        this.labPodajWierzcholekKoncowy = labPodajWierzcholekKoncowy;
    }

    public void setSpinWiePocz(JSpinner spinWiePocz) {
        this.spinWiePocz = spinWiePocz;
    }

    public void setSpinWieKon(JSpinner spinWieKon) {
        this.spinWieKon = spinWieKon;
    }

    public void setLabAktualnaKopia(JLabel labAktualnaKopia) {
        this.labAktualnaKopia = labAktualnaKopia;
    }

    public void setLabWspolrzedne(JLabel labWspolrzedne) {
        this.labWspolrzedne = labWspolrzedne;
    }

    public void setButOblicz(JButton butOblicz) {
        this.butOblicz = butOblicz;
    }

    public void setButZapisz1(JButton butZapisz1) {
        this.butZapisz1 = butZapisz1;
    }

    public void setSciana(JPanel sciana) {
        this.sciana = sciana;
    }

    private JButton butDodajWierzcholek;
    private JPanel rootPanel;
    private JLabel labPodajWage;
    private JSpinner spinWaga;
    private JLabel labPodajWierzcholekPoczatkowy;
    private JLabel labPodajWierzcholekKoncowy;
    private JSpinner spinWiePocz;
    private JSpinner spinWieKon;
    private JLabel labAktualnaKopia;
    private JLabel labWspolrzedne;
    private JButton butOblicz;
    private JButton butZapisz1;
    private JPanel sciana;
    private boolean KSZTALT; //przechowuje informacje co rysuje TRUE dla wierzcholka FALSE dla krawedzi

    public GUI() {
        super("");
        setContentPane(rootPanel);
        pack();
        setVisible(true);
        addMouseListener(new MouseTest());
        addMouseMotionListener(new MouseTest());
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        spinWaga.setModel(new SpinnerNumberModel(0, 0, 100, 1));
        KSZTALT = true;
        butDodajWierzcholek.addActionListener(new ActionListenerDodajWierzcholek());
        butDodajKrawedz.addActionListener(new ActionListenerDodajKrawedz());
        /*butCofnij.addActionListener(new ActionListenerCofnij());
        butDoPrzodu.addActionListener(new ActionListenerDoPrzodu());
        butNowy.addActionListener(new ActionListenerNowy());
        butZapisz.addActionListener(new ActionListenerZapisz());
        butZapisz1.addActionListener(new ActionListenerZapisz());
        butOblicz.addActionListener(new ActionListenerOblicz());
        butWylicz.addActionListener(new ActionListenerOblicz());
        */
        rbDodajKrawedz.addActionListener(new ActionListenerDodajKrawedz());
        rbDodajWierzcholek.addActionListener(new ActionListenerDodajWierzcholek());

    }


    private void createUIComponents() {
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        rootPanel = new JPanel();
        rootPanel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(10, 5, new Insets(0, 0, 0, 0), -1, -1));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        rootPanel.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(9, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, new Dimension(579, 11), null, 0, false));
        sciana = new JPanel();
        sciana.setLayout(new GridBagLayout());
        rootPanel.add(sciana, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 9, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(579, 28), null, 0, false));
        sciana.setBorder(BorderFactory.createTitledBorder(BorderFactory.createRaisedBevelBorder(), null));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(1, 7, new Insets(0, 0, 0, 0), -1, -1, true, true));
        rootPanel.add(panel1, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, null, null, 0, false));
        panel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), null));
        butDodajWierzcholek = new JButton();
        butDodajWierzcholek.setIcon(new ImageIcon(getClass().getResource("/icons/circle.png")));
        butDodajWierzcholek.setIconTextGap(4);
        butDodajWierzcholek.setLabel("");
        butDodajWierzcholek.setMargin(new Insets(0, 0, 0, 0));
        butDodajWierzcholek.setText("");
        butDodajWierzcholek.setToolTipText("Dodaj Wierzchołek");
        butDodajWierzcholek.setVisible(true);
        panel1.add(butDodajWierzcholek, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, new Dimension(16, 16), 0, false));
        butDodajKrawedz = new JButton();
        butDodajKrawedz.setIcon(new ImageIcon(getClass().getResource("/icons/line.png")));
        butDodajKrawedz.setMargin(new Insets(0, 0, 0, 0));
        butDodajKrawedz.setText("");
        panel1.add(butDodajKrawedz, new com.intellij.uiDesigner.core.GridConstraints(0, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, 1, 1, null, new Dimension(33, 32), new Dimension(16, 16), 0, false));
        butWylicz = new JButton();
        butWylicz.setDefaultCapable(true);
        butWylicz.setIcon(new ImageIcon(getClass().getResource("/icons/calculate_icon.gif")));
        butWylicz.setMargin(new Insets(0, 0, 0, 0));
        butWylicz.setText("");
        panel1.add(butWylicz, new com.intellij.uiDesigner.core.GridConstraints(0, 2, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, new Dimension(16, 16), 0, false));
        butZapisz = new JButton();
        butZapisz.setIcon(new ImageIcon(getClass().getResource("/icons/floppy_disk_blue.png")));
        butZapisz.setMargin(new Insets(0, 0, 0, 0));
        butZapisz.setText("");
        panel1.add(butZapisz, new com.intellij.uiDesigner.core.GridConstraints(0, 3, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, new Dimension(16, 16), 0, false));
        butNowy = new JButton();
        butNowy.setIcon(new ImageIcon(getClass().getResource("/icons/blank_page.png")));
        butNowy.setMargin(new Insets(0, 0, 0, 0));
        butNowy.setText("");
        panel1.add(butNowy, new com.intellij.uiDesigner.core.GridConstraints(0, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, new Dimension(16, 16), 0, false));
        butCofnij = new JButton();
        butCofnij.setEnabled(false);
        butCofnij.setIcon(new ImageIcon(getClass().getResource("/icons/undo.jpg")));
        butCofnij.setInheritsPopupMenu(false);
        butCofnij.setMargin(new Insets(0, 0, 0, 0));
        butCofnij.setText("");
        panel1.add(butCofnij, new com.intellij.uiDesigner.core.GridConstraints(0, 5, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, new Dimension(16, 16), 0, false));
        butDoPrzodu = new JButton();
        butDoPrzodu.setEnabled(false);
        butDoPrzodu.setIcon(new ImageIcon(getClass().getResource("/icons/redo.jpg")));
        butDoPrzodu.setText("");
        butDoPrzodu.putClientProperty("html.disable", Boolean.FALSE);
        butDoPrzodu.putClientProperty("hideActionText", Boolean.FALSE);
        panel1.add(butDoPrzodu, new com.intellij.uiDesigner.core.GridConstraints(0, 6, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, new Dimension(16, 16), 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer2 = new com.intellij.uiDesigner.core.Spacer();
        rootPanel.add(spacer2, new com.intellij.uiDesigner.core.GridConstraints(4, 2, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        rbDodajWierzcholek = new JRadioButton();
        rbDodajWierzcholek.setSelected(true);
        rbDodajWierzcholek.setText("Dodaj Wierzcholek");
        rootPanel.add(rbDodajWierzcholek, new com.intellij.uiDesigner.core.GridConstraints(1, 1, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        rbDodajKrawedz = new JRadioButton();
        rbDodajKrawedz.setText("Dodaj Krawędź");
        rootPanel.add(rbDodajKrawedz, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 4, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(110, 46), null, 0, false));
        labPodajWage = new JLabel();
        labPodajWage.setText("Podaj wagę krawędzi");
        rootPanel.add(labPodajWage, new com.intellij.uiDesigner.core.GridConstraints(3, 1, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(171, 16), null, 0, false));
        spinWaga = new JSpinner();
        rootPanel.add(spinWaga, new com.intellij.uiDesigner.core.GridConstraints(3, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        labPodajWierzcholekPoczatkowy = new JLabel();
        labPodajWierzcholekPoczatkowy.setText("Podaj wierzchołek początkowy");
        rootPanel.add(labPodajWierzcholekPoczatkowy, new com.intellij.uiDesigner.core.GridConstraints(5, 1, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(171, 16), null, 0, false));
        labPodajWierzcholekKoncowy = new JLabel();
        labPodajWierzcholekKoncowy.setText("Podaj wierzchołek końcowy");
        rootPanel.add(labPodajWierzcholekKoncowy, new com.intellij.uiDesigner.core.GridConstraints(6, 1, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(171, 16), null, 0, false));
        spinWiePocz = new JSpinner();
        rootPanel.add(spinWiePocz, new com.intellij.uiDesigner.core.GridConstraints(5, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        spinWieKon = new JSpinner();
        rootPanel.add(spinWieKon, new com.intellij.uiDesigner.core.GridConstraints(6, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        labAktualnaKopia = new JLabel();
        labAktualnaKopia.setName("");
        labAktualnaKopia.setText("Aktualna kopia 0/0");
        rootPanel.add(labAktualnaKopia, new com.intellij.uiDesigner.core.GridConstraints(9, 1, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(171, 16), null, 0, false));
        labWspolrzedne = new JLabel();
        labWspolrzedne.setText("Współrzędna x = 0, Współrzędna y = 0  ");
        rootPanel.add(labWspolrzedne, new com.intellij.uiDesigner.core.GridConstraints(9, 3, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        butOblicz = new JButton();
        butOblicz.setText("Oblicz");
        rootPanel.add(butOblicz, new com.intellij.uiDesigner.core.GridConstraints(8, 4, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        butZapisz1 = new JButton();
        butZapisz1.setText("Zapisz");
        rootPanel.add(butZapisz1, new com.intellij.uiDesigner.core.GridConstraints(8, 1, 1, 3, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(171, 32), null, 0, false));
        ButtonGroup buttonGroup;
        buttonGroup = new ButtonGroup();
        buttonGroup.add(rbDodajKrawedz);
        buttonGroup.add(rbDodajWierzcholek);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return rootPanel;
    }
}
