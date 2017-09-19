package in.amey.repo;

import org.springframework.data.repository.CrudRepository;

import in.amey.model.Task;

public interface TaskRepo extends CrudRepository<Task, String> {

	
}
