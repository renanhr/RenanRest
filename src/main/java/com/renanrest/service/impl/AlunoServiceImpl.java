package com.renanrest.service.Impl;

import com.renanrest.dao.AlunoDAO;
import com.renanrest.dao.DAO;
import com.renanrest.model.Aluno;
import com.renanrest.service.AlunoService;
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
@Path("/Aluno")
public class AlunoServiceImpl extends GenericCRUDRestService<Aluno> implements AlunoService{
          
    private static final Logger LOG = LoggerFactory.getLogger(AlunoService.class);
    
    @Inject
    private AlunoDAO AlunoDAO;

    public AlunoServiceImpl(Class<Aluno> entityClass) {
        super(Aluno.class);
    }

    @Override
    public DAO getDao() {
        return AlunoDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

    @Override
    public GenericEntity listToGenericEntity(List<Aluno> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
