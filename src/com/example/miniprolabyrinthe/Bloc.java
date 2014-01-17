package com.example.miniprolabyrinthe;

import android.graphics.RectF;

import com.example.miniprolabyrinthe.Etat;

public class Bloc {
	// Un bloc est 2x plus grand qu'une balle
	private float SIZE = Balle.RAYON * 2;
	private RectF rectangle = null;
	
	private float posX;
	private float posY;

	private Etat etat;
	
	public RectF getRectangle() {
		return this.rectangle;
	}
	
	public Bloc(Etat unEtat, float unePosX, float unePosY) {
		this.etat = unEtat;
		this.rectangle = new RectF(posX * SIZE, posY * SIZE, (posX + 1) * SIZE, (posY + 1) * SIZE);
	}
	
	public void setEtat (Etat unEtat) {
		this.etat = unEtat;
	}
	
	public Etat getEtat(){
		return this.etat;
	}


}
