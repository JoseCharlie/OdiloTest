package odilo.recruitment.firmaJuridica.persistence;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;


@Entity
@Getter
@Setter
@Table(name = "certificado")
public class Certificado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "userID")
    private Long userId;
    @Column(name = "certificate")
    private String certificate;

    @Override
    public String toString() {
        return "Certificado{" +
                "id=" + id +
                ", userId=" + userId +
                ", certificate='" + certificate + '\'' +
                '}';
    }
}
