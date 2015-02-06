package com.hopwork.api.repository;

import com.hopwork.api.model.recommandation.Recommandation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomRecommandationRepository {

    @Query("{'profileId' : ?0, 'acceptedReco' : true}")
    public Page<Recommandation> findByProfileId(@Param("profileId") String profileId, Pageable pageable);

}