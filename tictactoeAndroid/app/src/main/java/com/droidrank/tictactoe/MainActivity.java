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
    String p1,p2;

    private int clicks = 0;
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
        p1 = getResources().getString(R.string.player_1_move);
        p2 = getResources().getString(R.string.player_2_move);

        block1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(player.equals(getResources().getString(R.string.player_1_move))){
                    player=getResources().getString(R.string.player_2_move);
                }else{
                    player=getResources().getString(R.string.player_1_move);
                }

                block1.setText(player);
                block1.setEnabled(false);
                String ganha = findWinner();
                if(!ganha.equals("")){

                    result.setText("Jogador "+ganha+" Ganhou");
                }
            //    restart.setText("Restart Game");

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
                block2.setEnabled(false);
                String ganha = findWinner();
                if(!ganha.equals("")){
                    result.setText("Jogador "+ganha+" Ganhou");
                }
            //    restart.setText("Restart Game");

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
                block3.setEnabled(false);
                String ganha = findWinner();
                if(!ganha.equals("")){
                    result.setText("Jogador "+ganha+" Ganhou");
                }
            //    restart.setText("Restart Game");
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
                block4.setEnabled(false);
                String ganha = findWinner();
                if(!ganha.equals("")){
                    result.setText("Jogador "+ganha+" Ganhou");
                }
            //    restart.setText("Restart Game");
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
                block5.setEnabled(false);
                String ganha = findWinner();
                if(!ganha.equals("")){
                    result.setText("Jogador "+ganha+" Ganhou");
                }
            //    restart.setText("Restart Game");
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
                block6.setEnabled(false);
                String ganha = findWinner();
                if(!ganha.equals("")){
                    result.setText("Jogador "+ganha+" Ganhou");
                }
              //  restart.setText("Restart Game");
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
                block7.setEnabled(false);
                String ganha = findWinner();
                if(!ganha.equals("")){
                    result.setText("Jogador "+ganha+" Ganhou");
                }
               // restart.setText("Restart Game");
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
                block8.setEnabled(false);
                String ganha = findWinner();
                if(!ganha.equals("")){
                    result.setText("Jogador "+ganha+" Ganhou");
                }
               // restart.setText("Restart Game");
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
                block9.setEnabled(false);
                String ganha = findWinner();
                if(!ganha.equals("")){
                    result.setText("Jogador "+ganha+" Ganhou");
                }
               // restart.setText("Restart Game");
            }
        });

        /**
         * Restarts the game
         */
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
/*                AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
                String mess = getResources().getString(R.string.restart_message);
                builder.setTitle("Confirm");
                builder.setMessage(mess);

                builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {
                        // Do nothing but close the dialog

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
                alert.show();*/


                block1.setText("");
                block2.setText("");
                block3.setText("");
                block4.setText("");
                block5.setText("");
                block6.setText("");
                block7.setText("");
                block8.setText("");
                block9.setText("");
                block1.setEnabled(true);
                block2.setEnabled(true);
                block3.setEnabled(true);
                block4.setEnabled(true);
                block5.setEnabled(true);
                block6.setEnabled(true);
                block7.setEnabled(true);
                block8.setEnabled(true);
                block9.setEnabled(true);
                clicks = 0;
                result.setText("");
                restart.setText(getResources().getString(R.string.restart_button_text_initially));

            }
        });



    }
    public String findWinner(){
        clicks++;
        String winner = "";

        String b1 = block1.getText().toString().trim();
        String b2 = block2.getText().toString().trim();
        String b3 = block3.getText().toString().trim();
        String b4 = block4.getText().toString().trim();
        String b5 = block5.getText().toString().trim();
        String b6 = block6.getText().toString().trim();
        String b7 = block7.getText().toString().trim();
        String b8 = block8.getText().toString().trim();
        String b9 = block9.getText().toString().trim();
        if(clicks == 1){

        restart.setText("Restart Game");
        }else if(clicks  == 5){
        if(b1.equals(b2) && b1.equals(b3)){
            if(b1.equals("X")){
                winner = "X";
            }else if(b1.equals("O")){
                winner = "O";
            }else{

            }

        }else if(b4.equals(b5) && b4.equals(b6)){
            if(b4.equals("X")){
                winner = "X";
            }else if(b4.equals("O")){
                winner = "O";
            }else{

            }
        }else if(b7.equals(b8) && b7.equals(b9)){
            if(b7.equals("X")){
                winner = "X";
            }else if(b7.equals("O")){
                winner = "O";
            }else{

            }
        }else if(b1.equals(b4) && b1.equals(b7)){
            if(b1.equals("X")){
                winner = "X";
            }else if(b1.equals("O")){
                winner = "O";
            }else{

            }
        }else if(b2.equals(b5) && b2.equals(b8)){
            if(b2.equals("X")){
                winner = "X";
            }else if(b2.equals("O")){
                winner = "O";
            }else{

            }
        }else if(b3.equals(b6) && b6.equals(b9)){
            if(b3.equals("X")){
                winner = "X";
            }else if(b3.equals("O")){
                winner = "O";
            }else{

            }
        }else if(b1.equals(b5) && b1.equals(b9)){
            if(b1.equals("X")){
                winner = "X";
            }else if(b1.equals("O")){
                winner = "O";
            }else{

            }
        }else if(b7.equals(b5) && b7.equals(b3)){
            if(b7.equals("X")){
                winner = "X";
            }else if(b7.equals("O")){
                winner = "O";
            }else{

            }
        }else{
            winner = "Tie";
        }
        }
        Toast.makeText(getApplicationContext(),winner,Toast.LENGTH_LONG);

        return winner;
    }
}
