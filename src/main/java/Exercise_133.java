
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise_133 extends JFrame{
    
    private static final long serialVersionUID = -6682955122709129416L;

    public JLabel lbl_img1;
    public JLabel lbl_img2;
    public int imgState = 0;

    public String[] imgSrcs = {"src/main/resources/images/TrafficLightNone.png", "src/main/resources/images/TrafficLightGreen.png", "src/main/resources/images/TrafficLightYellow.png", "src/main/resources/images/TrafficLightRed.png"};

    public ImageIcon imgs[] = new ImageIcon[4];
    public ImageIcon img;

    public JButton btn_start;
    public JButton btn_pause;
    public JButton btn_exit;

    public Timer time;
    public int delay;
    public int mode;

    public ActionListener listener;

    public Exercise_133 () {
        initComponents();
        initTimer();
    }

    public void initComponents () {

        // Frame initial setup

        this.setTitle("Semáforo");
        this.setSize(250, 400);
        this.setResizable(false);

        // Panels & GridBag Layout setup

        Container pnl_main = this.getContentPane();
        pnl_main.setLayout(new GridBagLayout());
        GridBagConstraints cons = new GridBagConstraints();
        cons.insets = new Insets(5, 15, 5, 15);
        cons.fill = GridBagConstraints.CENTER;
        cons.anchor = GridBagConstraints.CENTER;

        // Images

        for (int i = 0; i < imgs.length; i++) {
            img = new ImageIcon(imgSrcs[i]);
            imgs[i] = new ImageIcon(img.getImage().getScaledInstance(80, 240, Image.SCALE_SMOOTH));
        }

        img = imgs[0];

        lbl_img1 = new JLabel(img);
        cons.gridx = 0;
        cons.gridy = 0;
        pnl_main.add(lbl_img1, cons);

        lbl_img2 = new JLabel(img);
        cons.gridx = 1;
        cons.gridy = 0;
        pnl_main.add(lbl_img2, cons);


        // Buttons

        btn_start = new JButton("Iniciar");
        btn_start.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                mode = 1;
                delay = 0;
                btn_start.setText("Reanudar");
                btn_start.setEnabled(false);
            }
        });
        cons.gridx = 0;
        cons.gridy = 1;
        pnl_main.add(btn_start, cons);

        btn_pause = new JButton("Pausar");
        btn_pause.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                mode = 0;
                delay = 0;
                btn_start.setEnabled(true);
                btn_pause.setEnabled(false);
            }
        });
        cons.gridx = 1;
        cons.gridy = 1;
        pnl_main.add(btn_pause, cons);

        btn_exit = new JButton("Salir");
        btn_exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        cons.gridx = 0;
        cons.gridy = 2;
        cons.gridwidth = 2;
        pnl_main.add(btn_exit, cons);

        // Window transparency
        this.setUndecorated(true);
        this.setBackground(new Color(1f, 1f, 1f, 0f));
        this.setLocationRelativeTo(null);

        // Frame Final Setup
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public void initTimer () {

        listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update();
            }
        };

        time = new Timer(1000, listener);
        time.start();

    }

    public void update () {

        delay++;

        if (mode == 0) {
            if (lbl_img1.getIcon() == imgs[0] && delay == 2){
                lbl_img1.setIcon(imgs[2]);
                lbl_img2.setIcon(imgs[2]);
            } else {
                lbl_img1.setIcon(imgs[0]);
                lbl_img2.setIcon(imgs[0]);
            }
            delay = 0;
        } else {
            if (imgState == 0 || ( imgState == 3 && delay == 5 )) {
                lbl_img1.setIcon(imgs[1]);
                lbl_img2.setIcon(imgs[3]);
                imgState = 1;
                delay = 0;
            } else if (imgState == 1 && delay == 3) {
                lbl_img1.setIcon(imgs[2]);
                imgState = 2;
                delay = 0;
            } else if (imgState == 2 && delay == 2) {
                lbl_img1.setIcon(imgs[3]);
                lbl_img2.setIcon(imgs[1]);
                imgState = 3;
                delay = 0;                
            } else if (imgState == 3 && delay == 3) {
                lbl_img2.setIcon(imgs[2]);
            }
        }

    }

    public static void main(String[] args) {
        new Exercise_133();
    }
}