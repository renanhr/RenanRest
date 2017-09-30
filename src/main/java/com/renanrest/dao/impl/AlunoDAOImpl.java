package com.renanrest.dao.impl;

import com.renanrest.dao.AlunoDAO;
import com.renanrest.dao.GenericDAO;
import com.renanrest.model.Aluno;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author renan
 */
@ApplicationScoped
public class AlunoDAOImpl extends GenericDAO<Aluno, Long> implements AlunoDAO {
private static final Logger LOG = LoggerFactory.getLogger(AlunoDAOImpl.class);
    
public AlunoDAOImpl() {
        super(Aluno.class);
}

    @Override
    public Logger getLogger() {
        return LOG; 
    }
    
}
