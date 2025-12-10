import javax.swing.*;
import java.awt.*;
 class SwingDemo {
    JFrame f;
    JLabel lbl;
    JTextField t1;
    JButton b1;
    JPanel p;

    SwingDemo() {
        f = new JFrame("Hello Swing");
        lbl = new JLabel("Enter a string:");
        t1 = new JTextField(20);
        b1 = new JButton("Check Palindrome");
        p = new JPanel();
        p.add(lbl);
        p.add(t1);
        p.add(b1);
        f.add(p);
        f.setSize(300, 150);
        f.setLocation(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        b1.addActionListener(e -> showPalindrome());
    }

    public void showPalindrome() {
        String s = t1.getText();
        String msg = "Palindrome";
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                msg = "Not a palindrome";
                break;
            }
            i++;
            j--;
        }
        JOptionPane.showMessageDialog(f, s + " is " + msg);
    }

    public static void main(String[] args) {
        new SwingDemo();
    }
}