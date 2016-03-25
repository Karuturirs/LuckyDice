package com.fun.practice;

import java.awt.Frame;
import java.awt.Toolkit;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ProcessingDialog extends JDialog implements Runnable {
    /***/
private static final long serialVersionUID = 1L;
     private Thread t;
     private Runnable r;
     private JLabel l;
     private boolean done;
     public ProcessingDialog(Frame owner, String title, boolean modal, Runnable r) {
     super(owner, title, modal);
        setIconImage(Toolkit.getDefaultToolkit().getImage("imag5.JPG"));
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.r = r;
        l = new JLabel("Rolling....  /");
        JPanel p = new JPanel();
        p.add(l);
        getContentPane().add(p);
        setSize(150,100);
        t = new Thread(this);
        done = false;
        t.start();
        setVisible(true);
        }
     public final void run() {
        Thread processing = new Thread(new Runnable() {
            public void run() {
                Thread t = new Thread(r);
                t.start();
                try {
                    t.join();
                    }
                catch (InterruptedException x) {
                    x.printStackTrace();
                }
                done = true;
            }
        });
        processing.start();
        while (!done) {
            String text = l.getText();
            char c = text.charAt( text.length() - 1 );
            char newC = 0;
            switch (c) {
                case '/' :
                    newC = '-';
                    break;
                case '-' :
                    newC = '\\';
                    break;
                case '\\':
                    newC = '|';
                    break;
                default:
                    newC = '/';
                    break;
            }
            text = text.replace(c, newC);
            l.setText(text);
            try {
                Thread.sleep(50);
            }
            catch (InterruptedException x) {
                x.printStackTrace();
            }
        }
        l.setText("Rolling... done!");
        try {
            Thread.sleep(700);
        }
        catch (InterruptedException x) {
            x.printStackTrace();
        }
        dispose();
    }
}
