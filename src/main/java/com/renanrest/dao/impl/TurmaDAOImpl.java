package com.renanrest.dao.impl;

import com.renanrest.dao.TurmaDAO;
import com.renanrest.dao.GenericDAO;
import com.renanrest.model.Turma;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author renan
 */
@ApplicationScoped
public class TurmaDAOImpl extends GenericDAO<Turma, Long> implements TurmaDAO {
private static final Logger LOG = LoggerFactory.getLogger(AlunoDAOImpl.class);
    
public TurmaDAOImpl() {
        super(Turma.class);
}

    @Override
    public Logger getLogger() {
        return LOG; 
    }
    
}
