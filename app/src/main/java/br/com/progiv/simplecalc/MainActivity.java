package br.com.progiv.simplecalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int I=0; // indice de numeros para operação
    int Count=0;// quantidade de caracteres de numeros
    int[] Result;// arry dos nomeros digitados
    int Total=0;
    static int INVALID = 9999999;//conntrole de quantidade de digitos

    /**
     * soma;sub;mult;div
     */
    String Operacao; //operação a ser executadas


    TextView RESULTSCREEN;
    Button btn00,btn01,btn02,btn03,btn04,btn05,btn06,btn07,btn08,btn09;
    Button btnSoma, btnSub, btnMulti, btnDiv, btnIgual, btnLimp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Result = new int[2]; //result [0] result [1]
        // link com componentes da tela
        RESULTSCREEN = (TextView) findViewById(R.id.RESULTSCREEN);
        btn00=(Button)findViewById(R.id.button0);
        btn01=(Button)findViewById(R.id.button1);
        btn02=(Button)findViewById(R.id.button2);
        btn03=(Button)findViewById(R.id.button3);
        btn04=(Button)findViewById(R.id.button4);
        btn05=(Button)findViewById(R.id.button5);
        btn06=(Button)findViewById(R.id.button6);
        btn07=(Button)findViewById(R.id.button7);
        btn08=(Button)findViewById(R.id.button8);
        btn09=(Button)findViewById(R.id.button9);

        btnSoma=(Button)findViewById(R.id.buttonsoma);
        btnSub=(Button)findViewById(R.id.buttonsub);
        btnMulti=(Button)findViewById(R.id.buttonmult);
        btnDiv=(Button)findViewById(R.id.buttondiv);
        btnLimp=(Button)findViewById(R.id.buttonLimpar);
        btnIgual=(Button)findViewById(R.id.buttonigual);

        btn00.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Count < 7){
                    Result[I]=(Result[I]*10);//
                    Count++;
                }
                exibirResultado();
                Total=0;
            }
        });

        btn01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Count < 7){
                    Result[I]=(Result[I]*10)+1;//
                    Count++;
                }
                exibirResultado();
                Total=0;
            }
        });

        btn02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Count < 7){
                    Result[I]=(Result[I]*10)+2;//
                    Count++;
                }
                exibirResultado();
                Total=0;
            }
        });

        btn03.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Count < 7){
                    Result[I]=(Result[I]*10)+3;//
                    Count++;
                }
                exibirResultado();
                Total=0;
            }
        });

        btn04.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Count < 7){
                    Result[I]=(Result[I]*10)+4;//
                    Count++;
                }
                exibirResultado();
                Total=0;
            }
        });

        btn05.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Count < 7){
                    Result[I]=(Result[I]*10)+5;//
                    Count++;
                }
                exibirResultado();
                Total=0;
            }
        });

        btn06.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Count < 7){
                    Result[I]=(Result[I]*10)+6;//
                    Count++;
                }
                exibirResultado();
                Total=0;
            }
        });

        btn07.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Count < 7){
                    Result[I]=(Result[I]*10)+7;//
                    Count++;
                }
                exibirResultado();
                Total=0;
            }
        });

        btn08.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Count < 7){
                    Result[I]=(Result[I]*10)+8;//
                    Count++;
                }
                exibirResultado();
                Total=0;
            }
        });

        btn09.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(Count < 7){
                    Result[I]=(Result[I]*10)+9;//
                    Count++;
                }
                exibirResultado();
                Total=0;
            }
        });

        //botoess de açoes

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Operacao="soma";


                calcular();
                //Total = 0;
                Count = 0;
                proximoNumero();
                exibirResultado();



            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Operacao="sub";

                calcular();
                //Total = 0;
                Count = 0;
                proximoNumero();
                exibirResultado();


            }
        });

        btnMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Operacao="mult";
                calcular();
                //Total = 0;
                Count = 0;
                proximoNumero();
                exibirResultado();
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Operacao="div";

                //Total = 0;
                Count = 0;

                proximoNumero();

            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcular();
                exibirResultado();
                //Total = 0;
                Count = 0;

            }
        });

        btnLimp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                limpar();
            }
        });



    }


    //exibição de tela
    private void exibirResultado(){

        if (Total != 0 && Total < INVALID) {
            //se valor total for valido:
            String tela = String.valueOf(Total);
            RESULTSCREEN.setText(tela);


        } else if (Total > INVALID) {
            //se valor total for invalido:
            String tela = "erro";
            RESULTSCREEN.setText(tela);
        } else {
            //se ainda não foi calculado exibir o numeral:
            String tela= String.valueOf(Result[I]);
            RESULTSCREEN.setText(tela);

        }
    }

    //passar arry para proxima posição
    private void proximoNumero(){
        Count=0;
        I=1;
    }


    //limpar tela
    private void limpar(){
        I=0;
        Result[0]=0;
        Result[1]=0;
        Total = 0;
        Count = 0;
        exibirResultado();

    }

    private void calcular(){
       // double valor;
        switch(Operacao){
            case"soma":

                Total = (Result[0] + Result[1]);


                break;
            case"sub":

                Total = (Result[0] - Result[1]);


                break;
            case"mult":

                Total = (Result[0] * Result[1]);


                break;
            case"div":

                Total = (Result[0] / Result[1]);


                break;
        }
        if(Total < INVALID){
            Result[0] = Total;
            Result[1] = 0;
            I = 1;
        }
    }


}