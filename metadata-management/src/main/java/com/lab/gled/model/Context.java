
package com.lab.gled.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import lombok.Data;

/**
 *
 * @author gledson
 */

@Data
public class Context implements Serializable {
    
    @JsonProperty("name")
    private String name;
   
    @JsonProperty("asset")
    List<Map<String,Object>> asset;
}
