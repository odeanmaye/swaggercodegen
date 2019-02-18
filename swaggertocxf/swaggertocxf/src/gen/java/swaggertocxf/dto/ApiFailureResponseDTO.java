package swaggertocxf.dto;


import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;





@ApiModel(description = "")
public class ApiFailureResponseDTO  {
  
  
	public enum MessageEnum {
		  
	     CLIENTERROR("Client Error"),
	     SERVERERROR("Server Error");
		  
	     private String displayName;
	     MessageEnum(String dispName){
	    	 
	    	 this.displayName=dispName;
	    	 
	     }
	     
	     public String getDisplayName(){
	    	 return displayName;
	     }
	     @Override public String toString() { return displayName; }
	     
	  }
  private MessageEnum message = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("message")
  public MessageEnum getMessage() {
    return message;
  }
  public void setMessage(MessageEnum message) {
    this.message = message;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiFailureResponseDTO {\n");
    
    sb.append("  message: ").append(message).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
