package com.example.miniprolabyrinthe;

import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import java.util.*;
import com.example.miniprolabyrinthe.Etat;

public class LabyrintheMoteur {
	
	
	private List<Bloc> blocs = null;
	private Balle laBalle = new Balle();
	SensorEventListener mSensorEventListener = new SensorEventListener() {
		
		@Override
		public void onSensorChanged(SensorEvent event) {
			float x = event.values[0];
			float y = event.values[1];
			
			laBalle.setVitesseX(laBalle.getVitesseX()+x);
			laBalle.setVitesseY(laBalle.getVitesseY()+y);
			
			if (laBalle.getVitesseX() > laBalle.MAX_SPEED) {
				laBalle.setVitesseX(laBalle.MAX_SPEED); 
			}
			if (laBalle.getVitesseX() < laBalle.MAX_SPEED) {
				laBalle.setVitesseX(-laBalle.MAX_SPEED); 
			}
			if (laBalle.getVitesseY() > laBalle.MAX_SPEED) {
				laBalle.setVitesseY(laBalle.MAX_SPEED); 
			}
			if (laBalle.getVitesseY() < laBalle.MAX_SPEED) {
				laBalle.setVitesseY(-laBalle.getVitesseY()); 
			}
			
			laBalle.setPosX(laBalle.getPosX()+x);
			laBalle.setPosY(laBalle.getPosY()+y);
		}
		
		@Override
		public void onAccuracyChanged(Sensor sensor, int accuracy) {
			// TODO Auto-generated method stub
			
		}
	};
	
