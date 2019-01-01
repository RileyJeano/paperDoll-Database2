package riley.patrick.paperDoll.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Hair {

	@Id
	@GeneratedValue
	private Long hairId;
	private String hairStyle;

	@JsonIgnore
	@OneToOne
	private Base base;

	public Hair() {
	}

	public Hair(String hairStyle) {
		this.hairStyle = hairStyle;
	}

	public Base getBase() {
		return base;
	}

	public void setHero(Base base) {
		this.base = base;
	}

	public Long getHairId() {
		return hairId;
	}

	public String getHairStyle() {
		return hairStyle;
	}
}
