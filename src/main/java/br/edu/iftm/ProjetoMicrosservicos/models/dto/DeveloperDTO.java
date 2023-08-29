package br.edu.iftm.ProjetoMicrosservicos.models.dto;

import br.edu.iftm.ProjetoMicrosservicos.models.Address;
import br.edu.iftm.ProjetoMicrosservicos.models.Sector;
import lombok.Data;
import org.bson.types.ObjectId;

@Data
public class DeveloperDTO {
    private String id;
    private String name;
    private String lastName;
    private String level;
    private String specialization;
}
