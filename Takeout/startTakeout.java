package Takeout;
import javax.swing.JFrame;
public class startTakeout {
    public static void createGUI(String[] args) {
        JFrame frame = new JFrame("Takeout");
        Model model = new Model();
        View view = new View(model, frame);
        Controller controller = new Controller(model, view);
        view.display();
    }
}