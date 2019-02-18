package swaggertocxf.dto;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;





@ApiModel(description = "")
public class MoleculeDTO  {
  
  
  @NotNull
  private Long weight = null;
  
  public enum TypeEnum {
	     PROTEIN("Protein"),LIPID("Lipid"),CARBOHYDRATE("Carbohydrate"),NUCLEICACID("Nucleic Acid"); 
		 private String displayName;
		 TypeEnum(String dName){
			 this.displayName=dName;
		 }
		 
		 public String getDisplayName(){
			 return displayName;
		 }
		 @Override public String toString() { return displayName; }
	  }
  
  private TypeEnum type = null;

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("weight")
  public Long getWeight() {
    return weight;
  }
  public void setWeight(Long weight) {
    this.weight = weight;
  }

  
  /**
   * Molecule Type
   **/
  @ApiModelProperty(value = "Molecule Type")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
    TypeEnum a=type.PROTEIN;
    
    
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoleculeDTO {\n");
    
    sb.append("  weight: ").append(weight).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
