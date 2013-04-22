package com.qait.automation.report;

import com.jav.SiteCore.fixture.*;
import com.jav.SiteCore.util.Utilities;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeBodyPart;
import javax.mail.Multipart;
import javax.mail.internet.MimeMessage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ResultsIT {

    String testdata;
    Date today = new Date();
    String host = "smtp.gmail.com";
//    String from = "automation.resultsqait@gmail.com";
//    String password = "Q@inf0+ech";
    
    String from = "qaitautomation@gmail.com";
    String password = "qainfotech";
    String port = "465";
    WhichProgramIsRightForMe_Fixture test = new WhichProgramIsRightForMe_Fixture();
    Message message;
    public String textFile1;

    @BeforeClass
    void setupMailConfig() {
        test.setUpDataFile("testData/integration_testData_SiteCore.yml");
        System.out.println("");
    }

    @Test
    public void sendResultsMail() throws Exception {
    	try{
        if (Utilities.getYamlValue("results.sendEmail").equalsIgnoreCase("yes")) {
            message = new MimeMessage(getSession());
            message.setFrom(new InternetAddress(from));
            setMailRecipient(message);
            message.setSubject(setMailSubject());
            message.setContent(setAttachement());
            Properties properties = System.getProperties();
            Session session = Session.getDefaultInstance(properties);
            message.setContent(setAttachement());
            Transport transport = session.getTransport("smtps");
            transport.connect(host, from, password);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        } else {
            System.out.println("enteredElse");
        }
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }

    private Session getSession() {
        Authenticator authenticator = new Authenticator(from, password);

        Properties properties = new Properties();
        properties.setProperty("mail.transport.protocol", "smtps");
        properties.put("mail.smtps.auth", "true");
        //properties.setProperty("mail.smtp.starttls.enable", "true");
        properties.setProperty("mail.smtp.submitter", authenticator.getPasswordAuthentication().getUserName());
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.smtp.port", port.toString());
        return Session.getInstance(properties, authenticator);
    }

    public String setBodyText() throws IOException {
        String mailtext = "";
        mailtext = "Hi,<br>";
        mailtext = mailtext + "</br><br>The automated functional test were performed</br><br>";
        mailtext = mailtext + "<br><b><font style= Courier, color = green>Test Name: </font></b>" + getTestName();
        mailtext = mailtext + "<br><b><font color = green>Test Date: </font></b>" + today;
        mailtext = mailtext + "<br><b><font color = green>Test Browser: </font></b>" + Utilities.getYamlValue("browser");
        mailtext = mailtext + "<br><b><font color = green>Test Environment: </font></b>" + Utilities.getYamlValue("appurl");
        
        mailtext = mailtext + "<br><b><font color = green>Test Case Executed By: </font></b>" + System.getProperty("user.name");
        mailtext = mailtext + "<b>" + testSetResult() + "</b>";
        
       
        	mailtext = mailtext + "<br><br>The detailed test results are given in the attached <i>emailable-report.html</i> </br></br>";
      	
        
        
        mailtext = mailtext + "<br><br>Best Regards" + "</br></br>";
        mailtext = mailtext + "<br>TeachScape Automation QA Team" + "</br>";
        mailtext = mailtext + "<br><br>Note: This is a system generated mail. Please do not reply." + "</br></br>";
        mailtext = mailtext + "<br>If you have any queries mail to <a href=mailto:prashantshukla@qainfotech.net?Subject=Reply of Automation Status>Prashant Shukla</a></br>";
        return mailtext;
    }

    private String setMailSubject() {
        return ("PennFoster Automated EOL Test Report - " + today);
    }

    private void setMailRecipient(Message message) {
        // System.out.println("EnteredsetMailRecipient");
        try {
            for (Object recipient : Utilities.getYamlNodesArray("results.recipients").values()) {
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient.toString()));
                message.addRecipient(Message.RecipientType.BCC, new InternetAddress(recipient.toString()));
            }
            message.addRecipient(Message.RecipientType.TO, new InternetAddress("automation.results.qait@gmail.com"));
            message.addRecipient(Message.RecipientType.BCC, new InternetAddress("shivamtiwari@qainfotech.net"));
        } catch (MessagingException me) {
            System.out.println("Exception in Results mail sending:-" + me.getStackTrace());
        }

    }

    private Multipart setAttachement() throws Exception {
// Create the message part 
        MimeBodyPart messageBodyPart = new MimeBodyPart();
        //BodyPart messageBodyPart = new MimeBodyPart();

// Fill the message
        //messageBodyPart.setText(setBodyText());
        messageBodyPart.setContent(setBodyText(), "text/html");
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);

