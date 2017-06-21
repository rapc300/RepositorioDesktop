package com.example.opengl;



import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

public class MainActivity extends Activity {


	private GLSurfaceView lienzo;  // Creamos un objeto de la clase GLSurfaceView
	  @Override
	   protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      lienzo = new GLSurfaceView(this); // Aquí asignamos un GLSurfaceView
	      lienzo.setRenderer(new MyRenderer(this)); // Aqui usamos un renderizado personalizado.
	      this.setContentView(lienzo); // Aquí establecemos nuestro  GLSurfaceView
	   }
	  
	}