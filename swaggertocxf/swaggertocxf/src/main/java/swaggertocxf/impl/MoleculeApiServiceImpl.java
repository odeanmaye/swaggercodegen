package swaggertocxf.impl;

import swaggertocxf.*;
import swaggertocxf.dto.*;


import swaggertocxf.dto.MoleculeDTO;
import swaggertocxf.dto.ApiFailureResponseDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class MoleculeApiServiceImpl extends MoleculeApiService {
    @Override
    public Response classifyMolecule(MoleculeDTO body){
    	try{
    		
	    	if(body != null){
	    	if (body.getWeight() != 0 && body.getWeight() % 3 == 0 && body.getWeight() % 5 == 0){
	    		body.setType(swaggertocxf.dto.MoleculeDTO.TypeEnum.LIPID);
	    		
	    	} else if ( (body.getWeight() != 0 && body.getWeight() % 3 == 0)){
	    		body.setType(swaggertocxf.dto.MoleculeDTO.TypeEnum.PROTEIN);
	    	} else if ( (body.getWeight() != 0 && body.getWeight() % 5 == 0)){
	    		body.setType(swaggertocxf.dto.MoleculeDTO.TypeEnum.CARBOHYDRATE);
	    	} else {
	    		body.setType(swaggertocxf.dto.MoleculeDTO.TypeEnum.NUCLEICACID);
	    	}
	    	return Response.ok().entity(body).build();
	    	}
	    	else{
	    		swaggertocxf.dto.ApiFailureResponseDTO error = new swaggertocxf.dto.ApiFailureResponseDTO();
	    		error.setMessage(swaggertocxf.dto.ApiFailureResponseDTO.MessageEnum.CLIENTERROR);
	    		return Response.status(400).entity(error).build();
	    	}
    	}
    	catch(Exception e){
    		swaggertocxf.dto.ApiFailureResponseDTO error = new swaggertocxf.dto.ApiFailureResponseDTO();
    		error.setMessage(swaggertocxf.dto.ApiFailureResponseDTO.MessageEnum.SERVERERROR);
    		return Response.status(500).entity(error).build();
    	}
    	
    	//return Response.ok().entity(new APIFailureResponseDTO()).build();
        //return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, message)).build();
    }
}
