package com.renanrest.dao.impl;

import com.renanrest.dao.ProfessorDAO;
import com.renanrest.dao.GenericDAO;
import com.renanrest.model.Professor;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author renan
 */
@ApplicationScoped
public class ProfessorDAOImpl extends GenericDAO<Professor, Long> implements ProfessorDAO {
private static final Logger LOG = LoggerFactory.getLogger(ProfessorDAOImpl.class);
    
public ProfessorDAOImpl() {
        super(Professor.class);
}

    @Override
    public Logger getLogger() {
        return LOG; 
    }
    
}
