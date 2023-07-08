package application;


import java.io.IOException;

import java.util.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javafx.application.Platform;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Circle;

import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;


public class InitialController{
	@FXML
	private Stage stage;
	private Scene scene;
	private Parent root;
	/*public Media media = new Media(getClass().getResource("An-Epic-Story.mp3").toExternalForm());
	public MediaPlayer playerr = new MediaPlayer(media);*/
	/*public Media media_gun = new Media(getClass().getResource("Gaming Gun Sound.mp3").toExternalForm());
	public MediaPlayer player_gun = new MediaPlayer(media_gun);*/
	@FXML
	/*private WebView webView;
	private WebEngine engine;*/
	public Label EasyLabel1;
	public Label EasyLabel2,EasyLabel3,EasyLabel4,rule,EasyLabel5,EasyLabel6,EasyLabel7,EasyLabel8,EasyLabel9,EasyLabel10;
	public void startTolevel(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("levels.fxml"));
		stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void goToduo(ActionEvent event)throws IOException{
		root = FXMLLoader.load(getClass().getResource("duo.fxml"));
		stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void show(KeyEvent event)throws IOException{
		if(event.getCode()==KeyCode.A && is_duo_start) {
			duo1_left();
		}
		if(event.getCode()==KeyCode.D && is_duo_start) {
			duo1_right();
		}
		if(event.getCode()==KeyCode.NUMPAD4 && is_duo_start) {
			duo2_left();
		}
		if(event.getCode()==KeyCode.NUMPAD6 && is_duo_start) {
			duo2_right();
		}
		if(event.getCode()==KeyCode.NUMPAD5 && is_duo_start) {
			duo2_ok();
		}
		if(event.getCode()==KeyCode.S && is_duo_start) {
			duo1_ok();
		}
	}
	public void wow(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("rule.fxml"));
		stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void easy_rule(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("easyrule.fxml"));
		stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void medi_rule(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("medirule.fxml"));
		stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void hard_rule(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("hardrule.fxml"));
		stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void backFromlevel(ActionEvent event)throws IOException{
		root = FXMLLoader.load(getClass().getResource("Initial.fxml"));
		stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void goToeasy(ActionEvent event)throws Exception{
		root = FXMLLoader.load(getClass().getResource("easy.fxml"));
		stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	@FXML
	public Label easyWIN1,zero,five,ten,fifteen,twenty,twentyfive,thirty,thirtyfive,fourty,fourtyfive,fifty,fiftyfive,sixty,sixtyfive,seventy,seventyfive,eighty;
	public static int easy_point=0,duo_point1=0,duo_point2=0;
	public void easyToWin1(ActionEvent event)throws IOException{
		if(easy_point<30)root = FXMLLoader.load(getClass().getResource("easyWin0.fxml"));
		else if(easy_point<45)root = FXMLLoader.load(getClass().getResource("easyWin1.fxml"));
		else if(easy_point<55)root = FXMLLoader.load(getClass().getResource("easyWin2.fxml"));
		else root = FXMLLoader.load(getClass().getResource("easyWin3.fxml"));
		stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		is_easy_start=false;
	}
	public void mediumToWin1(ActionEvent event)throws IOException{
		if(easy_point<25)root = FXMLLoader.load(getClass().getResource("easyWin0.fxml"));
		else if(easy_point<40)root = FXMLLoader.load(getClass().getResource("easyWin1.fxml"));
		else if(easy_point<50)root = FXMLLoader.load(getClass().getResource("easyWin2.fxml"));
		else root = FXMLLoader.load(getClass().getResource("easyWin3.fxml"));
		stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		is_medium_start=false;
	}
	public void hardToWin1(ActionEvent event)throws IOException{
		if(easy_point<20)root = FXMLLoader.load(getClass().getResource("easyWin0.fxml"));
		else if(easy_point<35)root = FXMLLoader.load(getClass().getResource("easyWin1.fxml"));
		else if(easy_point<45)root = FXMLLoader.load(getClass().getResource("easyWin2.fxml"));
		else root = FXMLLoader.load(getClass().getResource("easyWin3.fxml"));
		stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		is_hard_start=false;
	}
	public void duoToWin1 (ActionEvent event)throws IOException{
		if(duo_point1==duo_point2)root = FXMLLoader.load(getClass().getResource("duoDrawn.fxml"));
		if(duo_point1>duo_point2)root = FXMLLoader.load(getClass().getResource("duoLeft.fxml"));
		if(duo_point1<duo_point2)root = FXMLLoader.load(getClass().getResource("duoRight.fxml"));
		stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		is_duo_start=false;
	}
	public void see_score_easy(ActionEvent event)throws IOException{
		Platform.runLater(()->{
			easyWIN1.setVisible(true);
			if(easy_point==0)zero.setVisible(true);if(easy_point==5)five.setVisible(true);
			if(easy_point==10)ten.setVisible(true);if(easy_point==15)fifteen.setVisible(true);
			if(easy_point==20)twenty.setVisible(true);if(easy_point==25)twentyfive.setVisible(true);
			if(easy_point==30)thirty.setVisible(true);if(easy_point==35)thirtyfive.setVisible(true);
			if(easy_point==40)fourty.setVisible(true);if(easy_point==45)fourtyfive.setVisible(true);
			if(easy_point==50)fifty.setVisible(true);if(easy_point==55)fiftyfive.setVisible(true);
			if(easy_point==60)sixty.setVisible(true);if(easy_point==65)sixtyfive.setVisible(true);
			if(easy_point==70)seventy.setVisible(true);if(easy_point==75)seventyfive.setVisible(true);
			if(easy_point==80)eighty.setVisible(true);
		});
	}
	public int Easy_labelID,Easy_labelIA;
	public Label demoLabel,easyWrong,easyCorrect,easyScore,easy_time;
	public Label one1,two2,three3,four4,five5,six6,seven7,eight8,nine9,ten10,sign_man_m,sign_m,sign_m1,sign_man_new,sign_mu,sign_mu1;
	public Label duoscore1,duoscore2,leftdin1,rightdin1,leftdin2,rightdin2,leftdin3,rightdin3,leftdin4,rightdin4,leftdin5,rightdin5,leftdin6,rightdin6,leftdin7,rightdin7,leftdin8,rightdin8,leftdin9,rightdin9,leftdin10,rightdin10;
	public int c=30,tir_sign,man,dir,andu;
	boolean is_easy_start=false,is_medium_start=false,is_hard_start=false,is_duo_start=false;
	public void duo_start(ActionEvent event)throws IOException{
		if(!is_duo_start) {
		is_duo_start=true;
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				Platform.runLater(()->{
					String sc=String.valueOf(duo_point1);
					String sc1=String.valueOf(duo_point2);
					duoscore1.setText("Your score: "+sc+" Time remaining: "+String.valueOf(c));
					duoscore2.setText("Your score: "+sc1+" Time remaining: "+String.valueOf(c));
					c--;
					if(c==-1) {
						timer.cancel();
						is_duo_start=false;
							try {
								duoToWin1(event);
							} catch (Exception e) {
								e.printStackTrace();
							}
					}
				});
				
			}
		};
		timer.scheduleAtFixedRate(task, 0, 1000);
		Platform.runLater(()->{
			
			Random rand = new Random();
			Easy_labelID = rand.nextInt(10)+1;
			if(Easy_labelID==1) {leftdin1.setVisible(true);}
			else if(Easy_labelID==2) {leftdin2.setVisible(true);}
			else if(Easy_labelID==3) {leftdin3.setVisible(true);}
			else if(Easy_labelID==4) {leftdin4.setVisible(true);}
			else if(Easy_labelID==5) {leftdin5.setVisible(true);}
			else if(Easy_labelID==6) {leftdin6.setVisible(true);}
			else if(Easy_labelID==7) {leftdin7.setVisible(true);}
			else if(Easy_labelID==8) {leftdin8.setVisible(true);}
			else if(Easy_labelID==9) {leftdin9.setVisible(true);}
			else if(Easy_labelID==10) {leftdin10.setVisible(true);}
			Random randd = new Random();
			Easy_labelIA = randd.nextInt(10)+1;
			if(Easy_labelIA==1) {rightdin1.setVisible(true);}
			else if(Easy_labelIA==2) {rightdin2.setVisible(true);}
			else if(Easy_labelIA==3) {rightdin3.setVisible(true);}
			else if(Easy_labelIA==4) {rightdin4.setVisible(true);}
			else if(Easy_labelIA==5) {rightdin5.setVisible(true);}
			else if(Easy_labelIA==6) {rightdin6.setVisible(true);}
			else if(Easy_labelIA==7) {rightdin7.setVisible(true);}
			else if(Easy_labelIA==8) {rightdin8.setVisible(true);}
			else if(Easy_labelIA==9) {rightdin9.setVisible(true);}
			else if(Easy_labelIA==10) {rightdin10.setVisible(true);}
		});
		}
	}
	public void duo1_ok()throws IOException{
		Media media_gun = new Media(getClass().getResource("Gaming Gun Sound.mp3").toExternalForm());
		MediaPlayer player_gun = new MediaPlayer(media_gun);
		player_gun.play();
		player_gun.setRate(2.0);
		Platform.runLater(()->{
			//player_gun.stop();
			
			if(Easy_labelID==1) {leftdin1.setVisible(false);}
			else if(Easy_labelID==2) {leftdin2.setVisible(false);}
			else if(Easy_labelID==3) {leftdin3.setVisible(false);}
			else if(Easy_labelID==4) {leftdin4.setVisible(false);}
			else if(Easy_labelID==5) {leftdin5.setVisible(false);}
			else if(Easy_labelID==6) {leftdin6.setVisible(false);}
			else if(Easy_labelID==7) {leftdin7.setVisible(false);}
			else if(Easy_labelID==8) {leftdin8.setVisible(false);}
			else if(Easy_labelID==9) {leftdin9.setVisible(false);}
			else if(Easy_labelID==10) {leftdin10.setVisible(false);}
			if(circle_id1==Easy_labelID) {
				duo_point1+=5;
			}
			Random rand = new Random();
			Easy_labelID = rand.nextInt(10)+1;
			if(Easy_labelID==1) {leftdin1.setVisible(true);}
			else if(Easy_labelID==2) {leftdin2.setVisible(true);}
			else if(Easy_labelID==3) {leftdin3.setVisible(true);}
			else if(Easy_labelID==4) {leftdin4.setVisible(true);}
			else if(Easy_labelID==5) {leftdin5.setVisible(true);}
			else if(Easy_labelID==6) {leftdin6.setVisible(true);}
			else if(Easy_labelID==7) {leftdin7.setVisible(true);}
			else if(Easy_labelID==8) {leftdin8.setVisible(true);}
			else if(Easy_labelID==9) {leftdin9.setVisible(true);}
			else if(Easy_labelID==10) {leftdin10.setVisible(true);}
		});
	}
	public void duo2_ok()throws IOException{
		Media media_gun = new Media(getClass().getResource("Gaming Gun Sound.mp3").toExternalForm());
		MediaPlayer player_gun = new MediaPlayer(media_gun);
		player_gun.play();
		player_gun.setRate(2.0);
		
		Platform.runLater(()->{
			
			
			if(Easy_labelIA==1) {rightdin1.setVisible(false);}
			else if(Easy_labelIA==2) {rightdin2.setVisible(false);}
			else if(Easy_labelIA==3) {rightdin3.setVisible(false);}
			else if(Easy_labelIA==4) {rightdin4.setVisible(false);}
			else if(Easy_labelIA==5) {rightdin5.setVisible(false);}
			else if(Easy_labelIA==6) {rightdin6.setVisible(false);}
			else if(Easy_labelIA==7) {rightdin7.setVisible(false);}
			else if(Easy_labelIA==8) {rightdin8.setVisible(false);}
			else if(Easy_labelIA==9) {rightdin9.setVisible(false);}
			else if(Easy_labelIA==10) {rightdin10.setVisible(false);}
			if(circle_id2==Easy_labelIA) {
				duo_point2+=5;
			}
			Random rand = new Random();
			Easy_labelIA = rand.nextInt(10)+1;
			if(Easy_labelIA==1) {rightdin1.setVisible(true);}
			else if(Easy_labelIA==2) {rightdin2.setVisible(true);}
			else if(Easy_labelIA==3) {rightdin3.setVisible(true);}
			else if(Easy_labelIA==4) {rightdin4.setVisible(true);}
			else if(Easy_labelIA==5) {rightdin5.setVisible(true);}
			else if(Easy_labelIA==6) {rightdin6.setVisible(true);}
			else if(Easy_labelIA==7) {rightdin7.setVisible(true);}
			else if(Easy_labelIA==8) {rightdin8.setVisible(true);}
			else if(Easy_labelIA==9) {rightdin9.setVisible(true);}
			else if(Easy_labelIA==10) {rightdin10.setVisible(true);}
		});
	}

	public void easy_start(ActionEvent event)throws IOException{
		if(!is_easy_start) {
		is_easy_start=true;
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				Platform.runLater(()->{
					String sc=String.valueOf(easy_point);
					easyScore.setText("Your score : "+sc+"  Time remaining: "+String.valueOf(c));
					c--;
					if(c==-1) {
						timer.cancel();
						is_easy_start=false;
							try {
								easyToWin1(event);
							} catch (Exception e) {
								e.printStackTrace();
							}
					}
				});
				
			}
		};
		timer.scheduleAtFixedRate(task, 0, 1000);
		Platform.runLater(()->{
			
			Random rand = new Random();
			Easy_labelID = rand.nextInt(10)+1;
			if(Easy_labelID==1) {one1.setVisible(true);}
			else if(Easy_labelID==2) {two2.setVisible(true);}
			else if(Easy_labelID==3) {three3.setVisible(true);}
			else if(Easy_labelID==4) {four4.setVisible(true);}
			else if(Easy_labelID==5) {five5.setVisible(true);}
			else if(Easy_labelID==6) {six6.setVisible(true);}
			else if(Easy_labelID==7) {seven7.setVisible(true);}
			else if(Easy_labelID==8) {eight8.setVisible(true);}
			else if(Easy_labelID==9) {nine9.setVisible(true);}
			else if(Easy_labelID==10) {ten10.setVisible(true);}
		});
		}
	}
	public void easy_ok(ActionEvent event)throws IOException{
		if(is_easy_start)
		Platform.runLater(()->{
			Media media_gun = new Media(getClass().getResource("Gaming Gun Sound.mp3").toExternalForm());
			MediaPlayer player_gun = new MediaPlayer(media_gun);
			player_gun.play();
			player_gun.setRate(2.0);
			/*player_gun.stop();
			player_gun.setRate(2.0);
			player_gun.play();*/
			if(Easy_labelID==1) {one1.setVisible(false);}
			else if(Easy_labelID==2) {two2.setVisible(false);}
			else if(Easy_labelID==3) {three3.setVisible(false);}
			else if(Easy_labelID==4) {four4.setVisible(false);}
			else if(Easy_labelID==5) {five5.setVisible(false);}
			else if(Easy_labelID==6) {six6.setVisible(false);}
			else if(Easy_labelID==7) {seven7.setVisible(false);}
			else if(Easy_labelID==8) {eight8.setVisible(false);}
			else if(Easy_labelID==9) {nine9.setVisible(false);}
			else if(Easy_labelID==10) {ten10.setVisible(false);}
			if(circle_id==Easy_labelID) {
				easy_point+=5;
				easyWrong.setVisible(false);
				easyCorrect.setVisible(true);
			}
			else {
				easyWrong.setVisible(true);
				easyCorrect.setVisible(false);
			}
			
			Random rand = new Random();
			Easy_labelID = rand.nextInt(10)+1;
			if(Easy_labelID==1) {one1.setVisible(true);}
			else if(Easy_labelID==2) {two2.setVisible(true);}
			else if(Easy_labelID==3) {three3.setVisible(true);}
			else if(Easy_labelID==4) {four4.setVisible(true);}
			else if(Easy_labelID==5) {five5.setVisible(true);}
			else if(Easy_labelID==6) {six6.setVisible(true);}
			else if(Easy_labelID==7) {seven7.setVisible(true);}
			else if(Easy_labelID==8) {eight8.setVisible(true);}
			else if(Easy_labelID==9) {nine9.setVisible(true);}
			else if(Easy_labelID==10) {ten10.setVisible(true);}
		});
	}
	
	public void medium_start(ActionEvent event)throws IOException{
		if(!is_medium_start) {
		is_medium_start=true;
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				Platform.runLater(()->{
					//System.out.println(c);
					String sc=String.valueOf(easy_point);
					easyScore.setText("Your score : "+sc+"  Time remaining: "+String.valueOf(c));
					c--;
					if(c==-1) {
						timer.cancel();
						is_medium_start=false;
							try {
								//System.out.println(easy_point);
								mediumToWin1(event);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}
				});
				
			}
		};
		timer.scheduleAtFixedRate(task, 0, 1000);
		Platform.runLater(()->{
			Random tir = new Random();
			tir_sign = tir.nextInt(2)+1;
			if(tir_sign==1) {
				sign_m.setVisible(true);
				sign_m1.setVisible(false);
				Random rand = new Random();
				Easy_labelID = rand.nextInt(10)+1;
				Random mann = new Random();
				if(Easy_labelID!=10)man = mann.nextInt(10-Easy_labelID);
				else man=0;
				if(Easy_labelID==1) {one1.setVisible(true);}
				else if(Easy_labelID==2) {two2.setVisible(true);}
				else if(Easy_labelID==3) {three3.setVisible(true);}
				else if(Easy_labelID==4) {four4.setVisible(true);}
				else if(Easy_labelID==5) {five5.setVisible(true);}
				else if(Easy_labelID==6) {six6.setVisible(true);}
				else if(Easy_labelID==7) {seven7.setVisible(true);}
				else if(Easy_labelID==8) {eight8.setVisible(true);}
				else if(Easy_labelID==9) {nine9.setVisible(true);}
				else if(Easy_labelID==10) {ten10.setVisible(true);}
					Easy_labelID+=man;
					String uff = String.valueOf(man);
					sign_man_m.setText(uff);sign_man_m.setVisible(true);
			}
			else {
				sign_m1.setVisible(true);
				sign_m.setVisible(false);
				Random rand = new Random();
				Easy_labelID = rand.nextInt(10)+1;
				Random mann = new Random();
				if(Easy_labelID!=1)man = mann.nextInt(Easy_labelID-1);
				else man=0;
				if(Easy_labelID==1) {one1.setVisible(true);}
				else if(Easy_labelID==2) {two2.setVisible(true);}
				else if(Easy_labelID==3) {three3.setVisible(true);}
				else if(Easy_labelID==4) {four4.setVisible(true);}
				else if(Easy_labelID==5) {five5.setVisible(true);}
				else if(Easy_labelID==6) {six6.setVisible(true);}
				else if(Easy_labelID==7) {seven7.setVisible(true);}
				else if(Easy_labelID==8) {eight8.setVisible(true);}
				else if(Easy_labelID==9) {nine9.setVisible(true);}
				else if(Easy_labelID==10) {ten10.setVisible(true);}
					Easy_labelID-=man;
					String uff = String.valueOf(man);
					sign_man_m.setText(uff);sign_man_m.setVisible(true);
			}
		});
		}
	}
	public void medium_ok(ActionEvent event)throws IOException{
		if(is_medium_start)
		Platform.runLater(()->{
			Media media_gun = new Media(getClass().getResource("Gaming Gun Sound.mp3").toExternalForm());
			MediaPlayer player_gun = new MediaPlayer(media_gun);
			player_gun.play();
			player_gun.setRate(2.0);
			/*player_gun.stop();
			player_gun.setRate(2.0);
			player_gun.play();*/
			if(circle_id==Easy_labelID) {
				easy_point+=5;
				easyWrong.setVisible(false);
				easyCorrect.setVisible(true);
			}
			else {
				easyWrong.setVisible(true);
				easyCorrect.setVisible(false);
			}
			if(tir_sign==1&&Easy_labelID!=10) {
				Easy_labelID-=man;
			}
			else if(tir_sign==2&&Easy_labelID!=1) {
				Easy_labelID+=man;
			}
			if(Easy_labelID==1) {one1.setVisible(false);}
			else if(Easy_labelID==2) {two2.setVisible(false);}
			else if(Easy_labelID==3) {three3.setVisible(false);}
			else if(Easy_labelID==4) {four4.setVisible(false);}
			else if(Easy_labelID==5) {five5.setVisible(false);}
			else if(Easy_labelID==6) {six6.setVisible(false);}
			else if(Easy_labelID==7) {seven7.setVisible(false);}
			else if(Easy_labelID==8) {eight8.setVisible(false);}
			else if(Easy_labelID==9) {nine9.setVisible(false);}
			else if(Easy_labelID==10) {ten10.setVisible(false);}
			Random tirr = new Random();
			tir_sign = tirr.nextInt(2)+1;
			if(tir_sign==1) {
				sign_m.setVisible(true);
				sign_m1.setVisible(false);
				Random randd = new Random();
				Easy_labelID = randd.nextInt(10)+1;
				Random mannn = new Random();
				if(Easy_labelID!=10)man = mannn.nextInt(10-Easy_labelID);
				else man=0;
				if(Easy_labelID==1) {one1.setVisible(true);}
				else if(Easy_labelID==2) {two2.setVisible(true);}
				else if(Easy_labelID==3) {three3.setVisible(true);}
				else if(Easy_labelID==4) {four4.setVisible(true);}
				else if(Easy_labelID==5) {five5.setVisible(true);}
				else if(Easy_labelID==6) {six6.setVisible(true);}
				else if(Easy_labelID==7) {seven7.setVisible(true);}
				else if(Easy_labelID==8) {eight8.setVisible(true);}
				else if(Easy_labelID==9) {nine9.setVisible(true);}
				else if(Easy_labelID==10) {ten10.setVisible(true);}
					Easy_labelID+=man;
					String uff = String.valueOf(man);
					sign_man_m.setText(uff);sign_man_m.setVisible(true);
			}
			else {
				sign_m1.setVisible(true);
				sign_m.setVisible(false);
				Random rand = new Random();
				Easy_labelID = rand.nextInt(10)+1;
				Random mann = new Random();
				if(Easy_labelID!=1)man = mann.nextInt(Easy_labelID-1);
				else man=0;
				if(Easy_labelID==1) {one1.setVisible(true);}
				else if(Easy_labelID==2) {two2.setVisible(true);}
				else if(Easy_labelID==3) {three3.setVisible(true);}
				else if(Easy_labelID==4) {four4.setVisible(true);}
				else if(Easy_labelID==5) {five5.setVisible(true);}
				else if(Easy_labelID==6) {six6.setVisible(true);}
				else if(Easy_labelID==7) {seven7.setVisible(true);}
				else if(Easy_labelID==8) {eight8.setVisible(true);}
				else if(Easy_labelID==9) {nine9.setVisible(true);}
				else if(Easy_labelID==10) {ten10.setVisible(true);}
					Easy_labelID-=man;
					String uff = String.valueOf(man);
					sign_man_m.setText(uff);sign_man_m.setVisible(true);
			}
		});
	}
	
	public void hard_start(ActionEvent event)throws IOException{
		if(!is_hard_start) {
		is_hard_start=true;
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				Platform.runLater(()->{
					//System.out.println(c);
					String sc=String.valueOf(easy_point);
					easyScore.setText("Your score : "+sc+"  Time remaining: "+String.valueOf(c));
					c--;
					if(c==-1) {
						timer.cancel();
						is_hard_start=false;
							try {
								//System.out.println(easy_point);
								hardToWin1(event);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}
				});
				
			}
		};
		timer.scheduleAtFixedRate(task, 0, 1000);
		Platform.runLater(()->{
			Random rand = new Random();
			Easy_labelID = rand.nextInt(10)+1;
			andu=Easy_labelID;
			Random direct = new Random();
			dir  = direct.nextInt(10)+1;
			Random tir = new Random();
			tir_sign = tir.nextInt(2)+1;
			if(tir_sign==1) {
				sign_m.setVisible(true);
				sign_m1.setVisible(false);
				Random mann = new Random();
				man = mann.nextInt(10);
				String uff = String.valueOf(man);
				sign_man_m.setText(uff);sign_man_m.setVisible(true);
				andu+=man;
				if(andu>dir) {
					sign_mu1.setVisible(true);
					sign_mu.setVisible(false);
					String uff1 = String.valueOf(andu-dir);
					sign_man_new.setText(uff1);sign_man_new.setVisible(true);
				}
				else {
					sign_mu.setVisible(true);
					sign_mu1.setVisible(false);
					String uff1 = String.valueOf(-andu+dir);
					sign_man_new.setText(uff1);sign_man_new.setVisible(true);
				}
			}
			else {
				sign_m1.setVisible(true);
				sign_m.setVisible(false);
				Random mann = new Random();
				man = mann.nextInt(10);
				String uff = String.valueOf(man);
				sign_man_m.setText(uff);sign_man_m.setVisible(true);
				andu-=man;
				if(andu>dir) {
					sign_mu1.setVisible(true);
					sign_mu.setVisible(false);
					String uff1 = String.valueOf(andu-dir);
					sign_man_new.setText(uff1);sign_man_new.setVisible(true);
				}
				else {
					sign_mu.setVisible(true);
					sign_mu1.setVisible(false);
					String uff1 = String.valueOf(-andu+dir);
					sign_man_new.setText(uff1);sign_man_new.setVisible(true);
				}
			}
			if(Easy_labelID==1) {one1.setVisible(true);}
			else if(Easy_labelID==2) {two2.setVisible(true);}
			else if(Easy_labelID==3) {three3.setVisible(true);}
			else if(Easy_labelID==4) {four4.setVisible(true);}
			else if(Easy_labelID==5) {five5.setVisible(true);}
			else if(Easy_labelID==6) {six6.setVisible(true);}
			else if(Easy_labelID==7) {seven7.setVisible(true);}
			else if(Easy_labelID==8) {eight8.setVisible(true);}
			else if(Easy_labelID==9) {nine9.setVisible(true);}
			else if(Easy_labelID==10) {ten10.setVisible(true);}
		});
		}
	}
	public void hard_ok(ActionEvent event)throws IOException{
		if(is_hard_start)
		Platform.runLater(()->{
			Media media_gun = new Media(getClass().getResource("Gaming Gun Sound.mp3").toExternalForm());
			MediaPlayer player_gun = new MediaPlayer(media_gun);
			player_gun.play();
			player_gun.setRate(2.0);
			/*player_gun.stop();
			player_gun.setRate(2.0);
			player_gun.play();*/
			if(circle_id==dir) {
				easy_point+=5;
				easyWrong.setVisible(false);
				easyCorrect.setVisible(true);
			}
			else {
				easyWrong.setVisible(true);
				easyCorrect.setVisible(false);
			}
			if(Easy_labelID==1) {one1.setVisible(false);}
			else if(Easy_labelID==2) {two2.setVisible(false);}
			else if(Easy_labelID==3) {three3.setVisible(false);}
			else if(Easy_labelID==4) {four4.setVisible(false);}
			else if(Easy_labelID==5) {five5.setVisible(false);}
			else if(Easy_labelID==6) {six6.setVisible(false);}
			else if(Easy_labelID==7) {seven7.setVisible(false);}
			else if(Easy_labelID==8) {eight8.setVisible(false);}
			else if(Easy_labelID==9) {nine9.setVisible(false);}
			else if(Easy_labelID==10) {ten10.setVisible(false);}
			Random rand = new Random();
			Easy_labelID = rand.nextInt(10)+1;
			andu=Easy_labelID;
			Random direct = new Random();
			dir  = direct.nextInt(10)+1;
			Random tir = new Random();
			tir_sign = tir.nextInt(2)+1;
			if(tir_sign==1) {
				sign_m.setVisible(true);
				sign_m1.setVisible(false);
				Random mann = new Random();
				man = mann.nextInt(10);
				String uff = String.valueOf(man);
				sign_man_m.setText(uff);sign_man_m.setVisible(true);
				andu+=man;
				if(andu>dir) {
					sign_mu1.setVisible(true);
					sign_mu.setVisible(false);
					String uff1 = String.valueOf(andu-dir);
					sign_man_new.setText(uff1);sign_man_new.setVisible(true);
				}
				else {
					sign_mu.setVisible(true);
					sign_mu1.setVisible(false);
					String uff1 = String.valueOf(-andu+dir);
					sign_man_new.setText(uff1);sign_man_new.setVisible(true);
				}
			}
			else {
				sign_m1.setVisible(true);
				sign_m.setVisible(false);
				Random mann = new Random();
				man = mann.nextInt(10);
				String uff = String.valueOf(man);
				sign_man_m.setText(uff);sign_man_m.setVisible(true);
				andu-=man;
				if(andu>dir) {
					sign_mu1.setVisible(true);
					sign_mu.setVisible(false);
					String uff1 = String.valueOf(andu-dir);
					sign_man_new.setText(uff1);sign_man_new.setVisible(true);
				}
				else {
					sign_mu.setVisible(true);
					sign_mu1.setVisible(false);
					String uff1 = String.valueOf(-andu+dir);
					sign_man_new.setText(uff1);sign_man_new.setVisible(true);
				}
			}
			if(Easy_labelID==1) {one1.setVisible(true);}
			else if(Easy_labelID==2) {two2.setVisible(true);}
			else if(Easy_labelID==3) {three3.setVisible(true);}
			else if(Easy_labelID==4) {four4.setVisible(true);}
			else if(Easy_labelID==5) {five5.setVisible(true);}
			else if(Easy_labelID==6) {six6.setVisible(true);}
			else if(Easy_labelID==7) {seven7.setVisible(true);}
			else if(Easy_labelID==8) {eight8.setVisible(true);}
			else if(Easy_labelID==9) {nine9.setVisible(true);}
			else if(Easy_labelID==10) {ten10.setVisible(true);}
		});
	}
	
	public void goTomedium(ActionEvent event)throws IOException{
		root = FXMLLoader.load(getClass().getResource("medium.fxml"));
		stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void goTohard(ActionEvent event)throws IOException{
		root = FXMLLoader.load(getClass().getResource("hard.fxml"));
		stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void backTolevel(ActionEvent event)throws IOException{
		if(!(is_hard_start==true||is_easy_start==true||is_medium_start==true||is_duo_start==true)) {
		root = FXMLLoader.load(getClass().getResource("levels.fxml"));
		stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		easy_point=0;
		}
	}
	public void exit(ActionEvent event)throws IOException{
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Exit?");
		alert.setHeaderText("Do you want to exit?");
		alert.setContentText("Enter OK to exit");
		if(alert.showAndWait().get()==ButtonType.OK)
		Platform.exit();
	}

	public Circle circle_obj,circle_duo1,circle_duo2;
	private double x1,x2;
	private int[] circle_x = new int[] {-480,-400,-320,-240,-160,-80,0,80,160,240,320};
	private int[] circle_duo = new int[] {-300,-250,-200,-150,-100,-50,0,50,100,150,200};
	private int circle_id=6,circle_id1=6,circle_id2=6;
	public void easy_right(ActionEvent event)throws IOException{
		if(x1>=320)x1=-480;
		for(int i=0;i<11;i++) {
			if(circle_x[i]==x1+80) {
				circle_id=i;break;
			}
		}
		circle_obj.setCenterX(x1=x1+80);
	}
	public void duo1_right()throws IOException{
		if(x1>=200)x1=-300;
		for(int i=0;i<11;i++) {
			if(circle_duo[i]==x1+50) {
				circle_id1=i;break;
			}
		}
		circle_duo1.setCenterX(x1=x1+50);
	}
	public void duo2_right()throws IOException{
		if(x2>=200)x2=-300;
		for(int i=0;i<11;i++) {
			if(circle_duo[i]==x2+50) {
				circle_id2=i;break;
			}
		}
		circle_duo2.setCenterX(x2=x2+50);
	}
	public void easy_left(ActionEvent event)throws IOException{
		if(x1<=-400)x1=400;
		for(int i=0;i<11;i++) {
			if(circle_x[i]==x1-80) {
				circle_id=i;break;
			}
		}
		circle_obj.setCenterX(x1=x1-80);
	}
	public void duo1_left()throws IOException{
		if(x1<=-250)x1=250;
		for(int i=0;i<11;i++) {
			if(circle_duo[i]==x1-50) {
				circle_id1=i;break;
			}
		}
		circle_duo1.setCenterX(x1=x1-50);
	}
	public void duo2_left()throws IOException{
		if(x2<=-250)x2=250;
		for(int i=0;i<11;i++) {
			if(circle_duo[i]==x2-50) {
				circle_id2=i;break;
			}
		}
		circle_duo2.setCenterX(x2=x2-50);
	}
}
