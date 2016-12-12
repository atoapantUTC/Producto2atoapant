package controllers;

import java.util.List;

import models.Platose;
import play.mvc.*;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

       public Result index() {
    	   List<Platose> computadoras=Platose.listadoComputadores();
    	   
        return ok(index.render(Platose.listadoComputadores()));
    }

}
