import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Task } from '../interface/task-service';

@Injectable({
  providedIn: 'root'
})
export class TaskService {
  private http = inject(HttpClient);
  

  constructor() { }

  getTask(): Observable<Task[]> {
    return this.http.get<Task[]>(`http://localhost:8080/Todoapp`);
  }

  postTask(task: string): Observable<Task[]> {
    return this.http.post<Task[]>(`http://localhost:8080/Todoapp`, { task: task });
  }

  deleteTask(id: number): Observable<Task[]> {
    return this.http.delete<Task[]>(`http://localhost:8080/Todoapp/${id}`);
  }

  updateTask(id: number, task: string): Observable<Task[]> {
    return this.http.put<Task[]>(`http://localhost:8080/Todoapp/${id}`, { task: task });
  }
}
