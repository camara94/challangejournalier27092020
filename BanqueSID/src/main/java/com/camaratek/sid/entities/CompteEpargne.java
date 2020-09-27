package com.camaratek.sid.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue( "CE" )
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompteEpargne extends Compte {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double taux;

}
