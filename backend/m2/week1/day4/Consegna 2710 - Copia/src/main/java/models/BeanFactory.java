package models;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanFactory {
	
	@Bean(name="menuSettimanale")
	@Scope("singleton")
	public Menu getMenu() {
		Menu m  = new Menu();
		m.setNome("Menu Settimanale");

		List<Pizza> pizze = new ArrayList();
		pizze.add(new PizzaMargherita());
		pizze.add(new PizzaHawaiian());
		m.setPizze(pizze);
		
		List<Pizza> custom = new ArrayList();
		PizzaBase p = new PizzaBase();
		p.addTopping(new Pomodoro());
		p.addTopping(new Mozzarella());
		p.addTopping(new Mozzarella());
		p.addTopping(new Prosciutto());
		custom.add(p);
		
		Pizza p1 = new PizzaHawaiian();
		p1.addTopping(new Mozzarella());
		custom.add(p1);
		
		m.setCustom(custom);
		
		
		return m;
		
	}
	

}
