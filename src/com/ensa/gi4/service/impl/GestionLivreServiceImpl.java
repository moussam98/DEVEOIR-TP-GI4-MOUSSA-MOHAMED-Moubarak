package com.ensa.gi4.service.impl;

import java.util.List;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.gi4.datatabase.api.MaterielDao;
import com.ensa.gi4.modele.Materiel;
import com.ensa.gi4.service.api.GestionMaterielService;

@Service("livreService")
public class GestionLivreServiceImpl implements GestionMaterielService, SmartInitializingSingleton {

	@Autowired
	MaterielDao materielDao; 
	
	@Override
	public void afterSingletonsInstantiated() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ajouterNouveauMateriel(Materiel materiel) {
		materielDao.ajouter(materiel); 
	}

	@Override
	public void supprimerMateriel(String code) {
		materielDao.supprimerMateriel(code);
	}


	@Override
	public void modifierMateriel(String code, Integer stock, String ancienCode) {
		materielDao.updateMateriel(code, stock, ancienCode); 
	}

	@Override
	public List<Materiel> listeMaterielAlloue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void materielIndisponible(String code) {
		materielDao.materielIndisponible(code); 
		
	}
 
}
