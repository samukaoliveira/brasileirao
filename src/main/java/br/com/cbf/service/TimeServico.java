package br.com.cbf.service;

import br.com.cbf.dto.TimeDTO;
import br.com.cbf.entity.Time;
import br.com.cbf.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TimeServico {

    @Autowired
    private TimeRepository repository;

    public void cadastrarTime(TimeDTO time) {
        Time entity = toEntity(time);
        repository.save(entity);
    }

    private Time toEntity(TimeDTO time) {
        Time entity = new Time();
        entity.setNome(time.getNome());
        entity.setSigla(time.getSigla());
        entity.setUf(time.getUf());
        entity.setEstadio(time.getEstadio());
        return entity;
    }

    private TimeDTO toDto(Time entity) {
        TimeDTO dto = new TimeDTO();
        dto.setNome(entity.getNome());
        dto.setSigla(entity.getSigla());
        dto.setUf(entity.getUf());
        dto.setEstadio(entity.getEstadio());
        return dto;
    }

    public List<TimeDTO> listarTimes(){
        return repository.findAll().stream().map(entity ->
            toDto(entity)).collect(Collectors.toList());
    }



    public Time obterTime(Integer id) {
        return repository.findById(id).get();
    }
}
