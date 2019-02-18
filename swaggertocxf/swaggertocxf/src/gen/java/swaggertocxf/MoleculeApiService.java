package swaggertocxf;

import swaggertocxf.*;
import swaggertocxf.dto.*;

import swaggertocxf.dto.MoleculeDTO;
import swaggertocxf.dto.ApiFailureResponseDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import javax.ws.rs.core.Response;

public abstract class MoleculeApiService {
    public abstract Response classifyMolecule(MoleculeDTO body);
}

