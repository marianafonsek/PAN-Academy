package crud.controller;

	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	import crud.model.MaintenanceModel;

	import crud.repository.MaintenanceRepository;

	@RestController
	@RequestMapping("/api")
	public class MaintenanceController {

		@Autowired
		private MaintenanceRepository repository;

		@GetMapping("/pegar")
		public List<MaintenanceModel> getAll() {
			return repository.findAll();
		}

		@PostMapping("/inserir")
		public ResponseEntity<MaintenanceModel> criar(@RequestBody MaintenanceModel model) {
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(model));
		}
		

}