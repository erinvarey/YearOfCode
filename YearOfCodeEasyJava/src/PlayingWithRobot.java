import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class PlayingWithRobot {
	//cookie clicker

	public static void main(String[] args) throws IOException, URISyntaxException, AWTException, InterruptedException{
		//Thread.sleep(3000);
		Robot robot = new Robot();
		Desktop.getDesktop().browse(new URI("http://orteil.dashnet.org/cookieclicker/"));
		robot.delay(1000);
		int x =0;
		while(x<10000){
		int mask = InputEvent.BUTTON1_MASK;
		robot.mouseMove(300, 500);           
		robot.mousePress(mask);     
		robot.mouseRelease(mask);
		System.out.println("click");
		x++;
		}

	}

}
