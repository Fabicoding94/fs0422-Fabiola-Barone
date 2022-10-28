package models;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Embeddable
@AllArgsConstructor
@Getter
@ToString
@NoArgsConstructor
public class ProdottoOrdine {

	private Item item;
	private String nota;
//	private int qnt;
}
