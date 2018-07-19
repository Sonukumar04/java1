import java.io.*;

public class DynamicFileHandling1 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:/Users/Sonu/Desktop/Sonu/Sonu2/abc.txt");
		f.createNewFile();
		System.out.println("Path=" +f.getPath());
		 
		try { 
			Writer w = new FileWriter("abc.txt");  
	            		String str = "Assignment 8";  
	            		w.write(str);  
	            		w.close();  
	            
	            		System.out.println("we are done");  
	        	}
		catch (IOException e) {  
	            		e.printStackTrace();
	 }  
			
			
			try {  
	            Reader r = new FileReader("abc.txt");  
	            int data = r.read(); 
	            
	            while (data != -1) {  
	                System.out.print((char) data);  
	                data = r.read();  
	            }  
	            r.close();  
	        } catch (Exception ex) {  
	            System.out.println(ex); 
	            }

		
		
	}
}