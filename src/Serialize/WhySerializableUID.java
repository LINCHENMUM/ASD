package Serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WhySerializableUID {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Person crab = new Person();
//		crab.setName("Lin Chen");
//		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("Linchen_file"));
//		oo.writeObject(crab);
//		oo.close();
		
		ObjectInputStream oi=new ObjectInputStream(new FileInputStream("Linchen_file"));
		Person crab_back=(Person)oi.readObject();
		System.out.println(crab_back.getName());
		oi.close();

	}
}
