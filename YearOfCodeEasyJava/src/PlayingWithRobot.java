import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class PlayingWithRobot {
	//Some possibilities to make this appear more human:
	//randomize the timing between clicks
	//Change the approximate click location and add more movement
	//use a vpn or tor to change the location the bot appears to be running from 
	static Timer timer = new Timer();
    static int seconds = 0;
    
	public static void main(String[] args) throws IOException, URISyntaxException, AWTException, InterruptedException{
		//Thread.sleep(3000);
		
		Desktop.getDesktop().browse(new URI("http://orteil.dashnet.org/cookieclicker/"));
		MyTimer();

	}
	public static void MyTimer() {

        TimerTask task;

        task = new TimerTask() {
            @Override
            public void run() { 
				try {
					Robot robot = new Robot();
            	robot.delay(10000);
            		int mask = InputEvent.BUTTON1_MASK;
            		robot.mouseMove(300, 500);           
            		robot.mousePress(mask);     
            		robot.mouseRelease(mask);

				}
            	catch (AWTException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        };
         timer.schedule(task, 0, 10000);

}
}