// Part two is attachment
        messageBodyPart = new MimeBodyPart();
        
        
        replaceEmailReport();
        
        	messageBodyPart.attachFile("./target/surefire-reports/emailable-report.html");
        	multipart.addBodyPart(messageBodyPart);
        	 	
        
        return multipart;
    }

    public void replaceEmailReport()
    {
    	
    	if (getTestName().contains("SelectedCourse")){
        	try
            {
            File file = new File("./target/surefire-reports/emailable-report.html");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "", oldtext = "";
            while((line = reader.readLine()) != null)
                {
                oldtext += line + "\r\n";
            }
            reader.close();
            // replace a word in a file
            //String newtext = oldtext.replaceAll("drink", "Love");
           
            //To replace a line in a file
            String newtext = oldtext.replaceAll("Parameter #11", "Course Name EOL"); 
            String renewtext = newtext.replaceAll("Parameter #2", "Time to Complete");
            
            newtext = renewtext.replaceAll("Parameter #3", "Chat Now");
            renewtext = newtext.replaceAll("Parameter #4", "Program");        
            newtext = renewtext.replaceAll("Parameter #5", "Phone Number Option");       
            renewtext = newtext.replaceAll("Parameter #6", "GA Script");       
            newtext = renewtext.replaceAll("Parameter #7", "SiteCore Form");       
            renewtext = newtext.replaceAll("Parameter #9", "Course Code");       
            newtext = renewtext.replaceAll("Parameter #10", "Program of Interest");       
            renewtext = newtext.replaceAll("Parameter #1", "Course Name");      

            newtext = renewtext.replaceAll("ffff00&quot;&gt;", "ffff00\">");       
            renewtext = newtext.replaceAll("Warning&lt;/p&gt;", "Warning</p>");       
            newtext = renewtext.replaceAll("&quot;color", "\"color"); 
            renewtext = newtext.replaceAll("&lt;p", "<p");       
            newtext = renewtext.replaceAll("Parameter #8", "Phone Number");       

            
            
            FileWriter writer = new FileWriter("./target/surefire-reports/emailable-report.html");
            writer.write(newtext);writer.close();
        }
        catch (IOException ioe)
            {
            ioe.printStackTrace();
        }
    	}
    	
    	if (getTestName().contains("FloodLight")){
        	try
            {
            File file = new File("./target/surefire-reports/emailable-report.html");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = "", oldtext = "";
            while((line = reader.readLine()) != null)
                {
                oldtext += line + "\r\n";
            }
            reader.close();
            // replace a word in a file
            //String newtext = oldtext.replaceAll("drink", "Love");
           
            //To replace a line in a file
            String newtext = oldtext.replaceAll("Parameter #1", "Course Name"); 
            String renewtext = newtext.replaceAll("Parameter #2", "Program of Interest");
            
            newtext = renewtext.replaceAll("Parameter #3", "Course Name On EOL");
            renewtext = newtext.replaceAll("Parameter #4", "SiteCore Form");        
                  
            
            FileWriter writer = new FileWriter("./target/surefire-reports/emailable-report.html");
            writer.write(renewtext);writer.close();
        }
        catch (IOException ioe)
            {
            ioe.printStackTrace();
        }    		

    	}
    }
    
    
    private String getTestName() {
        String test = System.getProperty("test", "null");
        String testsuite = System.getProperty("testsuite", "null");
        String testName;
        if (test != "null") {
            testName = test + " was executed";
            return testName;
        } else if (testsuite != "null") {
            testName = testsuite + "were executed";
            return testName;
        } else {
            testName = "complete automation test suite or TestNg xml was executed";
            return testName;
        }
    }

    public void getFilePath() {
        File folder = new File("./target/surefire-reports");
        String[] fileNames = folder.list();

        int total = 0;
        for (int i = 0; i < fileNames.length; i++) {
            if (fileNames[i].contains(".txt")) {
                total++;
                // System.out.println("total is" + total);
                assert total == 1;

                textFile1 = fileNames[i];
                //System.out.println("The filename is:" + textFile1);

            }

        }

    }

    public String testSetResult() throws IOException {
        String messageToBeSent = ("");
        getFilePath();//calling method getFilepath()
        String textFilePath = "./target/surefire-reports/" + textFile1;
        FileInputStream fstream = new FileInputStream(textFilePath);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        int num = 4;
        //Read File Line By Line
        String[] strLine = new String[num];
        for (int i = 0; i < num; i++) {
            strLine[i] = br.readLine();
            messageToBeSent = messageToBeSent + "<br>" + strLine[i] + "</br>";
        }
        return messageToBeSent;
    }
}