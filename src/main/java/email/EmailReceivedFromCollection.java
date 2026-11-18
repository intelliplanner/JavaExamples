package main.java.email;

//import javax.mail.*;
//import javax.mail.search.SearchTerm;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class EmailReceivedFromCollection {

    // Gmail IMAP settings
    private static final String HOST = "imap.gmail.com";
    private static final String PORT = "993";
//    private static final String USERNAME = "amit.kumar03uneecops@gmail.com";
//    private static final String APP_PASSWORD = "vchglpspnefmvvcu"; // App password, not normal password
   private static final String USERNAME = "";
    private static final String APP_PASSWORD = "";
    public static void main(String[] args) {
        searchEmail(HOST, PORT, USERNAME, APP_PASSWORD);
    }

    public static void searchEmail(String host, String port, String userName, String password) {
        Properties properties = new Properties();
        properties.put("mail.imap.host", host);
        properties.put("mail.imap.port", port);
        properties.put("mail.imap.ssl.enable", "true");
        // Prefer the imaps store for SSL/TLS connections
        properties.put("mail.store.protocol", "imaps");
        // Enable protocol debug to help diagnose connection problems
        properties.put("mail.debug", "false");

//        Session session = Session.getInstance(properties);
//
//        Store store = null;
//        Folder inbox = null;

        try {
            // Use IMAPS (secure IMAP) to connect to Gmail's IMAP server
//            store = session.getStore("imaps");
//            // Connect explicitly with host and port to avoid ambiguous defaults
//            store.connect(host, Integer.parseInt(port), userName, password);
//
//            inbox = store.getFolder("INBOX");
//            inbox.open(Folder.READ_ONLY);
//
//            // Example: filter by subject containing "Java"
//            SearchTerm searchCondition = new SearchTerm() {
//                @Override
//                public boolean match(Message message) {
//                    try {
//                        return message.getSubject() != null && message.getSubject().contains("Java");
//                    } catch (MessagingException e) {
//                        return false;
//                    }
//                }
//            };
//
//            Message[] foundMessages = inbox.search(searchCondition);
//            System.out.println("Found " + foundMessages.length + " matching messages.");

            SimpleDateFormat df = new SimpleDateFormat("MM/dd/yy");
            Date filterDate = df.parse("11/01/21"); // Example date filter

//            for (int i = 0; i < foundMessages.length; i++) {
//                Message message = foundMessages[i];
//                System.out.println("Message #" + (i + 1));
//                System.out.println("Subject: " + message.getSubject());
//                System.out.println("From: " + message.getFrom()[0]);
//                System.out.println("Received Date: " + message.getReceivedDate());
//
//                if (message.getReceivedDate().after(filterDate)) {
//                    System.out.println("This message is after " + df.format(filterDate));
//                }
                System.out.println("---------------------------------");
//            }

        } catch (Exception e) {
            System.err.println("Error while connecting to Gmail IMAP: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close resources safely
//            try {
//                if (inbox != null && inbox.isOpen()) {
//                    inbox.close(false);
//                }
//                if (store != null && store.isConnected()) {
//                    store.close();
//                }
//            } catch (MessagingException me) {
//                System.err.println("Error closing resources: " + me.getMessage());
//            }
        }
    }
}
