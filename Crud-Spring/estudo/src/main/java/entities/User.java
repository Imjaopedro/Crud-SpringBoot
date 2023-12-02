package entities;

// Mapeada pela tabela

import jakarta.persistence.*;

@Entity
@Table(name= "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String email;

    // chave estrangeira
    @ManyToOne
    @JoinColumn(name = "departament_id")
    private Departament deparment;  // associação entre classes

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Departament getDeparment() {
        return deparment;
    }

    public void setDeparment(Departament deparment) {
        this.deparment = deparment;
    }
}
