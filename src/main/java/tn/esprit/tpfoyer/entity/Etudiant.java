package tn.esprit.tpfoyer.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor


@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEtudiant;

    //test commit;
    String nomEtudiant;
    String prenomEtudiant;
    long cinEtudiant;
    Date dateNaissance;
    Niveau niveau ; 

    @ManyToMany(mappedBy = "etudiants")
    Set<Reservation> reservations;

}



