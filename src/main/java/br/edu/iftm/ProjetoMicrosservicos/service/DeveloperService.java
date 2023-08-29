package br.edu.iftm.ProjetoMicrosservicos.service;

import br.edu.iftm.ProjetoMicrosservicos.repositories.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeveloperService {
    @Autowired
    private DeveloperRepository developerRepository;


}
