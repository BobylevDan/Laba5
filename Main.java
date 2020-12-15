import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main implements ActionListener {

    private int countMilan = 0;
    private int countMadrid = 0;
    private JFrame frame;
    private JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JButton button1;
    private JButton button2;


    public Main()
    {
        frame = new JFrame();
        frame.setSize(500,500);

     button1 = new JButton ("AC Milan");
     button1.addActionListener(this);

    button2 = new JButton ("Real Madrid");
    button2.addActionListener(this);

    lbl1 = new JLabel("Result: 0 x 0");
    lbl2 = new JLabel("Last Scorer: N/A");
    lbl3 = new JLabel("Winner: DRAW");


        button1.setBounds(0,50,100,200);
        button2.setBounds(300,50,100,200);
        lbl1.setBounds(0,150,100,200);
        lbl2.setBounds(150,150,100,200);
        lbl3.setBounds(400,150,100,200);

        JPanel panel = new JPanel();

        panel.add(button1);
        panel.add(button2);
        panel.add(lbl1);
        panel.add(lbl2);
        panel.add(lbl3);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[]args)
    {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1) {
            countMilan++;
            lbl1.setText("Result:" + countMilan + " X " + countMadrid);
            lbl2.setText("Last scorer: AC Milan!");
        }
        else if (e.getSource() == button2) {
            countMadrid++;
            lbl1.setText("Result:" + countMilan + " X " + countMadrid);
            lbl2.setText("Last scorer: Real Madrid!");
        }

    if (countMilan > countMadrid)
        lbl3.setText("Winner: AC Milan");
    else if (countMilan < countMadrid)
        lbl3.setText("Winner: Real Madrid");
    else lbl3.setText("Winner: DRAW");

    }
}


