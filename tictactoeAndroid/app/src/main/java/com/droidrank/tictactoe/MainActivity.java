package com.droidrank.tictactoe;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{



    Button block1, block2, block3, block4, block5, block6, block7, block8, block9, restart;
    TextView result;


    String player = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player=getResources().getString(R.string.player_2_move);

        block1 = (Button) findViewById(R.id.bt_block1);
        block2 = (Button) findViewById(R.id.bt_block2);
        block3 = (Button) findViewById(R.id.bt_block3);
        block4 = (Button) findViewById(R.id.bt_block4);
        block5 = (Button) findViewById(R.id.bt_block5);
        block6 = (Button) findViewById(R.id.bt_block6);
        block7 = (Button) findViewById(R.id.bt_block7);
        block8 = (Button) findViewById(R.id.bt_block8);
        block9 = (Button) findViewById(R.id.bt_block9);
        result = (TextView) findViewById(R.id.tv_show_result);
        restart = (Button) findViewById(R.id.bt_restart_game);



        block1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player.equals(getResources().getString(R.string.player_1_move))){
                    player=getResources().getString(R.string.player_2_move);
                }else{
                    player=getResources().getString(R.string.player_1_move);
                }

                block1.setText(player);
                restart.setText("Restart Game");
            }
        });

        block2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player.equals(getResources().getString(R.string.player_1_move))){
                    player=getResources().getString(R.string.player_2_move);
                }else{
                    player=getResources().getString(R.string.player_1_move);
                }

                block2.setText(player);
                restart.setText("Restart Game");
            }
        });
        block3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player.equals(getResources().getString(R.string.player_1_move))){
                    player=getResources().getString(R.string.player_2_move);
                }else{
                    player=getResources().getString(R.string.player_1_move);
                }
                block3.setText(player);
                restart.setText("Restart Game");
            }
        });
        block4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player.equals(getResources().getString(R.string.player_1_move))){
                    player=getResources().getString(R.string.player_2_move);
                }else{
                    player=getResources().getString(R.string.player_1_move);
                }

                block4.setText(player);
                restart.setText("Restart Game");
            }
        });
        block5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player.equals(getResources().getString(R.string.player_1_move))){
                    player=getResources().getString(R.string.player_2_move);
                }else{
                    player=getResources().getString(R.string.player_1_move);
                }

                block5.setText(player);
                restart.setText("Restart Game");
            }
        });
        block6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player.equals(getResources().getString(R.string.player_1_move))){
                    player=getResources().getString(R.string.player_2_move);
                }else{
                    player=getResources().getString(R.string.player_1_move);
                }

                block6.setText(player);
                restart.setText("Restart Game");
            }
        });
        block7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player.equals(getResources().getString(R.string.player_1_move))){
                    player=getResources().getString(R.string.player_2_move);
                }else{
                    player=getResources().getString(R.string.player_1_move);
                }

                block7.setText(player);
                restart.setText("Restart Game");
            }
        });
        block8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player.equals(getResources().getString(R.string.player_1_move))){
                    player=getResources().getString(R.string.player_2_move);
                }else{
                    player=getResources().getString(R.string.player_1_move);
                }

                block8.setText(player);
                restart.setText("Restart Game");
            }
        });
        block9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player.equals(getResources().getString(R.string.player_1_move))){
                    player=getResources().getString(R.string.player_2_move);
                }else{
                    player=getResources().getString(R.string.player_1_move);
                }

                block9.setText(player);
                restart.setText("Restart Game");
            }
        });

        /**
         * Restarts the game
         */
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
                String mess = getResources().getString(R.string.restart_message);
                builder.setTitle("Confirm");
                builder.setMessage(mess);

                builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog
                        block1.setText("");
                        block2.setText("");
                        block3.setText("");
                        block4.setText("");
                        block5.setText("");
                        block6.setText("");
                        block7.setText("");
                        block8.setText("");
                        block9.setText("");
                        dialog.dismiss();
                    }
                });

                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        // Do nothing
                        dialog.dismiss();
                    }
                });

                AlertDialog alert = builder.create();
                alert.show();






            }
        });

    }

}
