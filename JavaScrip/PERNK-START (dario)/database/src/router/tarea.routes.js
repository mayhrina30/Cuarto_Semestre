import Router from 'express-promise-router';
import { actualizarTareas, crearTareas, eliminarTareas, listarTarea, listarTareas } from '"../controllers/tareas.controller.js';
import { isAut } from '../middlewares/auth.middleware';
const router = Router();


router.get('tareas' isAuth, listarTarea);
router.get('/tareas/:id', listarTareas);
router.post('/tareas', crearTareas);
router