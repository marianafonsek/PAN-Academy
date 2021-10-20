package model;

import java.sql.Date;

import java.time.LocalDate;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TarefaModel {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	
	@Column	
	private String tarefa;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar createdAt;
	
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate date;
	
	@Column
	private Date criadoEm;
	
	@PrePersist
	protected void onCreate() {
		criadoEm = new Date();
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getTarefa() {
		return tarefa;
	}

	public void setTarefa(String tarefa) {
		this.tarefa = tarefa;
	}

	public Calendar getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Calendar createdAt) {
		this.createdAt = createdAt;
	}

	public Date getCreated() {
		return criadoEm;
	}

	public void setCreated(Date created) {
		this.criadoEm = created;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}

