package com.df.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnCero, btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho,
                   btnNueve, btnSumar, btnRestar, btnMultiplicar, btnDividir, btnIgual, btnPunto,
                    btnClear;

    private TextView tvResultado;
    private Integer numero1 = 0;
    private Integer numero2 = 0;
    private Integer resultado;
    private Integer operacion = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView();

    }

    private void setContentView() {
        btnCero = findViewById(R.id.btnCero);
        btnUno = findViewById(R.id.btnUno);
        btnDos = findViewById(R.id.btnDos);
        btnTres = findViewById(R.id.btnTres);
        btnCuatro = findViewById(R.id.btnCuatro);
        btnCinco = findViewById(R.id.btnCinco);
        btnSeis = findViewById(R.id.btnSeis);
        btnSiete = findViewById(R.id.btnSiete);
        btnOcho = findViewById(R.id.btnOcho);
        btnNueve = findViewById(R.id.btnNueve);
        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        btnIgual = findViewById(R.id.btnIgual);
        btnPunto = findViewById(R.id.btnPunto);
        btnClear = findViewById(R.id.btnClear);
        tvResultado =  findViewById(R.id.tvResultado);


        btnCero.setOnClickListener(this);
        btnUno.setOnClickListener(this);
        btnDos.setOnClickListener(this);
        btnTres.setOnClickListener(this);
        btnCuatro.setOnClickListener(this);
        btnCinco.setOnClickListener(this);
        btnSeis.setOnClickListener(this);
        btnSiete.setOnClickListener(this);
        btnOcho.setOnClickListener(this);
        btnNueve.setOnClickListener(this);
        btnSumar.setOnClickListener(this);
        btnRestar.setOnClickListener(this);
        btnMultiplicar.setOnClickListener(this);
        btnDividir.setOnClickListener(this);
        btnIgual.setOnClickListener(this);
        btnPunto.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }
    private void pressNumber(String digito){
        tvResultado.setText(tvResultado.getText() + digito);
    }
    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btnCero) {
            pressNumber("0");
        }
        if (v.getId() == R.id.btnUno) {
            pressNumber("1");
        }
        if (v.getId() == R.id.btnDos) {
            pressNumber("2");
        }
        if (v.getId() == R.id.btnTres) {
            pressNumber("3");
        }
        if (v.getId() == R.id.btnCuatro) {
            pressNumber("4");
        }
        if (v.getId() == R.id.btnCinco) {
            pressNumber("5");
        }
        if (v.getId() == R.id.btnSeis) {
            pressNumber("6");
        }
        if (v.getId() == R.id.btnSiete) {
            pressNumber("7");
        }
        if (v.getId() == R.id.btnOcho) {
            pressNumber("8");
        }
        if (v.getId() == R.id.btnNueve) {
            pressNumber("9");
        }
       // if (v.getId() == R.id.btnPunto) {
            //pressNumber(".");
       // }

        if (v.getId() == R.id.btnSumar) {
            sumar();
        }
        if (v.getId() == R.id.btnRestar) {
            restar();
        }
        if (v.getId() == R.id.btnMultiplicar) {
            multiplicar();
        }
        if (v.getId() == R.id.btnDividir) {
            dividir();
        }
        if (v.getId() == R.id.btnClear) {
            clear();
        }
        if (v.getId() == R.id.btnIgual) {
            igual();
        }
    }
    public void clear(){
        tvResultado.setText("");
    }
    public void sumar(){
        numero1 = (Integer.parseInt(tvResultado.getText().toString()));
        operacion = 1;
        clear();
    }
    public void restar(){
        numero1 = (Integer.parseInt(tvResultado.getText().toString()));
        operacion = 2;
        clear();
    }
    public void multiplicar(){
        numero1 = (Integer.parseInt(tvResultado.getText().toString()));
        operacion = 3;
        clear();
    }
    public void dividir(){
        numero1 = (Integer.parseInt(tvResultado.getText().toString()));
        operacion = 4;
        clear();
    }
    public void igual(){
        numero2 = (Integer.parseInt(tvResultado.getText().toString()));
        if (operacion.equals(1)){
            resultado = numero1 + numero2;
        }
        if (operacion.equals(2)){
            resultado = numero1 - numero2;
        }
        if (operacion.equals(3)){
            resultado = numero1 * numero2;
        }
        if (operacion.equals(4)){
            resultado = numero1 / numero2;
        }
        tvResultado.setText(resultado.toString());
    }
}