package com.renanrest.dao.impl;

import com.renanrest.dao.MatriculaDAO;
import com.renanrest.dao.GenericDAO;
import com.renanrest.model.Matricula;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author renan
 */
@ApplicationScoped
public class MatriculaDAOImpl extends GenericDAO<Matricula, Long> implements MatriculaDAO {
private static final Logger LOG = LoggerFactory.getLogger(MatriculaDAOImpl.class);
    
public MatriculaDAOImpl() {
        super(Matricula.class);
}

    @Override
    public Logger getLogger() {
        return LOG; 
    }
    
}
