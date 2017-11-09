package com.project.DojoOverflow.repositories;

import com.project.DojoOverflow.models.Qtags;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QtagsRepository extends CrudRepository<Qtags, Long> {
    List<Qtags> findAll();
    //findByTagContaining
    List<Qtags> findBySubjectContaining(String search);
}