package com.lab.gled.repository;

import com.lab.gled.model.Document;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gledson
 */
@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer> { 
    
    @Query(value = "SELECT id, author,json_content from Document",
            nativeQuery = true)
    public List<Document> getAllContent(String term);
    
    @Query(value = "SELECT * from Document",
            nativeQuery = true)
    public List<Document> getAllParameter();

    public Document findByModelName(String name);
    
    
}
