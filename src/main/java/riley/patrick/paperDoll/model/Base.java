package riley.patrick.paperDoll.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Base {

	@Id
	@GeneratedValue
	private Long baseId;
	private String baseName;
	private String baseImage;

	@JsonIgnore
	@OneToOne
	private Face baseFace;

	@JsonIgnore
	@OneToOne
	private Hair baseHair;

	@JsonIgnore
	@OneToOne
	private Outfit baseOutfit;

	public Base() {
	}

	public Base(String baseName, String baseImage, Hair baseHair, Face baseFace, Outfit baseOutfit) {
		this.baseName = baseName;
		this.baseImage = baseImage;
		this.baseHair = baseHair;
		this.baseFace = baseFace;
		this.baseOutfit = baseOutfit;
	}

	public String getBaseImage() {
		return baseImage;
	}

	public Long getBaseId() {
		return baseId;
	}

	public String getBaseName() {
		return baseName;
	}

	public Face getBaseFace() {
		return baseFace;
	}

	public Hair getBaseHair() {
		return baseHair;
	}

	public Outfit getOutfitTop() {
		return baseOutfit;
	}

}
