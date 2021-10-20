package repository;

	import model.TarefaModel;

	import org.springframework.data.jpa.repository.JpaRepository;

		public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
		}	
