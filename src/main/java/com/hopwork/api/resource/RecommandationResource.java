package com.hopwork.api.resource;

import com.hopwork.api.model.recommandation.Recommandation;
import com.hopwork.api.repository.CustomRecommandationRepository;
import com.hopwork.api.repository.ReadOnlyRecommandationRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.hateoas.ExposesResourceFor;

@RepositoryRestResource
@ExposesResourceFor(Recommandation.class)
interface RecommandationResource extends ReadOnlyRecommandationRepository, CustomRecommandationRepository{

    @Override
    @RestResource(path = "profile")
    public Page<Recommandation> findByProfileId(@Param("profileId") String profileId, Pageable pageable);

}
