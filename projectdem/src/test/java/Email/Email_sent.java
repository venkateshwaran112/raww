package Email;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import com.testing.framework.EmailUtils;

public class Email_sent {
	public static void main(String[] args) throws Exception {
		
		try {

			EmailUtils em = new EmailUtils();
			Properties pr = new Properties();
			pr.load(new FileInputStream("C:\\Users\\venkateshwaran_m\\git\\raw\\projectdem\\src\\test\\resources\\com\\property\\config2.properties"));
			ArrayList<String> att = new ArrayList<String>();
			att.add("C:\\Users\\venkateshwaran_m\\git\\raw\\projectdem\\test-output\\PdfReport\\ExtentPdf.pdf");
			em.sendUsingGmail(pr, "Selenium update", "Selenium mail attachement is being added successfully",
						att);	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
	

}
