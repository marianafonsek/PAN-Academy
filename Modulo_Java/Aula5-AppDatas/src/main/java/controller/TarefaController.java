package controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import repository.TarefaRepository;

@RestController
	@RequestMapping(value = "/api")
	public class TarefaController {

	    Calendar c1 = Calendar.getInstance();
	    int hora = c1.get(Calendar.HOUR_OF_DAY);

	    @Autowired
	    private TarefaRepository tarefaRepository;

	    @GetMapping
	    public List<Tarefa> findAll() {
	        return tarefaRepository.findAll();
	    }

	    @GetMapping(value = "/tarefas")
	    public ResponseEntity<List<Tarefa>> getAll() {
	        if (hora > 14 && hora < 17){
	            System.out.println("Entrou, dentro do horário");
	            return ResponseEntity.ok(tarefaRepository.findAll());
	        } else {
	            System.out.println("Fora do horário");
	            return ResponseEntity.noContent().build();
	        }
	    }

	    @PostMapping
	    public ResponseEntity<Tarefa> post (@RequestBody Tarefa tarefinha) {
	        return ResponseEntity.status(HttpStatus.CREATED)
	                .body(tarefaRepository.save(tarefinha));
	    }
	}
