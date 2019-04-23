package com.maple.persistence.core;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class Persister extends HibernateDaoSupport {

    @Transactional()
    public void save(Object entity) {
        HibernateTemplate hibernateTemplate = getHibernateTemplate();
        hibernateTemplate.setCheckWriteOperations(false);
        hibernateTemplate.saveOrUpdate(entity);
    }

    @Autowired
    public void setBase(SessionFactory sessionFactory) {
        if (getSessionFactory() == null) {
            setSessionFactory(sessionFactory);
        }
    }
}
