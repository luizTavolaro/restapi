package ps2.restapi;

import javax.persistence.*;

@Entity
@Table(name="produtos_time")

public class Produto {
    @Id @GeneratedValue
    private long id;
    private String descricao;
    private String marca;
    private double valor;
    @ManyToOne
    @JoinColumn(name = "time_id", nullable = false)
    private Time time;

    public Produto() {
		super();
	}

    public long getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }

    
}
