package Takeout;
import javax.swing.JFrame;
public class startTakeout {
    public static void Main(String[] args) {
        JFrame frame = new JFrame("Sorting");
        Model model = new Model();
        View view = new View(model, frame);
        Controller controller = new Controller(model, view);
        view.display();
    }
}