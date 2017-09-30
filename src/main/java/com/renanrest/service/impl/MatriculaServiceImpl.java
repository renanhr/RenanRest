package com.renanrest.service.Impl;

import com.renanrest.dao.MatriculaDAO;
import com.renanrest.dao.DAO;
import com.renanrest.model.Matricula;
import com.renanrest.service.MatriculaService;
import com.renanrest.service.GenericCRUDRestService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.GenericEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author renan
 */
@ManagedBean
@Path("/Matricula")
public class MatriculaServiceImpl extends GenericCRUDRestService<Matricula> implements MatriculaService{
          
    private static final Logger LOG = LoggerFactory.getLogger(MatriculaService.class);
    
    @Inject
    private MatriculaDAO MatriculaDAO;

    public MatriculaServiceImpl(Class<Matricula> entityClass) {
        super(Matricula.class);
    }

    @Override
    public DAO getDao() {
        return MatriculaDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

    @Override
    public GenericEntity listToGenericEntity(List<Matricula> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    
}
