import javax.swing.JFrame;

public class MyJFrame extends JFrame{
    public MyJFrame(String title) {
        super(title);
        MyJPanel panel = new MyJPanel();
        setContentPane(panel);
        setLocation(700, 200);
        setSize(250, 250);
        setVisible(true);

    
    }    


}
