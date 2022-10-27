package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.ItemsRepository;
import Repository.MenuRepository;
import models.Item;
import models.Menu;

@Service
public class MenuService {

	@Autowired
	MenuRepository me;
	
	public void saveMenu(Menu m) {
		me.save(m);
	}
	
	public List<Menu> getAllMenu(){
		return me.findAll();
	}
	
	public void deleteMenuById(int id) {
		me.deleteById(id);
	}
}
	

