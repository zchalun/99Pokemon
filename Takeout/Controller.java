package Takeout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Controller {
    private Model model;
    private View view;
    Controller(Model mmodel, View vview) {
        model = mmodel;
        view = vview;
        //add actionListeners
        view.addLoginListener(new LoginListener());
    }
    
    //actionListener methods
    class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.setUsername(view.getUsername());
            model.setPassword(view.getPassword());
        }
    }
}