package modelo;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tarefas")
public class Tarefa {
	//A anotação @Id identifica o atributo
	//como chave primaria
	//A anotação @GeneratedValue identifica
	//o atributo como auto increment ou sequence
	@Id
	@GeneratedValue
	private Long id;
	@Column(name="descricao_tarefa", nullable = false)
	private String descricao;
	private boolean finalizado;
	@Temporal(TemporalType.DATE)
	private Calendar dataFinalizado;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isFinalizado() {
		return finalizado;
	}
	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}
	public Calendar getDataFinalizado() {
		return dataFinalizado;
	}
	public void setDataFinalizado(Calendar dataFinalizado) {
		this.dataFinalizado = dataFinalizado;
	}

}
