
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise_132 extends JFrame {

    private static final long serialVersionUID = 6283390657892070603L;

    private JLabel lbl_name;
    private JLabel lbl_search;
    private JLabel lbl_diurnal;
    private JLabel lbl_nocturnal;

    private JTextField txt_name;
    private JTextField txt_search;
    private JTextField txt_totalD;
    private JTextField txt_totalN;

    private JRadioButton rad_diurnal;
    private JRadioButton rad_nocturnal;

    private DefaultListModel<String> listModel_diurnal;
    private DefaultListModel<String> listModel_nocturnal;

    private JList<String> list_diurnal;
    private JList<String> list_nocturnal;

    private ArrayList<String> arr_diurnal = new ArrayList<>();
    private ArrayList<String> arr_nocturnal = new ArrayList<>();

    private JButton btn_enroll;
    private JButton btn_retire;
    private JButton btn_close;

    private JButton btn_sortD;
    private JButton btn_sortN;

    private JButton btn_right;
    private JButton btn_allRight;
    private JButton btn_left; 
    private JButton btn_allLeft;

    private ActionListener move;
    private ActionListener sort;
    private KeyAdapter search;

    public Exercise_132() {
        initComponents();
    }

    private void initComponents() {

        // Frame initial setup

        this.setTitle("Registro Estudiantil");
        this.setSize(420, 480);
        this.setResizable(true);

        // Panels & GridBag Layout setup

        Container pnl_main = this.getContentPane();
        pnl_main.setLayout(new GridBagLayout());
        GridBagConstraints cons = new GridBagConstraints();
        cons.insets = new Insets(5, 5, 5, 5);
        cons.fill = GridBagConstraints.CENTER;
        cons.anchor = GridBagConstraints.CENTER;

        // Labels

        cons.fill = GridBagConstraints.LINE_END;
        cons.anchor = GridBagConstraints.LINE_END;

        cons.gridx = 0;

        lbl_name = new JLabel(" 📥 Nombre:");
        cons.gridy = 1;
        pnl_main.add(lbl_name, cons);

        lbl_search = new JLabel("🔎 Buscar:");
        cons.gridy = 0;
        pnl_main.add(lbl_search, cons);

        cons.fill = GridBagConstraints.CENTER;
        cons.anchor = GridBagConstraints.CENTER;

        lbl_diurnal = new JLabel("Diurno");
        cons.gridx = 0;
        cons.gridy = 5;
        pnl_main.add(lbl_diurnal, cons);

        lbl_nocturnal = new JLabel("Nocturno");
        cons.gridx = 2;
        cons.gridy = 5;
        pnl_main.add(lbl_nocturnal, cons);

        // Lists

        listModel_diurnal = new DefaultListModel<>();
        listModel_nocturnal = new DefaultListModel<>();

        cons.gridheight = 4;

        list_diurnal = new JList<>(listModel_diurnal);
        list_diurnal.setPreferredSize(new Dimension(100, 120));
        cons.gridx = 0;
        cons.gridy = 6;
        pnl_main.add(list_diurnal, cons);

        list_nocturnal = new JList<>(listModel_nocturnal);
        list_nocturnal.setPreferredSize(new Dimension(100, 120));
        cons.gridx = 2;
        cons.gridy = 6;
        pnl_main.add(list_nocturnal, cons);

        cons.gridheight = 1;

        // Text Fields

        cons.gridwidth = 2;
        cons.gridx = 1;

        txt_name = new JTextField(16);
        cons.gridy = 1;
        pnl_main.add(txt_name, cons);

        txt_search = new JTextField(16);
        cons.gridy = 0;
        pnl_main.add(txt_search, cons);

        cons.gridwidth = 1;

        txt_totalD = new JTextField(8);
        txt_totalD.setText(String.format("Total : %d", list_diurnal.getModel().getSize()));
        txt_totalD.setHorizontalAlignment(JTextField.CENTER);
        txt_totalD.setEditable(false);
        cons.gridx = 0;
        cons.gridy = 10;
        pnl_main.add(txt_totalD, cons);

        txt_totalN = new JTextField(8);
        txt_totalN.setText(String.format("Total : %d", list_nocturnal.getModel().getSize()));
        txt_totalN.setHorizontalAlignment(JTextField.CENTER);
        txt_totalN.setEditable(false);
        cons.gridx = 2;
        cons.gridy = 10;
        pnl_main.add(txt_totalN, cons);

        // Radio Button

        cons.fill = GridBagConstraints.LINE_START;
        cons.anchor = GridBagConstraints.LINE_START;

        cons.gridx = 1;

        rad_diurnal = new JRadioButton(" ☀ Diurno");
        cons.gridy = 2;
        pnl_main.add(rad_diurnal, cons);

        rad_nocturnal = new JRadioButton(" 🌙 Nocturno");
        cons.gridy = 3;
        pnl_main.add(rad_nocturnal, cons);

        ButtonGroup btn_group = new ButtonGroup();
        btn_group.add(rad_diurnal);
        btn_group.add(rad_nocturnal);

        cons.fill = GridBagConstraints.CENTER;
        cons.anchor = GridBagConstraints.CENTER;

        // Buttons

        btn_enroll = new JButton(" 📥 Matricular");
        btn_enroll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (rad_diurnal.isSelected()) {
                    arr_diurnal.add(txt_name.getText());
                } else if (rad_nocturnal.isSelected()) {
                    arr_nocturnal.add(txt_name.getText());
                }
                sync();
            }
        });
        cons.gridx = 0;
        cons.gridy = 4;
        pnl_main.add(btn_enroll, cons);

        btn_retire = new JButton(" 📤 Retirar");
        btn_retire.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (list_diurnal.getSelectedIndex() != -1) {
                    arr_diurnal.removeAll(list_diurnal.getSelectedValuesList());
                } else if (list_nocturnal.getSelectedIndex() != -1) {
                    arr_nocturnal.removeAll(list_nocturnal.getSelectedValuesList());
                } else {
                    JOptionPane.showMessageDialog(null, "¡No has seleccionado ningún elemento!", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
                sync();
            }
        });
        cons.gridx = 1;
        cons.gridy = 4;
        pnl_main.add(btn_retire, cons);

        btn_close = new JButton(" ❌ Cerrar");
        btn_close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        cons.gridx = 2;
        cons.gridy = 4;
        pnl_main.add(btn_close, cons);

        btn_sortD = new JButton(" 🔤 Ordenar");
        cons.gridx = 0;
        cons.gridy = 11;
        pnl_main.add(btn_sortD, cons);

        btn_sortN = new JButton(" 🔤 Ordenar");
        cons.gridx = 2;
        cons.gridy = 11;
        pnl_main.add(btn_sortN, cons);

        cons.gridx = 1;

        btn_right = new JButton(" > ");
        cons.gridy = 6;
        pnl_main.add(btn_right, cons);

        btn_allRight = new JButton(">>");
        cons.gridy = 7;
        pnl_main.add(btn_allRight, cons);

        btn_left = new JButton(" < ");
        cons.gridy = 8;
        pnl_main.add(btn_left, cons);

        btn_allLeft = new JButton("<<");
        cons.gridy = 9;
        pnl_main.add(btn_allLeft, cons);

        // Action & Key Listeners

        move = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveElements(e.getSource());
            }
        };

        sort = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sort(e.getSource());
            }
        };

        search = new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                search(txt_search.getText());
            }
        };

        // Action Listeners Setup

        txt_search.addKeyListener(search);
        btn_sortD.addActionListener(sort);
        btn_sortN.addActionListener(sort);
        btn_right.addActionListener(move);
        btn_allRight.addActionListener(move);
        btn_left.addActionListener(move);
        btn_allLeft.addActionListener(move);

        // Frame Final Setup

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    private void sync() {

        txt_totalD.setText(String.format("Total : %d", arr_diurnal.size()));
        txt_totalN.setText(String.format("Total : %d", arr_nocturnal.size()));

        listModel_diurnal.removeAllElements();
        listModel_nocturnal.removeAllElements();

        for (String i : arr_diurnal) {
            listModel_diurnal.addElement(i);
        }

        for (String i : arr_nocturnal) {
            listModel_nocturnal.addElement(i);
        }

    }

    private void sort(Object source) {

        if (source == btn_sortD) {
            Collections.sort(arr_diurnal);
        } else if (source == btn_sortN) {
            Collections.sort(arr_nocturnal);
        }

        sync();

    }

    private void moveElements(Object source) {

        if (source == btn_right) {

            if (list_diurnal.getSelectedIndex() != -1) {
                arr_nocturnal.addAll(list_diurnal.getSelectedValuesList());
                arr_diurnal.removeAll(list_diurnal.getSelectedValuesList());
            } else {
                JOptionPane.showMessageDialog(null, "¡No has seleccionado ningún elemento!", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } else if (source == btn_allRight) {

            arr_nocturnal.addAll(arr_diurnal);
            arr_diurnal.removeAll(arr_diurnal);

        } else if (source == btn_left) {

            if (list_nocturnal.getSelectedIndex() != -1) {
                arr_diurnal.addAll(list_nocturnal.getSelectedValuesList());
                arr_nocturnal.removeAll(list_nocturnal.getSelectedValuesList());
            } else {
                JOptionPane.showMessageDialog(null, "¡No has seleccionado ningún elemento!", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } else if (source == btn_allLeft) {

            arr_diurnal.addAll(arr_nocturnal);
            arr_nocturnal.removeAll(arr_nocturnal);

        }

        sync();

    }

    private void search(String text) {

        if (rad_diurnal.isSelected()) {
            listModel_diurnal.removeAllElements();
            for (String i : arr_diurnal) {
                if (i.contains(text)) {
                    listModel_diurnal.addElement(i);
                }
            }
        } else if (rad_nocturnal.isSelected()) {
            listModel_nocturnal.removeAllElements();
            for (String i : arr_nocturnal) {
                if (i.contains(text)) {
                    listModel_nocturnal.addElement(i);
                }
            }
        }
        if (text == "") {
            sync();
        }
    }

    public static void main(String[] args) {
        new Exercise_132();
    }

}