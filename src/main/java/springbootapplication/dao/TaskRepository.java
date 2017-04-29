package springbootapplication.dao;

import org.springframework.data.repository.CrudRepository;

import springbootapplication.model.Task;

public interface TaskRepository extends CrudRepository<Task, Integer>{

}
