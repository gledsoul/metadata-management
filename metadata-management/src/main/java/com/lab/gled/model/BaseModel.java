
package com.lab.gled.model;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.UUID;

/**
 *
 * @author gledson
 */

@MappedSuperclass
public class BaseModel implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    
    //@Type(type = "pg-uuid")
    
    //@Type(type="uuid-char")
    private UUID id;
    
    public BaseModel(){
        this.id = UUID.randomUUID();
        
    }
    
}
