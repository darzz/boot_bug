package bug;

import org.hibernate.SessionFactory;
import org.hibernate.jpa.HibernateEntityManagerFactory;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;

/**
 * Data access configuration.
 */
@Configuration
@EntityScan("bug")
@EnableJpaRepositories("bug")
@EnableTransactionManagement
public class DataConfig {

    @Bean
    public SessionFactory sessionFactory(EntityManagerFactory entityManagerFactory) {
        return ((HibernateEntityManagerFactory) entityManagerFactory).getSessionFactory();
    }
}
