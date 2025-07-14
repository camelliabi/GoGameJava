// 


import java.awt.Color;
import ecs100.*;

public class GoGame{

    public static final double boardLeft = 10;   // Top left corner of the board
    public static final double boardTop = 10;
    public static final double boardSize = 400;  // The size of the board on the window
    int playerturn = 0;
    int num = 1;
    
    /** Draw a square grid board with white squares.
     *  Asks the user for the number of squares on each side
     *
     */
    public void drawGridBoard(){
        UI.clearGraphics();
        num = UI.askInt("How many rows do you want in the checkerboard?");
        UI.setColor(Color.black);
        for(int i = 0; i < num+1; i ++) {
        	double distance = boardSize / num;
        	UI.setLineWidth(1);
        	UI.drawLine(boardLeft, boardTop + distance * i, boardLeft + boardSize, boardTop + distance * i);
        	UI.drawLine(boardLeft + distance * i, boardTop, boardLeft + distance * i, boardTop + boardSize);
        }
        UI.setMouseListener(this::doMouse);
    }

    public void doMouse(String action, double x, double y) {
    	double distance = boardSize / num;
    	double r = distance / 2 ;
    	int i = (int)((x + r - boardLeft) / distance);
    	int j = (int)((y + r - boardTop) / distance);
    	double buttonX = boardLeft + i * distance;
    	double buttonY = boardTop + j * distance;
    	double top = buttonY - r;
    	double left = buttonX - r;
    	UI.setColor(Color.black);
    	UI.setLineWidth(2);
    	UI.drawOval(left, top, 2 * r, 2 * r);
    	java.awt.Color col[] = {Color.white, Color.black};
    	if(playerturn == 0) {
    		playerturn = 1;
    		} else {
    			playerturn = 0;
    			}
    	UI.setColor(col[playerturn]);
    	UI.fillOval(left, top, 2 * r, 2 * r);
    	}
    }

