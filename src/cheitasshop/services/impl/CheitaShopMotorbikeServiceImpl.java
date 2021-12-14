package cheitasshop.services.impl;

import cheitasshop.entities.Motorbike;
import cheitasshop.entities.valueobject.MotorbikeParts;
import cheitasshop.services.CheitaShopMotorbikeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CheitaShopMotorbikeServiceImpl implements CheitaShopMotorbikeService {


	@Override
	public Motorbike repair(Motorbike motorbike) {

		List<MotorbikeParts> brokenParts = checkMotorbikeIssues(motorbike);
		if (brokenParts.isEmpty()) {
			System.out.println("Nothing to repair, you motorbike is OK.");
			return motorbike;
		}
		return motorbikeReparation(motorbike,brokenParts);

	}

	private List<MotorbikeParts> checkMotorbikeIssues(Motorbike motorbike) {
		List<MotorbikeParts> brokenParts = new ArrayList<>();
		for (Map.Entry<MotorbikeParts, Boolean> entry : motorbike.getMotorbikePartsMap().entrySet()) {
			if (entry.getValue()) {
				brokenParts.add(entry.getKey());
			}
		}
		return brokenParts;
	}

	private Motorbike motorbikeReparation(Motorbike motorbike, List<MotorbikeParts> brokenParts) {
		for (MotorbikeParts brokenPart : brokenParts) {
			motorbike.getMotorbikePartsMap().put(brokenPart, false);
		}
		return motorbike;
	}
}
