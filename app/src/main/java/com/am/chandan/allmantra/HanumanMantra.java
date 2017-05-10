package com.am.chandan.allmantra;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import java.io.IOException;

/**
 * Copyright @ MaxximoTech, created by Nisheeth Gunjan.
 */

public class HanumanMantra extends AppCompatActivity implements MediaPlayer.OnPreparedListener {
    static ImageButton playButton;
    static ImageButton pauseButton;
    static ImageButton stopButton;
    static Button repeatButton;
    static Button repeatButton1;
    static Button repeatButton2;
    static Button repeatButton3;

    static SeekBar seekBar;
    static RelativeLayout container;
    static ImageView flower;
    static ImageView flower1;
    static ImageView flower2;
    static ImageView flower3;
    static ImageView flower4;
    static ImageView flower5;
    static ImageView flower6;
    private EditText yourEditText;

    private static MediaPlayer player;
    static Handler handler;
    static Uri audio;
    static boolean canMakeCall = false;
    boolean flag = false;
    boolean flag1 = false;
    boolean  flag3=true;

    int count=1;
    int maxCount=1;
    int finalValue=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hanumanmantra);
        TextView tv = (TextView) findViewById(R.id.textView);

        tv.setMovementMethod(new ScrollingMovementMethod());

        playButton = (ImageButton) findViewById(R.id.btn1);
        pauseButton = (ImageButton) findViewById(R.id.btn2);
        stopButton = (ImageButton) findViewById(R.id.btn3);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        repeatButton= (Button) findViewById(R.id.btn4);
        repeatButton1= (Button) findViewById(R.id.btn5);
        repeatButton2= (Button) findViewById(R.id.btn6);
        repeatButton3= (Button) findViewById(R.id.btn7);
        container= (RelativeLayout) findViewById(R.id.mantra1);
        flower= (ImageView) findViewById(R.id.flower);
        flower1= (ImageView) findViewById(R.id.flower1);
        flower2= (ImageView) findViewById(R.id.flower2);
        flower3= (ImageView) findViewById(R.id.flower3);
        flower4= (ImageView) findViewById(R.id.flower4);
        flower5= (ImageView) findViewById(R.id.flower5);
        flower6= (ImageView) findViewById(R.id.flower6);

        TranslateAnimation tAnimation = new TranslateAnimation(-50, 150, 0,2100);

        tAnimation.setDuration(2000);
        tAnimation.setRepeatCount(Animation.INFINITE);
        tAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        tAnimation.setFillAfter(true);
        tAnimation.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // TODO Auto-generated method stub
                flower.setVisibility(View.GONE);



            }
        });

        flower.startAnimation(tAnimation);
        TranslateAnimation tAnimation1 = new TranslateAnimation(0, 30, 0,2100);

        tAnimation1.setDuration(2070);
        tAnimation1.setRepeatCount(Animation.INFINITE);
        tAnimation1.setInterpolator(new AccelerateDecelerateInterpolator());
        tAnimation1.setFillAfter(true);
        tAnimation1.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // TODO Auto-generated method stub

                flower1.setVisibility(View.GONE);


            }
        });
        flower1.startAnimation(tAnimation1);
        TranslateAnimation tAnimation2 = new TranslateAnimation(0, 210, 0,2100);

        tAnimation2.setDuration(2900);
        tAnimation2.setRepeatCount(Animation.INFINITE);
        tAnimation2.setInterpolator(new AccelerateDecelerateInterpolator());
        tAnimation2.setFillAfter(true);
        tAnimation2.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // TODO Auto-generated method stub

                flower2.setVisibility(View.GONE);



            }
        });
        flower2.startAnimation(tAnimation2);
        TranslateAnimation tAnimation3 = new TranslateAnimation(0, 400, 0,2100);

        tAnimation3.setDuration(2000);
        tAnimation3.setRepeatCount(Animation.INFINITE);
        tAnimation3.setInterpolator(new AccelerateDecelerateInterpolator());
        tAnimation3.setFillAfter(true);
        tAnimation3.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // TODO Auto-generated method stub

                flower3.setVisibility(View.GONE);



            }
        });
        flower3.startAnimation(tAnimation3);
        TranslateAnimation tAnimation4 = new TranslateAnimation(0, 500, 0,2100);

        tAnimation4.setDuration(2700);
        tAnimation4.setRepeatCount(Animation.INFINITE);
        tAnimation4.setInterpolator(new AccelerateDecelerateInterpolator());
        tAnimation4.setFillAfter(true);
        tAnimation4.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // TODO Auto-generated method stub

                flower4.setVisibility(View.GONE);



            }
        });
        flower4.startAnimation(tAnimation4);
        TranslateAnimation tAnimation5 = new TranslateAnimation(0, 300, 0,2100);

        tAnimation5.setDuration(2400);
        tAnimation5.setRepeatCount(Animation.INFINITE);
        tAnimation5.setInterpolator(new AccelerateDecelerateInterpolator());
        tAnimation5.setFillAfter(true);
        tAnimation5.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // TODO Auto-generated method stub

                flower5.setVisibility(View.GONE);



            }
        });
        flower5.startAnimation(tAnimation5);
        TranslateAnimation tAnimation6 = new TranslateAnimation(0, 90, 0,2100);

        tAnimation6.setDuration(2200);
        tAnimation6.setRepeatCount(Animation.INFINITE);
        tAnimation6.setInterpolator(new AccelerateDecelerateInterpolator());
        tAnimation6.setFillAfter(true);
        tAnimation6.setAnimationListener(new Animation.AnimationListener() {

            @Override
            public void onAnimationStart(Animation animation) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationRepeat(Animation animation) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // TODO Auto-generated method stub

                flower6.setVisibility(View.GONE);


            }
        });
        flower6.startAnimation(tAnimation6);




        player = MediaPlayer.create(HanumanMantra.this, R.raw.hanuman);
        seekBar.setMax(0);
        seekBar.setMax(player.getDuration());
        yourEditText = (EditText) findViewById(R.id.textView16);
        yourEditText.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {


                try {
                    String value = yourEditText.getText().toString();
                    finalValue = new Integer(value).intValue();
                } catch (NumberFormatException e) {
                    finalValue = 1;
                }



                count = 1;
                maxCount = finalValue;

                TextView tr = (TextView) findViewById(R.id.textView1);
                tr.setText(" ");
                flag3 = true;
                yourEditText.setEnabled(true);

                repeatButton1.setEnabled(false);
                repeatButton.setEnabled(false);
                repeatButton2.setEnabled(false);
                repeatButton3.setEnabled(false);

                seekBar.setMax(player.getDuration());
            }
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            public void onTextChanged(CharSequence s, int start, int before, int count) {}
        });



        if (canMakeCall = true) {
            player.setOnPreparedListener(this);

            handler = new Handler();

            seekBar.setMax(player.getDuration());

            playButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (!player.isPlaying()) {
                        player.start();

                        updateSeekBar();
                    }

                }
            });
            repeatButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {

                    count=1;
                    maxCount=11;
                    TextView tr= (TextView)findViewById(R.id.textView1);
                    tr.setText(" ");
                    flag3=true;
                    yourEditText.setEnabled(false);

                    repeatButton1.setEnabled(false);
                    repeatButton.setEnabled(false);
                    repeatButton2.setEnabled(false);
                    repeatButton3.setEnabled(false);



                    seekBar.setMax(player.getDuration());


                }

            });
            repeatButton1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    count=1;
                    maxCount=21;
                    TextView tr= (TextView)findViewById(R.id.textView1);
                    tr.setText(" ");
                    flag3=true;
                    yourEditText.setEnabled(false);
                    repeatButton.setEnabled(false);

                    repeatButton1.setEnabled(false);
                    repeatButton2.setEnabled(false);
                    repeatButton3.setEnabled(false);



                    seekBar.setMax(player.getDuration());


                }

            });
            repeatButton2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    count=1;
                    maxCount=51;
                    TextView tr= (TextView)findViewById(R.id.textView1);
                    tr.setText(" ");
                    flag3=true;
                    yourEditText.setEnabled(false);
                    repeatButton.setEnabled(false);
                    repeatButton1.setEnabled(false);

                    repeatButton3.setEnabled(false);
                    repeatButton2.setEnabled(false);


                    seekBar.setMax(player.getDuration());


                }

            });
            repeatButton3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {

                    count=1;
                    maxCount=108;
                    TextView tr= (TextView)findViewById(R.id.textView1);
                    tr.setText(" ");
                    flag3=true;
                    yourEditText.setEnabled(false);
                    repeatButton.setEnabled(false);
                    repeatButton1.setEnabled(false);
                    repeatButton2.setEnabled(false);
                    repeatButton3.setEnabled(false);



                    seekBar.setMax(player.getDuration());



                }

            });



            pauseButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {

                    if (player.isPlaying()) {
                        flag1=true;
                        player.pause();

                    }

                }
            });

            stopButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (player.isPlaying()) {
                        player.stop();


                        seekBar.setProgress(0);

                        seekBar.invalidate();
                        yourEditText.setText("");
                        yourEditText.setEnabled(true);
                        count=1;
                        TextView tr= (TextView)findViewById(R.id.textView1);
                        tr.setText(" ");
                        repeatButton.setEnabled(true);
                        repeatButton1.setEnabled(true);
                        repeatButton2.setEnabled(true);
                        repeatButton3.setEnabled(true);


                        try {
                            player.prepare();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        flag1=false;
                        seekBar.setProgress(0);

                    }
                }
            });

            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                    if (b) {

                        seekChanged(seekBar, i, b);

                    }
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {


                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });

            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mediaPlayer) {
                    if(count<maxCount)
                    {
                        TextView tr= (TextView)findViewById(R.id.textView1);
                        tr.setText(" "+count);
                        count++;
                        seekBar.setProgress(0);
                        player.seekTo(0);
                        player.start();
                    }
                    else {
                        TextView tr= (TextView)findViewById(R.id.textView1);
                        tr.setText(" "+count);
                        flag3=false;
                        //player.release();
                        seekBar.setProgress(0);
                        //player.prepareAsync();
                        seekBar.invalidate();
                        yourEditText.setText("");
                        yourEditText.setEnabled(true);

                        repeatButton.setEnabled(true);

                        repeatButton2.setEnabled(true);
                        repeatButton1.setEnabled(true);
                        repeatButton3.setEnabled(true);

                    }
                    //player.stop();

                }
            });
        }
    }


    @Override
    public void onPrepared(MediaPlayer mediaPlayer) {
        playButton.setEnabled(true);
        canMakeCall = true;
    }

    public void seekChanged(SeekBar seekBar, int progress, boolean fromUser) {

        player.seekTo(progress);

    }

    public void updateSeekBar() {

        if(!flag) {
            if(flag3) {
                seekBar.setProgress(player.getCurrentPosition());
                if (!(player.isPlaying()) && !flag1) {
                    seekBar.setProgress(0);

                }
                if (player.isPlaying()) {
                    Runnable notification = new Runnable() {
                        public void run() {

                            updateSeekBar();
                        }
                    };
                    handler.postDelayed(notification, 1500);
                }
            }
        }
    }







    @Override
    public void onBackPressed(){
        quit();
    }

    public void quit(){
        quitDialog();
    }

    private void quitDialog() {

        flag=true;
        player.release();
        finish();

    }




}


