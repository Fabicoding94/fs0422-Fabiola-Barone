package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class ProdottoOrdine {

	private Item item;
	private String nota;
//	private int qnt;
}
