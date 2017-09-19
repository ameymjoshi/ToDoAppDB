package in.amey.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.amey.model.Task;
import in.amey.service.TaskService;

@RestController
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	@RequestMapping("/tasks")
	public List<Task> getTasks(){
		return taskService.getAllTasks();
	}
	
	@RequestMapping("/task/{name}")
	public Task getTask(@PathVariable String name){
		return taskService.getTask(name);
	}

	@RequestMapping(method=RequestMethod.POST, value="/task")
	public void addTask(@RequestBody Task newTask) {		
		taskService.addTask(newTask);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/task/{name}")
	public void updateTask(@RequestBody Task newTask, @PathVariable String name) {
		taskService.updateTask(newTask);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/task/{name}")
	public void deleteTask(@PathVariable String name) {
		taskService.deleteTask(name);
	}
}
