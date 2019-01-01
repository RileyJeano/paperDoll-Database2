package riley.patrick.paperDoll.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import riley.patrick.paperDoll.model.Base;
import riley.patrick.paperDoll.model.Face;
import riley.patrick.paperDoll.model.Hair;
import riley.patrick.paperDoll.model.Outfit;
import riley.patrick.paperDoll.repository.BaseRepository;
import riley.patrick.paperDoll.repository.FaceRepository;
import riley.patrick.paperDoll.repository.HairRepository;
import riley.patrick.paperDoll.repository.OutfitRepository;

@CrossOrigin
@RestController
public class ApiController {

	@Autowired
	HairRepository hairRepo;

	@Autowired
	FaceRepository faceRepo;

	@Autowired
	OutfitRepository outfitRepo;

	@Autowired
	BaseRepository baseRepo;

	@GetMapping("/api/base/{id}")
	public String getBase(@PathVariable Long id, Model model) throws Exception {
		Optional<Base> base = baseRepo.findById(id);
		if (base.isPresent()) {
			model.addAttribute("base", base.get());
		} else {
			return "redirect:/index?invalid=true";
		}
		return "index";
	}

	@GetMapping("/api/hairs")
	public Iterable<Hair> getHair() {
		return hairRepo.findAll();
	}

	@GetMapping("/api/hairs/{id}")
	public String getHair(@PathVariable Long id, Model model) throws Exception {
		Optional<Hair> hair = hairRepo.findById(id);
		if (hair.isPresent()) {
			model.addAttribute("hair", hair.get());
		} else {
			return "redirect:/index?invalid=true";
		}
		return "index";

	}

	@GetMapping("/api/faces")
	public Iterable<Face> getFaces() {
		return faceRepo.findAll();
	}

	@GetMapping("/api/face/{id}")
	public Optional<Face> getFace(@PathVariable Long id, Model model) throws Exception {
		Optional<Face> face = faceRepo.findById(id);
		if (face.isPresent()) {
			model.addAttribute("face", face.get());

		}
		return faceRepo.findById(id);

	}

	@GetMapping("/api/outfits")
	public Iterable<Outfit> getOutfit() {
		return outfitRepo.findAll();
	}

	@GetMapping("/api/outfits/{id}")
	public String getTop(@PathVariable Long id, Model model) throws Exception {
		Optional<Outfit> outfit = outfitRepo.findById(id);
		if (outfit.isPresent()) {
			model.addAttribute("outfit", outfit.get());
		} else {
			return "redirect:/index?invalid=true";
		}
		return "index";

	}

}