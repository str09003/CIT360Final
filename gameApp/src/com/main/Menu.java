package com.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import com.main.Game.STATE;

public class Menu extends MouseAdapter {
	
	private Game game;
	private Handler handler;
	private HUD hud;
	private Random r = new Random();
	
	public Menu(Game game, Handler handler, HUD hud){
		this.game = game;
		this.hud = hud;
		this.handler = handler;
	}
	
	
	
	public void mousePressed(MouseEvent e){
		int mx = e.getX();
		int my = e.getY();
		
		if(game.gameState == STATE.Menu){
		
		//play button
		if(mouseOver(mx, my, 255, 100, 200, 72)){
			game.gameState = STATE.Game;
			handler.clearEnemys();
			handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player, handler));	
			handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
		}
		
		//help button
		if(mouseOver(mx, my, 255, 200, 200, 72)){
			game.gameState = STATE.Help;
		}
		
		//quit button
		if(mouseOver(mx, my, 255, 300, 200, 72)){
			System.exit(0);
		}
		
		}
		//back button
				if(game.gameState == STATE.Help){
					if(mouseOver(mx, my, 255, 300, 200, 72)){
						game.gameState = STATE.Menu;
					}
					return;
				}
				//Try Again
				if(game.gameState == STATE.End){
					if(mouseOver(mx, my, 260,  350,  200,  64)){
						game.gameState = STATE.Game;
						hud.setLevel(1);
						hud.setScore(0);
						handler.clearEnemys();
						handler.addObject(new Player(Game.WIDTH/2-32, Game.HEIGHT/2-32, ID.Player, handler));	
						handler.addObject(new BasicEnemy(r.nextInt(Game.WIDTH - 50), r.nextInt(Game.HEIGHT - 50), ID.BasicEnemy, handler));	
					}
					return;
				}		
	}
	public void mouseReleased(MouseEvent e){
		
	}
	
	private boolean mouseOver(int mx, int my, int x, int y, int width, int height){
		if(mx > x && mx < x + width){
			if(my > y && my < y + height){
				return true;
			}else return false;
		}else return false;
	}
	
	public void tick(){
		
	}
	
	public void render(Graphics g){
		
		if(game.gameState == STATE.Menu){
		
		Font fnt = new Font("arial", 1, 50);
		Font fnt2 = new Font("arial", 1, 30);
		Font fnt3 = new Font("arial", 1, 20);
		
		g.setFont(fnt);
		g.setColor(Color.white);
		g.drawString("Menu", 290, 75);
		
		g.setFont(fnt2);
		g.setColor(Color.white);
		g.drawString("Play", (325), 145);
		
		g.setFont(fnt2);
		g.setColor(Color.white);
		g.drawString("Help", 325, 245);
		
		g.setFont(fnt2);
		g.setColor(Color.white);
		g.drawString("Quit", 325, 345);
		
		
		g.setColor(Color.white);
		g.drawRect(255, 100, 200, 72);
		
		g.setColor(Color.white);
		g.drawRect(255, 200, 200, 72);
		
		g.setColor(Color.white);
		g.drawRect(255, 300, 200, 72);
		
		
		}else if(game.gameState == STATE.Help){
			
			Font fnt = new Font("arial", 1, 50);
			Font fnt2 = new Font("arial", 1, 30);
			Font fnt3 = new Font("arial", 1, 14);
			
			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("Help", 290, 75);
			
			g.setFont(fnt2);
			g.setColor(Color.white);
			g.drawString("Use W, A, S, D to control the white square", 50, 200);
			
			g.setFont(fnt2);
			g.setColor(Color.white);
			g.drawString("and avoid the bouncing enemies!", 100, 235);
			
			g.setFont(fnt3);
			g.setColor(Color.white);
			g.drawString("visit *website here* to leave your comments and suggestions!", 140, 430);
			
			g.setFont(fnt2);
			g.setColor(Color.white);
			g.drawString("Back", 325, 345);
			
			g.setColor(Color.white);
			g.drawRect(255, 300, 200, 72);
			
		}else if(game.gameState == STATE.End){
			
			Font fnt = new Font("arial", 1, 50);
			Font fnt2 = new Font("arial", 1, 30);
			Font fnt3 = new Font("arial", 1, 20);
			
			g.setFont(fnt);
			g.setColor(Color.white);
			g.drawString("Game Over", 225, 75);
			
			g.setFont(fnt3);
			g.setColor(Color.white);
			g.drawString("You lost with a score of : " + hud.getScore(), 225, 200);
			
			g.setFont(fnt2);
			g.drawString("Try again", 295, 390);
			
			g.drawRect(260,  350,  200,  64);
			
	
		}
		
	}

}
