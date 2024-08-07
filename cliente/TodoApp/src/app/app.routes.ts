import { Routes } from '@angular/router';

export const routes: Routes = [
    { path: '', loadChildren: () => import('./features/todolist.routes').then(m => m.routes) }
];
