package com.renanrest.service.Impl;

import com.renanrest.dao.ProfessorDAO;
import com.renanrest.dao.DAO;
import com.renanrest.model.Professor;
import com.renanrest.service.ProfessorService;
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
@Path("/Professor")
public class ProfessorServiceImpl extends GenericCRUDRestService<Professor> implements ProfessorService{
          
    private static final Logger LOG = LoggerFactory.getLogger(ProfessorService.class);
    
    @Inject
    private ProfessorDAO ProfessorDAO;

    public ProfessorServiceImpl(Class<Professor> entityClass) {
        super(Professor.class);
    }

    @Override
    public DAO getDao() {
        return ProfessorDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

    @Override
    public GenericEntity listToGenericEntity(List<Professor> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
