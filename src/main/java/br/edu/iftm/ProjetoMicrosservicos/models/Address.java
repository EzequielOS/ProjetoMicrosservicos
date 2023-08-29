package br.edu.iftm.ProjetoMicrosservicos.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    private String street;
    private Integer number;
    private String city;
    private String country;

}
