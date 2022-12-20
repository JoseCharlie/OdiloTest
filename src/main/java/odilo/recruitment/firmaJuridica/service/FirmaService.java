package odilo.recruitment.firmaJuridica.service;

import lombok.AllArgsConstructor;
import odilo.recruitment.firmaJuridica.persistence.Certificado;
import odilo.recruitment.firmaJuridica.persistence.CertificadoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@AllArgsConstructor
@Service
public class FirmaService {

    private final CertificadoRepository certificadoRepository;


    public List<Certificado> findAll() {
        return certificadoRepository.findAll();
    }

    public Certificado findByUser(Long userId) {
    return certificadoRepository.findByUserId(userId);
    }

    public void store(MultipartFile file, Long userId) throws IOException {
        Certificado certificate = new Certificado();
        certificate.setUserId(userId);
        certificate.setCertificate(file.toString());
        certificadoRepository.save(certificate);
    }
}
