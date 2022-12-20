package odilo.recruitment.firmaJuridica.persistence;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CertificadoRepository extends JpaRepository<Certificado, Long> {

    Certificado findByUserId(Long userId);

    List<Certificado> findAll();
}
