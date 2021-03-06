import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;

public class Application extends JFrame{

    Brush brush;

    Application() {
        super("ВЕЛОСИПЕД-ПЕИНТ");
        setBounds(0, 0, 2000, 800);
        brush = new Brush();
        if (brush == null)
            brush = new Brush(Color.YELLOW);
    }

    void Render(){
        addMouseListener(new Click());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.RED);
        setVisible(true);
    }

    private class Click implements MouseListener {
        public void mouseEntered(MouseEvent mouseEvent){

        }

        @Override
        public void mouseClicked(MouseEvent mouseEvent){
            brush.Draw(mouseEvent.getX(), mouseEvent.getY()); //Рисуем точку
        }

        public void mousePressed(MouseEvent mouseEvent){

        }

        public void mouseReleased(MouseEvent mouseEvent){

        }

        public void mouseExited(MouseEvent click){

        }
    }

    public static void main(String [] args){
        Application paint = new Application();
        paint.Render();
    }
}
