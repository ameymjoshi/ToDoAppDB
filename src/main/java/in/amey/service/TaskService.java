package in.amey.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.amey.model.Task;
import in.amey.repo.TaskRepo;

@Service
public class TaskService {

	@Autowired
	private TaskRepo taskRepo;
	
	public List<Task> getAllTasks() {
		List<Task> taskList = new ArrayList<>();
		taskRepo.findAll()
				.forEach(taskList::add);
		return taskList;
	}

	public Task getTask(String taskName) {
		return taskRepo.findOne(taskName);
	}

	public void addTask(Task newTask) {
		taskRepo.save(newTask);
	}

	public void updateTask(Task newTask) {
		taskRepo.save(newTask);
	}

	public void deleteTask(String taskName) {
		taskRepo.delete(taskName);
	}

}
