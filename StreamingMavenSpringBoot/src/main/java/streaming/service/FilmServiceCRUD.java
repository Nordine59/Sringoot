/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Film;
import streaming.entity.Lien;

/**
 *
 * @author admin
 */
public interface FilmServiceCRUD extends CrudRepository<Film, Long> {
    
    //1
    public Film findOneByTitre (String t);
    //2
    public List<Film> findAllByAnnee (Integer annee);
    //3
   public List<Film> findAllByAnneeOrTitre (String titre, Integer annee);
    //4
   public List<Film> findAllByAnneeAndTitre (Integer anness, String titre);
    //5
    public List<Film> findAllByGenreId ( Long id);
    //6 Les films pour un pays id donnée
    public List<Film> findAllByPaysId (Long id );
    //7. Les films pour un genre id et un pays id donnés
    public List<Film> findAllByGenreIdAndPaysId (Long GenreId, Long PaysId);
    //8. Les films pour un acteur (nom/prénom) donné
    public List<Film> findAllByActeursNomAndActeursPrenom(String nom, String prenom);
   // 9. Le nombre de films pour un acteur donné
    public Integer countByActeursNomAndActeursPrenom (String nom, String Prenom);
    //10. Les films pour un réalisateur donné, classés par titre
    public List<Film> findAllByRealisateursNomAndRealisateursPrenomOrderByTitre  (String nom, String prenom);
    //11. Le nombre de films pour un réalisateur donné
    public long countByRealisateursNomAndRealisateursPrenom (String nom, String Prenom);
    //12. Les films d'un pays donné, pour un genre donné, un réalisateur donné et un acteur donné
    public List<Film> findAllByRealisateursNomAndRealisateursPrenomAndActeursNomAndActeursPrenomAndPaysIdAndGenreId (String nomRea, String prenomRea, String nomActeur, String prenomActeur, Long id1, Long id2);
   
    
 
    
    
    
    
    
    //public List<Film> findAllByTitre(String titre);

}
