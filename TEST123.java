import java.awt.*;
import javax.swing.*;
import info.clearthought.layout.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Tue Apr 19 12:13:27 CST 2022
 */



/**
 * @author shuai
 */
public class TEST123 extends JPanel {
    public TEST123() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        checkBoxMenuItem1 = new JCheckBoxMenuItem();
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menu2 = new JMenu();
        menu3 = new JMenu();
        menu4 = new JMenu();
        passwordField1 = new JPasswordField();
        menuItem1 = new JMenuItem();
        button1 = new JButton();
        checkBox1 = new JCheckBox();
        toggleButton1 = new JToggleButton();
        formattedTextField1 = new JFormattedTextField();
        radioButtonMenuItem1 = new JRadioButtonMenuItem();
        dialog1 = new JDialog();

        //======== this ========
        setBackground(Color.black);
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder
        ( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing. border. TitledBorder. CENTER, javax. swing. border
        . TitledBorder. BOTTOM, new java .awt .Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 ), java. awt
        . Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void
        propertyChange (java .beans .PropertyChangeEvent e) {if ("borde\u0072" .equals (e .getPropertyName () )) throw new RuntimeException( )
        ; }} );
        setLayout(new TableLayout(new double[][] {
            {TableLayout.PREFERRED, TableLayout.PREFERRED, TableLayout.PREFERRED, TableLayout.PREFERRED, TableLayout.PREFERRED, TableLayout.PREFERRED, TableLayout.PREFERRED, TableLayout.PREFERRED, TableLayout.PREFERRED, TableLayout.PREFERRED, TableLayout.PREFERRED},
            {TableLayout.PREFERRED}}));
        ((TableLayout)getLayout()).setHGap(5);
        ((TableLayout)getLayout()).setVGap(5);

        //---- checkBoxMenuItem1 ----
        checkBoxMenuItem1.setText("text");
        add(checkBoxMenuItem1, new TableLayoutConstraints(0, 0, 0, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

        //---- label1 ----
        label1.setText("\u4e0d\u54c8");
        add(label1, new TableLayoutConstraints(1, 0, 1, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(textArea1);
        }
        add(scrollPane1, new TableLayoutConstraints(2, 0, 2, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("text");
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("text");

                //======== menu3 ========
                {
                    menu3.setText("text");

                    //======== menu4 ========
                    {
                        menu4.setText("text");
                    }
                    menu3.add(menu4);
                }
                menu2.add(menu3);
            }
            menuBar1.add(menu2);
        }
        add(menuBar1, new TableLayoutConstraints(3, 0, 3, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));
        add(passwordField1, new TableLayoutConstraints(4, 0, 4, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

        //---- menuItem1 ----
        menuItem1.setText("text");
        add(menuItem1, new TableLayoutConstraints(5, 0, 5, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

        //---- button1 ----
        button1.setText("text");
        add(button1, new TableLayoutConstraints(6, 0, 6, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

        //---- checkBox1 ----
        checkBox1.setText("text");
        add(checkBox1, new TableLayoutConstraints(7, 0, 7, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

        //---- toggleButton1 ----
        toggleButton1.setText("text");
        add(toggleButton1, new TableLayoutConstraints(8, 0, 8, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));
        add(formattedTextField1, new TableLayoutConstraints(9, 0, 9, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

        //---- radioButtonMenuItem1 ----
        radioButtonMenuItem1.setText("text");
        add(radioButtonMenuItem1, new TableLayoutConstraints(10, 0, 10, 0, TableLayoutConstraints.FULL, TableLayoutConstraints.FULL));

        //======== dialog1 ========
        {
            Container dialog1ContentPane = dialog1.getContentPane();
            dialog1ContentPane.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]"));
            dialog1.pack();
            dialog1.setLocationRelativeTo(dialog1.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JCheckBoxMenuItem checkBoxMenuItem1;
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenu menu2;
    private JMenu menu3;
    private JMenu menu4;
    private JPasswordField passwordField1;
    private JMenuItem menuItem1;
    private JButton button1;
    private JCheckBox checkBox1;
    private JToggleButton toggleButton1;
    private JFormattedTextField formattedTextField1;
    private JRadioButtonMenuItem radioButtonMenuItem1;
    private JDialog dialog1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
