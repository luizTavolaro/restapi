package ps2.restapi;

import javax.persistence.*;

@Entity
@Table(name="aplicativo")

public class Aplicativo {
    @Id @GeneratedValue
    private long id;
    private String nome;
    private String desenvolvedor;
    private int downloads;

    public Aplicativo() {
        super();
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDesenvolvedor() {
        return desenvolvedor;
    }
    public void setDesenvolvedor(String desenvolvedor) {
        this.desenvolvedor = desenvolvedor;
    }
    public int getDownloads() {
        return downloads;
    }
    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

	
    
}
