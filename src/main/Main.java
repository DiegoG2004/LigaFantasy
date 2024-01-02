package main;
import java.io.IOException;

import classes.*;

public class Main {

	public static void main(String[] args) 
	{
		Aplicacion app = new Aplicacion();
		try {
			app.Menu();
		} 
		catch (IOException e) 
		{			
			e.printStackTrace();
		}
	}
}