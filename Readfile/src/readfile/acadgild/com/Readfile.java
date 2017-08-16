package readfile.acadgild.com;
import java.io.File;
public class Readfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("/Users/acadgild_user/desktop/lessfiles");
        File[] files = file.listFiles();
        for(File f: files){
            System.out.println(f.getName());

	}

        
  //Below example shows how to get list of all file objects from the given folder. First create File object by passing folder path. Call listFiles() method on file object to get list of file names in the given folder.
}
}
