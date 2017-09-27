package framework.debug.banking.asd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileAppender implements Appender {
	
	public static BufferedReader bufread;
    //Create the file name and path
    private static String path = "d:/Asdlog.txt";
    private static  File filename = new File(path);
    private static String readStr ="";
    
	@Override
	public void append(LogItem logitem) {
		String logcontent="Log level:"+logitem.loggerlevel+"."+
				          "Message:"+logitem.message+"."+
				          "Date:"+logitem.date+"\n";
		try {
			creatTxtFile();
			readStr=readTxtFile();
			writeTxtFile(logcontent);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	


    /**
     * Create log text file.
     * @throws IOException 
     * 
     */
    public static void creatTxtFile() throws IOException{
        if (!filename.exists()) {
            filename.createNewFile();
            System.err.println(filename + "ÒÑ´´½¨£¡");
        }
    }
    
    /**
     * Read the log file.
     * 
     */
    public static String readTxtFile(){
        String read;
        FileReader fileread;
        try {
            fileread = new FileReader(filename);
            bufread = new BufferedReader(fileread);
            try {
                while ((read = bufread.readLine()) != null) {
                    readStr = readStr + read+ "\r\n";
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

       // System.out.println("log file content:"+ "\r\n" + readStr);
        return readStr;
    }
    
    /**
     * Write log file.
     * 
     */
    public static void writeTxtFile(String newStr) throws IOException{
        //First to read the log file and then write
        String filein = newStr + "\r\n" + readStr + "\r\n";
        RandomAccessFile mm = null;
        try {
            mm = new RandomAccessFile(filename, "rw");
            mm.writeBytes(filein);
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            if (mm != null) {
                try {
                    mm.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }
}
