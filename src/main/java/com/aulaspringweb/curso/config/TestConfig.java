package com.aulaspringweb.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aulaspringweb.curso.entities.Order;
import com.aulaspringweb.curso.entities.User;
import com.aulaspringweb.curso.entities.enums.OrderStatus;
import com.aulaspringweb.curso.repositories.OrderRepository;
import com.aulaspringweb.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Matheus Brown", "Matheus@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Bruce Lima", "bruce@gmail.com", "977777777", "123456");
		User u3 = new User(null, "TESTE MV TESTE TESTE", "sdgdgf@dtgdf.com","44485", "99999999");
		User u4 = new User(null, "PACIENTE TESTE MV LINDO", "aada.teixeira@mv.com.br","4556", "333090310");
		User u5 = new User(null, "NINA MARTINS BEZERRA DE MENEZES", "vitordominato%globo.com","454", "26108938");
		User u6 = new User(null, "ANA CLARA PEREIRA DA COSTA", "anaclarapereria26@gmail.com","4558", "982774732");
		User u7 = new User(null, "LEILA CRISTINA DE AZEVEDO ROCHA CRUZ", "leila.modl@yahoo.com.br","687321", "26283846");
		User u8 = new User(null, "MARCIA GALINDO COELHO DE AZEVEDO", "marciagcazevedo@gmail.com","16845", "26163494");
		User u9 = new User(null, "SILVANA LIMA NUNES", "silnanalinunes@yahoo.com.br","15413", "26381748");
		User u10 = new User(null, "MARCELLY CHRISTINA CARVALHO DE LIMA", "marcellyconsultoria@gmail.com","456", "98607363");
		User u11 = new User(null,"RICARDO ALEXANDRE AZEVEDO", "ricardo-alexandre-azevedo@hotmail.com","545", "2227590711");
		User u12 = new User(null, "CINTIA NAIRA PIMENTEL QUEIROZ", "cintianaira.queiroz@gmail.com","541", "26284481");
		User u13 = new User(null, "BEATRIZ PARANHOS COUTINHO VIGNOLI", "alexandracoutinho@gmail.com","54651", "81196440");
		User u14 = new User(null, "LIVIA LIMA SALGADO", "liviasalgado@gmail.com","19165", "2126258838");
		User u15 = new User(null,"THAYSE APOLINARIO FERREIRA RODRIGUES", "leonardoicm@hotmail.com","54684", "26340024");
		User u16 = new User(null, "SHIRLEY FERREIRA DA SILVA", "letofws@oi.com.br","1698413", "26164419");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.SHIPPED,  u1); 
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.DELIVERED, u2); 
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.PAID, u1); 

		
		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10, u11, u12, u13, u14, u15, u16));
		
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}

}
