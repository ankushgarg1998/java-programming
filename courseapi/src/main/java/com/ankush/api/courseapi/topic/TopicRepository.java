package com.ankush.api.courseapi.topic;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TopicRepository extends CrudRepository<Topic, String> {

    @Query(value = "select * from topic where description like LOWER(CONCAT('%',:searchTerm, '%'))", nativeQuery = true)
    public List<Topic> tempFunc(@Param("searchTerm") String searchTerm);

}
