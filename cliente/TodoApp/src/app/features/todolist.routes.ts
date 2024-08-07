import { Routes } from '@angular/router';

export const routes: Routes = [
    { path: '', loadComponent: () => import('./todolist/todolist.component').then(m => m.TodolistComponent) }
];
