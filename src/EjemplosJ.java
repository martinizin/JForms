import javax.swing.*;
import java.awt.*;

public class EjemplosJ extends JFrame {


    private JLabel ListaSuper;
    private JTextField atunCebollaTextField;
    private JList listas;
    private JPanel lista1;
    private JScrollPane barraScroll;

    public EjemplosJ(JLabel listaSuper, JTextField atunCebollaTextField, JList list1, JPanel lista1) throws HeadlessException {
        ListaSuper = listaSuper;
        this.atunCebollaTextField = atunCebollaTextField;
        this.listas = list1;
        this.lista1 = lista1;
    }

    public JLabel getListaSuper() {
        return ListaSuper;
    }

    public void setListaSuper(JLabel listaSuper) {
        ListaSuper = listaSuper;
    }

    public JTextField getAtunCebollaTextField() {
        return atunCebollaTextField;
    }

    public void setAtunCebollaTextField(JTextField atunCebollaTextField) {
        this.atunCebollaTextField = atunCebollaTextField;
    }

    public JList getList1() {
        return listas;
    }

    public void setList1(JList list1) {
        this.listas = list1;
    }

    public JPanel getLista1() {
        return lista1;
    }

    public void setLista1(JPanel lista1) {
        this.lista1 = lista1;
    }


}

