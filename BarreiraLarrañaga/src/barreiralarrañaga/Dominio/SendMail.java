/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barreiralarrañaga.Dominio;
  import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


public class SendMail {

    /**
     *
     * @param mensajeTitulo : Titulo del mensaje
     * @param mensajeCuerpo : Cuerpo del mensaje
     * @param mailDestinatario: Mail del destinatario
     */
    public void Send(String mensajeTitulo, String mensajeCuerpo, String mailDestinatario){
    Properties props = System.getProperties();
    props.put("mail.smtp.starttls.enable", true); // added this line
    props.put("mail.smtp.host", "smtp.gmail.com");
    props.put("mail.smtp.user", "mailIS1BarreiraLarra@gmail.com");
    props.put("mail.smtp.password", "holaholahola");
    props.put("mail.smtp.port", "587");
    props.put("mail.smtp.auth", true);
    Session session = Session.getInstance(props,null);
    MimeMessage message = new MimeMessage(session);



    // Create the email addresses involved
    try {
        InternetAddress from = new InternetAddress("mailIS1BarreiraLarra@gmail.com");
        message.setSubject(mensajeTitulo);
        message.setFrom(from);
        message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(mailDestinatario));

        // Create a multi-part to combine the parts
        Multipart multipart = new MimeMultipart("alternative");
        // Create your text message part
        BodyPart messageBodyPart = new MimeBodyPart();
        // Create the html part
        messageBodyPart = new MimeBodyPart();
        String htmlMessage = mensajeCuerpo;
        messageBodyPart.setContent(htmlMessage, "text/html");
        // Add html part to multi part
        multipart.addBodyPart(messageBodyPart);
        // Associate multi-part with message
        message.setContent(multipart);
        // Send message
        Transport transport = session.getTransport("smtp");
        transport.connect("smtp.gmail.com", "mailIS1BarreiraLarra@gmail.com", "holaholahola");

        transport.sendMessage(message, message.getAllRecipients());


    } catch (AddressException e) {
    } catch (MessagingException e) {
    }
}
}