package com.project.DojoOverflow.repositories;
import com.project.DojoOverflow.models.QuestionTags;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionTagsRepository extends CrudRepository<QuestionTags, Long> {

}