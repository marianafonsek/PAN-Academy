package crud.repository;

import crud.model.MaintenanceModel;

	import org.springframework.data.jpa.repository.JpaRepository;
	
	public interface MaintenanceRepository extends JpaRepository<MaintenanceModel, Long> {

}
