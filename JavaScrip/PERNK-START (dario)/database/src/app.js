
import express from "express";
import morgan from "morgan";
import tareasRouters from "./router/tareas.routes.js"
import autRoutes from "./router/auth.routes.js"
import cookieParser from "cookie-parser";

const app = express();
app.use(expres.json());
app.use(cookieParser());
app.use(express.urlencoded({extended: false}));
app.use(morgan("dev"));




app.get("/", ( req,res) => res.json({ message: "bienvenidos "}))

app.use('api', tareasRouters);
app.use('/api', autRoutes)

//manejo de errores
app.use(err, req, res, next) => {
    res.status(500).json({
        status: "error",
        message: err.message

        

    });
    
}

export default app;