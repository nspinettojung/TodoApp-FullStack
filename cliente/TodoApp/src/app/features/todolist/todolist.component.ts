import { Component, inject } from '@angular/core';
import { TaskService } from '../../core/service/task-service.service';
import { Task } from '../../core/interface/task-service';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-todolist',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './todolist.component.html',
  styleUrl: './todolist.component.css'
})
export class TodolistComponent {
  private taskServices = inject(TaskService);

  TaskList: Task[] = [];
  Task: string = '';
  boolean: boolean = true;

  ngOnInit() {
    this.taskServices.getTask().subscribe(T => (this.TaskList = T));
  }

  createTask() {
    this.taskServices.postTask(this.Task).subscribe(T => this.TaskList = T);
  }

  deleteTask(id: number) {
    this.taskServices.deleteTask(id).subscribe(T => this.TaskList = T);
  }


  put() {
    this.boolean = false;
  }

  putTask(id: number, task: string) {
    this.taskServices.updateTask(id, task).subscribe(T => this.TaskList = T);
    this.boolean = true;
  }
}
