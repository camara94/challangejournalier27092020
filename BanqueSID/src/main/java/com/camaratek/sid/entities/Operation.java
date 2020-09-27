package com.camaratek.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(length = 1)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Operation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long numOperation;
	protected Date dateOperation;
	private double montant;
	@ManyToOne
	@JoinColumn(name = "CODE_CPTE")
	protected Compte compte;
	@ManyToOne
	@JoinColumn(name = "CODE_EMP")
	protected Employe employe;

}
