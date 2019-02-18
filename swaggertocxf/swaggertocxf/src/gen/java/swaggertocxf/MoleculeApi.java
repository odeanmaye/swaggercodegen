package swaggertocxf;

import swaggertocxf.dto.*;
import swaggertocxf.MoleculeApiService;
import swaggertocxf.factories.MoleculeApiServiceFactory;

import io.swagger.annotations.ApiParam;

import swaggertocxf.dto.MoleculeDTO;
import swaggertocxf.dto.ApiFailureResponseDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import javax.ws.rs.core.Response;
import javax.ws.rs.*;

@Path("/molecule")


@io.swagger.annotations.Api(value = "/molecule", description = "the molecule API")
public class MoleculeApi  {

   private final MoleculeApiService delegate = MoleculeApiServiceFactory.getMoleculeApi();

    @POST
    @Path("/classify")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Classify a molecule", notes = "", response = MoleculeDTO.class)
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Client Error"),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Server Error") })

    public Response classifyMolecule(@ApiParam(value = "Molecule object to be classified" ,required=true ) MoleculeDTO body)
    {
    	System.out.println("in post");
    return delegate.classifyMolecule(body);
    }
}

