package com.surajsau.chidiyaudd;

import java.util.Random;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.surajsau.chidiyaudd.objects.QuestionImage;

public class SettingsMode extends Activity{
	
	boolean sound1;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		SharedPreferences pref = this.getSharedPreferences("myPrefKey", Context.MODE_PRIVATE);
		Editor editor = pref.edit();
		editor.putBoolean("sound",false);//put variable name
		editor.commit();
		
		}
	

}
