package com.example.springplayground.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Task {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

}
