package controllers;

import models.Lists;
import play.*;
import play.mvc.*;

public class ListsController extends Application {

	public static Result read() {
		Lists model = new Lists();
		return ok( model.read() );
	}
	
	public static Result create() {
		Lists model = new Lists();
		return ok( model.create() );
	}
}
