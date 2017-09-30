package com.renanrest.dao.impl;

import com.renanrest.dao.CursoDAO;
import com.renanrest.dao.GenericDAO;
import com.renanrest.model.Curso;
import javax.enterprise.context.ApplicationScoped;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author renan
 */
@ApplicationScoped
public class CursoDAOImpl extends GenericDAO<Curso, Long> implements CursoDAO {
    private static final Logger LOG = LoggerFactory.getLogger(CursoDAOImpl.class);

    public CursoDAOImpl() {
        super(Curso.class);
    }

    @Override
    public Logger getLogger() {
     return LOG;   
    }

}