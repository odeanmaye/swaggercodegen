package swaggertocxf.factories;

import swaggertocxf.MoleculeApiService;
import swaggertocxf.impl.MoleculeApiServiceImpl;

public class MoleculeApiServiceFactory {

   private final static MoleculeApiService service = new MoleculeApiServiceImpl();

   public static MoleculeApiService getMoleculeApi()
   {
      return service;
   }
}
