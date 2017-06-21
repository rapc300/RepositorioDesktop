package com.example.opengl;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.content.Context;
import android.opengl.GLSurfaceView.Renderer;

public class MyRenderer implements Renderer{

	   
		private Context context;
		private CuboTextura cubo;
	   private static float angleCube = 0;
	   private static float speedCube = -1.5f;    
	   

	   public MyRenderer(Context context) {
		   this.context = context;
	      cubo = new CuboTextura();
	   }
	  
	   
	   @Override
	   public void onSurfaceCreated(GL10 gl, EGLConfig config) {
		      cubo.loadTexture(gl, context);
		      gl.glEnable(GL10.GL_TEXTURE_2D);
	   }
	   
	   
	   @Override
	   public void onSurfaceChanged(GL10 gl, int width, int height) {
		  
	   }
	  
	
	   @Override
	   public void onDrawFrame(GL10 gl) {
	      gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
	      
	      
	      gl.glLoadIdentity(); 
	      gl.glTranslatef(0.0f, 0.0f, 0.0f);
	      gl.glRotatef(angleCube, 0.1f, 1.0f, 0.2f); 
	      cubo.dibujar(gl); 
	      
	      angleCube += speedCube;   
	      
	   }
}
