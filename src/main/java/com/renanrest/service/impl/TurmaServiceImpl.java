package com.renanrest.service.Impl;

import com.renanrest.dao.TurmaDAO;
import com.renanrest.dao.DAO;
import com.renanrest.model.Turma;
import com.renanrest.service.TurmaService;
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
@Path("/Turma")
public class TurmaServiceImpl extends GenericCRUDRestService<Turma> implements TurmaService{
          
    private static final Logger LOG = LoggerFactory.getLogger(TurmaService.class);
    
    @Inject
    private TurmaDAO TurmaDAO;

    public TurmaServiceImpl(Class<Turma> entityClass) {
        super(Turma.class);
    }

    @Override
    public DAO getDao() {
        return TurmaDAO;
    }

    @Override
    public Logger getLogger() {
        return LOG;
    }

    @Override
    public GenericEntity listToGenericEntity(List<Turma> list) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
