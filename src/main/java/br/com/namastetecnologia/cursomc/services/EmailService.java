package br.com.namastetecnologia.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.namastetecnologia.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
