package br.com.cbf.rest;

import br.com.cbf.dto.TimeDTO;
import br.com.cbf.entity.Time;
import br.com.cbf.service.TimeServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/times")
public class TimeRestController {

    @Autowired
    private TimeServico timeServico;

    @GetMapping
    public ResponseEntity<List<TimeDTO>> getTimes(){
        return ResponseEntity.ok().body(timeServico.listarTimes());
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Time> getTime(@PathVariable Integer id) {
        return ResponseEntity.ok().body(timeServico.obterTime(id));
    }

    @PostMapping
    public ResponseEntity<Void> cadastrarTime(@RequestBody TimeDTO time){
        timeServico.cadastrarTime(time);
        return ResponseEntity.ok().build();
    }
}
