package br.edu.iftm.ProjetoMicrosservicos.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Sector {
    private String name;
    private Integer floor;
}
