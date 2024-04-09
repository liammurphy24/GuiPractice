import javax.swing.JFrame;

public class MyJFrame extends JFrame{
    public MyJFrame(String title) {
        super(title);
        // MyJPanel panel = new MyJPanel();
        // setContentPane(panel);
        setLocation(300, 200);
        setSize(800, 800);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    
    }    


}
