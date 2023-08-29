package br.edu.iftm.ProjetoMicrosservicos.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;

@Data
@AllArgsConstructor
public class Developer {
    private ObjectId id;
    private String name;
    private String lastName;
    private String level;
    private String specialization;
    private Sector sector;
    private Address address;


}
