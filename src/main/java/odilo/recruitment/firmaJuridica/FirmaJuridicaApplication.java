package odilo.recruitment.firmaJuridica;

import odilo.recruitment.firmaJuridica.persistence.Certificado;
import odilo.recruitment.firmaJuridica.persistence.CertificadoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication()
public class FirmaJuridicaApplication {


	public static void main(String[] args) {

		SpringApplication.run(FirmaJuridicaApplication.class, args);

	}

	private static final Logger log = LoggerFactory.getLogger(FirmaJuridicaApplication.class);


}
