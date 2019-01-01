package riley.patrick.paperDoll;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import riley.patrick.paperDoll.model.Base;
import riley.patrick.paperDoll.model.Face;
import riley.patrick.paperDoll.model.Hair;
import riley.patrick.paperDoll.model.Outfit;
import riley.patrick.paperDoll.repository.BaseRepository;
import riley.patrick.paperDoll.repository.FaceRepository;
import riley.patrick.paperDoll.repository.HairRepository;
import riley.patrick.paperDoll.repository.OutfitRepository;

@Service
public class Populator implements CommandLineRunner {

	@Resource
	BaseRepository baseRepo;

	@Resource
	HairRepository hairRepo;

	@Resource
	FaceRepository faceRepo;

	@Resource
	OutfitRepository outfitRepo;

	private Base createBase(String baseName, String BaseImage, Hair baseHair, Face baseFace, Outfit baseOutfit) {
		Base baseDoll = new Base();
		return baseRepo.save(baseDoll);
	}

	private Hair createHair(String hairStyle) {
		Hair hairBase = new Hair(hairStyle);
		return hairRepo.save(hairBase);
	}

	private Face createFace(String face) {
		Face baseFace = new Face(face);
		return faceRepo.save(baseFace);
	}

	private Outfit createOutfit(String outfit) {
		Outfit baseOutfit = new Outfit(outfit);
		return outfitRepo.save(baseOutfit);
	}

	@Override
	public void run(String... args) throws Exception {

		Base baseDoll = createBase("", "/base.png", null, null, null);

		Hair hair1 = createHair("/hair1.png");
		Hair hair2 = createHair("/hair2.png");
		Hair hair3 = createHair("/hair3.png");
		Hair hair4 = createHair("/hair4.png");
		Hair hair5 = createHair("/hair5.png");
		Hair hair6 = createHair("/hair6.png");
		Hair hair7 = createHair("/hair7.png");
		Hair hair8 = createHair("/hair8.png");

		Face face1 = createFace("/face1.png");
		Face face2 = createFace("/face2.png");
		Face face3 = createFace("/face3.png");
		Face face4 = createFace("/face4.png");
		Face face5 = createFace("/face5.png");
		Face face6 = createFace("/face6.png");
		Face face7 = createFace("/face7.png");
		Face face8 = createFace("/face8.png");

		Outfit outfit1 = createOutfit("/outfit1.png");
		Outfit outfit2 = createOutfit("/outfit2.png");
		Outfit outfit3 = createOutfit("/outfit3.png");
		Outfit outfit4 = createOutfit("/outfit4.png");
		Outfit outfit5 = createOutfit("/outfit5.png");
		Outfit outfit6 = createOutfit("/outfit6.png");
		Outfit outfit7 = createOutfit("/outfit7.png");
		Outfit outfit8 = createOutfit("/outfit8.png");

	}

}
