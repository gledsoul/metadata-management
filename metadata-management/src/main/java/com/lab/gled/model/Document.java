package com.lab.gled.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vladmihalcea.hibernate.type.json.JsonType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.Type;

/**
 *
 * @author gledson
 */
@Entity
@Table(name = "document", schema = "public")
@Data
@EqualsAndHashCode(callSuper = false)
public class Document extends BaseModel implements Serializable {
    

    private static final long serialVersionUID = 1L;

    @JsonProperty("model_name")
    @Column(name = "model_name", length = 32)
    //@Schema(description = "the name of the model that you are saving",example = "my model 1")
    private String modelName;

    //@JsonIgnore
    //@JsonRawValue
    @JsonProperty("parameters")
    //@NotBlank(message = "Enter the content")
    @Type(JsonType.class)
    @Column(columnDefinition = "jsonb", unique = false, name = "parameters")
    private List<Object> parameters;
    //@NotBlank(message="Enter the model name")

   // @JsonRawValue
    @JsonProperty("basic_details")
    @Type(JsonType.class)
    @Column(columnDefinition = "jsonb", unique = false, name = "basic_details")
    private List<Object> basicDetails;

    //@JsonRawValue
    @JsonProperty("context")
    @Type(JsonType.class)
    @Column(columnDefinition = "jsonb", unique = false, name = "context")
    private List<Context> context;

}
