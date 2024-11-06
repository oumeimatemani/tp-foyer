package tn.esprit;



import lombok.AllArgsConstructor;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.TestMethodOrder;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.entity.Etudiant;
import tn.esprit.tpfoyer.repository.EtudiantRepository;
import tn.esprit.tpfoyer.service.IEtudiantService;

import java.util.List;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService {

    @Autowired
    IEtudiantService us ; 

    EtudiantRepository etudiantRepository;


    @Test
    @Order(1)
    public void testRetrieveAllEtudiants() {
        List<Etudiant> listEtudiants = us.retrieveAllEtudiants();
        Assertions.assertThat(listEtudiants.size()).isEqualTo(0);
    }
    


    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }
    public Etudiant retrieveEtudiant(Long etudiantId) {
        return etudiantRepository.findById(etudiantId).get();
    }
    public Etudiant addEtudiant(Etudiant c) {
        return etudiantRepository.save(c);
    }
    public Etudiant modifyEtudiant(Etudiant c) {
        return etudiantRepository.save(c);
    }
    public void removeEtudiant(Long etudiantId) {
        etudiantRepository.deleteById(etudiantId);
    }
    public Etudiant recupererEtudiantParCin(long cin)
    {
        return etudiantRepository.findEtudiantByCinEtudiant(cin);
    }



}
