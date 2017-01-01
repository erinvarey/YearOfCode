import java.io.File;

public class PlayingWithRobot {
	//i'm going to write a program to organize my files

	public static void main(String[] args){


	}
	//takes in directory that will be used
	public static void getFiles(File f)
	{
	File mainFolder = new File("C:\\yourDir");
	getFiles(mainFolder);
	   File files[];
	   if(f.isFile())
	   System.out.println(f.getAbsolutePath());
	   else
	   {
	      files = f.listFiles();
	      for (int i = 0; i < files.length; i++) 
	      {
	         getFiles(files[i]);
	      }
	  }
	}

}
