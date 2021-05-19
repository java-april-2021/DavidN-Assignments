package com.davidnestor.relationships.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.davidnestor.relationships.models.License;
import com.davidnestor.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {
	@Autowired
	private LicenseRepository lRepo;

	public LicenseService(LicenseRepository lRepo) {
		this.lRepo = lRepo;
	}

	public License getLicense(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	
	public License createLicense(License newLicense) {
		this.lRepo.save(newLicense);
		License.setLicensecounter(License.getLicensecounter() + 1);
		String zeros = "";
		int length = String.valueOf(License.getLicensecounter()).length();
		for(int i = 0; i <= 6 - length; i++) {
			zeros += "0";
		}
		newLicense.setNumber(zeros + Integer.toString(License.getLicensecounter()));
		this.lRepo.save(newLicense);
		return newLicense;
	}
	
	
}
