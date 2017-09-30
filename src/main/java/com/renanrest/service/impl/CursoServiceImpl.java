package com.renanrest.service.Impl;

import com.renanrest.dao.CursoDAO;
import com.renanrest.dao.DAO;
import com.renanrest.model.Curso;
import com.renanrest.service.CursoService;
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
@Path("/Curso")
public class CursoServiceImpl extends GenericCRUDRestService<Curso> implements CursoService{
          
    private static final Logger LOG = LoggerFactory.getLogger(CursoService.class);
    
    @Inject
    private CursoDAO cursoDAO;

    public CursoServiceImpl(Class<Curso> entityClass) {
        super(Curso.class);
    }

    @Override
    public DAO getDao() {
        return cursoDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

    @Override
    public GenericEntity listToGenericEntity(List<Curso> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
