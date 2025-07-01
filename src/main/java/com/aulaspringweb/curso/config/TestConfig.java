package com.aulaspringweb.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aulaspringweb.curso.entities.Category;
import com.aulaspringweb.curso.entities.Order;
import com.aulaspringweb.curso.entities.OrderItem;
import com.aulaspringweb.curso.entities.Product;
import com.aulaspringweb.curso.entities.User;
import com.aulaspringweb.curso.entities.enums.OrderStatus;
import com.aulaspringweb.curso.repositories.CategoryRepository;
import com.aulaspringweb.curso.repositories.OrderItemRepository;
import com.aulaspringweb.curso.repositories.OrderRepository;
import com.aulaspringweb.curso.repositories.ProductRepository;
import com.aulaspringweb.curso.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private OrderItemRepository orderItemRepository;


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
		
		
		Category cat1 = new Category(null, "Eletronico");
		Category cat2 = new Category(null, "Livro");
		Category cat3 = new Category(null, "Acessorios");
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		
		OrderItem oi1 = new OrderItem(o1, p1, 2, p1.getPreco()); 
		OrderItem oi2 = new OrderItem(o1, p3, 1, p3.getPreco()); 
		OrderItem oi3 = new OrderItem(o2, p3, 2, p3.getPreco()); 
		OrderItem oi4 = new OrderItem(o3, p5, 2, p5.getPreco());

		
		userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10, u11, u12, u13, u14, u15, u16));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		
		
		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5));
		
		p1.getCategorys().add(cat2);
		p2.getCategorys().add(cat1);
		p2.getCategorys().add(cat3);
		p3.getCategorys().add(cat3);
		p4.getCategorys().add(cat3);
		p5.getCategorys().add(cat2);
		
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5)); 
		
		orderItemRepository.saveAll(Arrays.asList(oi1,oi2,oi3,oi4));
	}
	

}
