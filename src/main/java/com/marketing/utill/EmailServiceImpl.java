package com.marketing.utill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;



@Component
public class EmailServiceImpl implements EmailService {
	
	
	@Autowired
	private JavaMailSender javamailsender;

	@Override
	public void sendEmail(String to, String sub, String msg) {
		SimpleMailMessage mailmessage=new SimpleMailMessage();
		mailmessage.setTo(to);
		mailmessage.setSubject(sub);
		mailmessage.setText(msg);
		
		javamailsender.send(mailmessage);
	}

}
