package com.local_church.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table

public class Worshiptime {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable=false)
	private String type;
	@Column(nullable=false)
	private String part;
	@Column
	private String time;
	@Column(nullable=false)
	private String location;
	@Column(nullable=false)
	private String manager;
	
	@ManyToOne
	@JoinColumn(name="churchName", referencedColumnName = "churchName")
	private Info info;
	
}
