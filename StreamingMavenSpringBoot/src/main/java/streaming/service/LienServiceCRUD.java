/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import streaming.entity.Lien;

/**
 *
 * @author admin
 */
public interface LienServiceCRUD extends CrudRepository<Lien, Long>{
 
    //13
    public List<Lien> findAllByFilmId (Long id);
    //16. Tous les liens d'un numéro d'épisode d'un numéro de saison d'une série donnée
    public List<Lien> findAllByEpisodeNumEpisodeAndEpisodeSaisonNumSaisonAndEpisodeSerieTitre (int numEpi, int numSaison, String titreSerie);
}
