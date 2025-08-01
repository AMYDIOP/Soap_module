package com.groupeisi.metier.config;

import com.groupeisi.metier.entity.EtudiantEntity;
import com.groupeisi.metier.entity.FiliereEntity;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	private static final Logger LOG = LoggerFactory.getLogger(HibernateUtil.class);

	private HibernateUtil() {
		// Constructeur privé pour empêcher l'instanciation
	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				PropertiesReader reader = new PropertiesReader("database.properties");

				Configuration configuration = new Configuration();

				Properties settings = new Properties();
				settings.put(AvailableSettings.DRIVER, "com.mysql.cj.jdbc.Driver");

				String url = reader.getProperty("db.urlDev");
				String user = reader.getProperty("db.username");
				String pwd = reader.getProperty("db.password");

				settings.put(AvailableSettings.URL, url);
				settings.put(AvailableSettings.USER, user);
				settings.put(AvailableSettings.PASS, pwd);

				settings.put(AvailableSettings.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
				settings.put(AvailableSettings.HBM2DDL_AUTO, "update");
				settings.put(AvailableSettings.SHOW_SQL, "true");
				settings.put(AvailableSettings.FORMAT_SQL, "true");
				settings.put(AvailableSettings.CURRENT_SESSION_CONTEXT_CLASS, "thread");

				configuration.setProperties(settings);

				// Ajout des entités
				configuration.addAnnotatedClass(EtudiantEntity.class);
				configuration.addAnnotatedClass(FiliereEntity.class);

				ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();

				sessionFactory = configuration.buildSessionFactory(serviceRegistry);

			} catch (Exception e) {
				LOG.error("Erreur lors de la création de la SessionFactory : {}", e.getMessage(), e);
			}
		}
		return sessionFactory;
	}
}
