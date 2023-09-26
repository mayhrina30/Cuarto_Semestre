// src/app/inicio/inicio.component.ts

import { Component } from '@angular/core';
import { Producto } from './producto.modelo'; // Asegúrate de que el nombre del archivo y la ruta sean correctos

@Component({
  selector: 'app-inicio',
  templateUrl: './inicio.component.html',
  styleUrls: ['./inicio.component.css']
})
export class InicioComponent {
  productos: Producto[] = [
    {
      id: 1,
      nombre: 'Base de Maquillaje',
      descripcion: 'Una base de maquillaje de alta calidad',
      precio: 25.99,
      imagen: 'base.jpg'
    },
    {
      id: 2,
      nombre: 'Sombra de Ojos',
      descripcion: 'Paleta de sombras de ojos con varios colores',
      precio: 19.99,
      imagen: 'sombras.jpg'
    },
    // Agrega más productos aquí
  ];
}
