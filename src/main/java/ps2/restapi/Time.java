package ps2.restapi;

import javax.persistence.*;

@Entity
@Table(name="times")

public class Time {
    @Id @GeneratedValue
    private long id;

    @Column(name = "anofundacao")
    private int anoFundacao;

    private String nome;
    private String cidade;
    private String estado;

	public Time() {
		super();
	}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAnoFundacao() {
        return anoFundacao;
    }

    public void setAnoFundacao(int anoFundacao) {
        this.anoFundacao = anoFundacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
