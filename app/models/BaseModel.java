package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import play.*;
import play.mvc.*;

public class BaseModel {

	protected String table;
	
	public String read() {
		return "just a test from table: " + this.table;
	}
	
	public String create() {
		return "created record in table: " + this.table + "- not really";
	}
	
}
