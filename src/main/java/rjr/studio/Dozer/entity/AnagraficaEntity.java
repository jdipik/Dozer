package rjr.studio.Dozer.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "ANAGRAFICA")
public class AnagraficaEntity {

    @Id
    private Long id;
    @Column(name = "NOME", length = 50, nullable = false)
    private String nome;
    @Column(name = "COGNOME", length = 100, nullable = false)
    private String cognome;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "SESSO")
    private TipoSessoEntity sesso;
    @Column(name = "ANNO_NASCITA", length = 3, nullable = false)
    private LocalDate annoNascita;

}
