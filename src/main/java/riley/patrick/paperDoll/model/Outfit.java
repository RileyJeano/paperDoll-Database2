package riley.patrick.paperDoll.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Outfit {

	@Id
	@GeneratedValue
	private Long outfitId;
	private String outfitStyle;

	@JsonIgnore
	@OneToOne
	private Base base;

	public Outfit() {
	}

	public Outfit(String outfit) {
		super();
		this.outfitStyle = outfit;
	}

	public Base getBase() {
		return base;
	}

	public Long getTopId() {
		return outfitId;
	}

	public String getTop() {
		return outfitStyle;
	}

}
