package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.ItemsRepository;
import models.Item;

@Service
public class ItemsService {
	
	@Autowired
	ItemsRepository it;
	
	public void saveItems(Item i) {
		it.save(i);
	}
	
	public List<Item> getAllItems(){
		return it.findAll();
	}
	
	public void deleteItemsById(int id) {
		it.deleteById(id);
	}
}
	

