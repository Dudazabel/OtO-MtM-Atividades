package com.weg.oto_mtm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "documento")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Documento {

    @Id
    @Genera
}