	public List<Bloc> buildLabyrinthe() {
		blocs = new ArrayList<Bloc>();
		blocs.add(new Bloc(Etat.TROU, 0, 0));
		blocs.add(new Bloc(Etat.TROU, 0, 1));
		blocs.add(new Bloc(Etat.TROU, 0, 2));
		blocs.add(new Bloc(Etat.TROU, 0, 3));
		blocs.add(new Bloc(Etat.TROU, 0, 4));
		blocs.add(new Bloc(Etat.TROU, 0, 5));
		blocs.add(new Bloc(Etat.TROU, 0, 6));
		blocs.add(new Bloc(Etat.TROU, 0, 7));
		blocs.add(new Bloc(Etat.TROU, 0, 8));
		blocs.add(new Bloc(Etat.TROU, 0, 9));
		blocs.add(new Bloc(Etat.TROU, 0, 10));
		blocs.add(new Bloc(Etat.TROU, 0, 11));
		blocs.add(new Bloc(Etat.TROU, 0, 12));
		blocs.add(new Bloc(Etat.TROU, 0, 13));

		blocs.add(new Bloc(Etat.TROU, 1, 0));
		blocs.add(new Bloc(Etat.TROU, 1, 13));

		blocs.add(new Bloc(Etat.TROU, 2, 0));
		blocs.add(new Bloc(Etat.TROU, 2, 13));

		blocs.add(new Bloc(Etat.TROU, 3, 0));
		blocs.add(new Bloc(Etat.TROU, 3, 13));

		blocs.add(new Bloc(Etat.TROU, 4, 0));
		blocs.add(new Bloc(Etat.TROU, 4, 1));
		blocs.add(new Bloc(Etat.TROU, 4, 2));
		blocs.add(new Bloc(Etat.TROU, 4, 3));
		blocs.add(new Bloc(Etat.TROU, 4, 4));
		blocs.add(new Bloc(Etat.TROU, 4, 5));
		blocs.add(new Bloc(Etat.TROU, 4, 6));
		blocs.add(new Bloc(Etat.TROU, 4, 7));
		blocs.add(new Bloc(Etat.TROU, 4, 8));
		blocs.add(new Bloc(Etat.TROU, 4, 9));
		blocs.add(new Bloc(Etat.TROU, 4, 10));
		blocs.add(new Bloc(Etat.TROU, 4, 13));

		blocs.add(new Bloc(Etat.TROU, 5, 0));
		blocs.add(new Bloc(Etat.TROU, 5, 13));

		blocs.add(new Bloc(Etat.TROU, 6, 0));
		blocs.add(new Bloc(Etat.TROU, 6, 13));

		blocs.add(new Bloc(Etat.TROU, 7, 0));
		blocs.add(new Bloc(Etat.TROU, 7, 1));
		blocs.add(new Bloc(Etat.TROU, 7, 2));
		blocs.add(new Bloc(Etat.TROU, 7, 5));
		blocs.add(new Bloc(Etat.TROU, 7, 6));
		blocs.add(new Bloc(Etat.TROU, 7, 9));
		blocs.add(new Bloc(Etat.TROU, 7, 10));
		blocs.add(new Bloc(Etat.TROU, 7, 11));
		blocs.add(new Bloc(Etat.TROU, 7, 12));
		blocs.add(new Bloc(Etat.TROU, 7, 13));

		blocs.add(new Bloc(Etat.TROU, 8, 0));
		blocs.add(new Bloc(Etat.TROU, 8, 5));
		blocs.add(new Bloc(Etat.TROU, 8, 9));
		blocs.add(new Bloc(Etat.TROU, 8, 13));

		blocs.add(new Bloc(Etat.TROU, 9, 0));
		blocs.add(new Bloc(Etat.TROU, 9, 5));
		blocs.add(new Bloc(Etat.TROU, 9, 9));
		blocs.add(new Bloc(Etat.TROU, 9, 13));

		blocs.add(new Bloc(Etat.TROU, 10, 0));
		blocs.add(new Bloc(Etat.TROU, 10, 5));
		blocs.add(new Bloc(Etat.TROU, 10, 9));
		blocs.add(new Bloc(Etat.TROU, 10, 13));

		blocs.add(new Bloc(Etat.TROU, 11, 0));
		blocs.add(new Bloc(Etat.TROU, 11, 5));
		blocs.add(new Bloc(Etat.TROU, 11, 9));
		blocs.add(new Bloc(Etat.TROU, 11, 13));

		blocs.add(new Bloc(Etat.TROU, 12, 0));
		blocs.add(new Bloc(Etat.TROU, 12, 1));
		blocs.add(new Bloc(Etat.TROU, 12, 2));
		blocs.add(new Bloc(Etat.TROU, 12, 3));
		blocs.add(new Bloc(Etat.TROU, 12, 4));
		blocs.add(new Bloc(Etat.TROU, 12, 5));
		blocs.add(new Bloc(Etat.TROU, 12, 9));
		blocs.add(new Bloc(Etat.TROU, 12, 8));
		blocs.add(new Bloc(Etat.TROU, 12, 13));

		blocs.add(new Bloc(Etat.TROU, 13, 0));
		blocs.add(new Bloc(Etat.TROU, 13, 8));
		blocs.add(new Bloc(Etat.TROU, 13, 13));

		blocs.add(new Bloc(Etat.TROU, 14, 0));
		blocs.add(new Bloc(Etat.TROU, 14, 8));
		blocs.add(new Bloc(Etat.TROU, 14, 13));

		blocs.add(new Bloc(Etat.TROU, 15, 0));
		blocs.add(new Bloc(Etat.TROU, 15, 8));
		blocs.add(new Bloc(Etat.TROU, 15, 13));

		blocs.add(new Bloc(Etat.TROU, 16, 0));
		blocs.add(new Bloc(Etat.TROU, 16, 4));
		blocs.add(new Bloc(Etat.TROU, 16, 5));
		blocs.add(new Bloc(Etat.TROU, 16, 6));
		blocs.add(new Bloc(Etat.TROU, 16, 7));
		blocs.add(new Bloc(Etat.TROU, 16, 8));
		blocs.add(new Bloc(Etat.TROU, 16, 9));
		blocs.add(new Bloc(Etat.TROU, 16, 13));

		blocs.add(new Bloc(Etat.TROU, 17, 0));
		blocs.add(new Bloc(Etat.TROU, 17, 13));

		blocs.add(new Bloc(Etat.TROU, 18, 0));
		blocs.add(new Bloc(Etat.TROU, 18, 13));

		blocs.add(new Bloc(Etat.TROU, 19, 0));
		blocs.add(new Bloc(Etat.TROU, 19, 1));
		blocs.add(new Bloc(Etat.TROU, 19, 2));
		blocs.add(new Bloc(Etat.TROU, 19, 3));
		blocs.add(new Bloc(Etat.TROU, 19, 4));
		blocs.add(new Bloc(Etat.TROU, 19, 5));
		blocs.add(new Bloc(Etat.TROU, 19, 6));
		blocs.add(new Bloc(Etat.TROU, 19, 7));
		blocs.add(new Bloc(Etat.TROU, 19, 8));
		blocs.add(new Bloc(Etat.TROU, 19, 9));
		blocs.add(new Bloc(Etat.TROU, 19, 10));
		blocs.add(new Bloc(Etat.TROU, 19, 11));
		blocs.add(new Bloc(Etat.TROU, 19, 12));
		blocs.add(new Bloc(Etat.TROU, 19, 13));

		Bloc b = new Bloc(Etat.DEPART, 2, 2);
		laBalle.setInitialRectangle(new RectF(b.getRectangle()));
		blocs.add(b);

		blocs.add(new Bloc(Etat.ARRIVEE, 8, 11));

		return blocs;
	}
	
	
	

}
