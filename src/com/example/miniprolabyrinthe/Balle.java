package com.example.miniprolabyrinthe;

import android.graphics.Color;
import android.graphics.RectF;

public class Balle {
	
	public static final int RAYON = 10;
	// Couleur de la balsse
	private int balleCouleur = Color.GRAY;

	// Je n'initialise pas ma position puisque je l'ignore au démarrage
	private float posX;
	private float posY;

	// La vitesse est nulle au début du jeu
	private float vitesseX;
	private float vitesseY;
	public final float MAX_SPEED = 10.0f;
	private static final float COMPENSATEUR = 8.0f;
	private static final float REBOND = 1.75f;
	
	private RectF rectangle = null;
	private RectF rectangeCollision = null;
	
	
	public float getVitesseX() {
		return this.vitesseX;
	}
	
	public float getVitesseY() {
		return this.vitesseY;
	}
	
	public float getPosX() {
		return this.posX;
	}
	
	public float getPosY() {
		return this.posY;
	}
	
	public void setVitesseX(float uneVitesse) {
		this.vitesseX = uneVitesse;
	}
	
	public void setVitesseY(float uneVitesse) {
		this.vitesseY = uneVitesse;
	}
	
	public void setPosX (float unePosition) {
		this.posX = unePosition;
	}
	
	public void setPosY (float unePosition) {
		this.posY = unePosition;
	}
	
	public void setInitialRectangle(RectF InitialRectangle) {
		this.rectangle = InitialRectangle;
		this.posX = InitialRectangle.left + RAYON;
		this.posY = InitialRectangle.top + RAYON;
	}

}
