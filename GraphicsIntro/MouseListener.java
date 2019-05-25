import acm.graphics.*;
import acm.program.*;
import java.awt.Color;
import java.awt.event.MouseEvent;


public class MouseListener extends GraphicsProgram{
    private static final int CLICKED_OVAL_DIAMETER = 20;

    private static final int MOVED_OVAL_DIAMETER = 5;

    GOval oval = new GOval(MOVED_OVAL_DIAMETER,MOVED_OVAL_DIAMETER);

    public void run() {


    }

    public void mouseClicked(MouseEvent e) {

        /**

         * This method is called whenever the mouse is clicked. (A click is a quick press and release)

         */


        double mouseX = e.getX();

        double mouseY = e.getY();

        oval.setLocation(mouseX,mouseY);
         add(oval);
    }



    public void mouseMoved(MouseEvent e) {

        addMouseListeners();

    }
}
