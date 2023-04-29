package com.example.actividad04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    //Declaramos las variables
    TextView tvdisplay;
    double n1,n2,res;
    String Operador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bCero(View view){
        tvdisplay=(TextView)findViewById(R.id.tv_dis);//El find guarda el valor que devuelve una variable
        tvdisplay.setText(tvdisplay.getText()+"0"); //Muestra el texto
    }
    public void bUno(View view){
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"1");
    }
    public void bDos(View view){
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"2");
    }
    public void bTres(View view){
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"3");
    }
    public void bCuatro(View view){
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"4");
    }
    public void bCinco(View view){
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"5");
    }
    public void bSeis(View view){
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"6");
    }
    public void bSiete(View view){
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"7");
    }
    public void bOcho(View view){
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"8");
    }
    public void bNueve(View view){
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+"9");
    }
    public void bPunto(View view){
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
        tvdisplay.setText(tvdisplay.getText()+".");
    }
    public void OnClickOperacionCapturaNumero1(View view){
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
        n1=Double.parseDouble(tvdisplay.getText().toString());
        tvdisplay.setText(" ");
    }
    public void Sumar(View view){
        Operador="+";
        OnClickOperacionCapturaNumero1(view);

    }
    public void Restar(View view){
        Operador="-";
        OnClickOperacionCapturaNumero1(view);
    }
    public void Multiplicar(View view){
        Operador="*";;
        OnClickOperacionCapturaNumero1(view);
    }
    public void Dividir(View view){
        Operador="/";
        OnClickOperacionCapturaNumero1(view);
    }
    public void Expn(View view){
        Operador="exp";
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
        try{
            n1=Double.parseDouble(tvdisplay.getText().toString());
            tvdisplay.setText("");
        }catch (NumberFormatException nfe){}
    }
    public void bIgual(View view){ // COFIGURACION DEL BOTON IGUAL
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
        n2=Double.parseDouble(tvdisplay.getText().toString());
        if (Operador.equals("+")){
            res=n1 + n2;
        }else if (Operador.equals("-")){
            res = n1 - n2;
        }else if (Operador.equals("*")){
            res = n1 * n2;
        }else if (Operador.equals("/")){
            res = n1 / n2;
        }else if (Operador.equals("exp")){
            tvdisplay=(TextView)findViewById(R.id.tv_dis);
            n2=Double.parseDouble(tvdisplay.getText().toString());
            tvdisplay.setText(" ");
            res= Math.pow(n1,n2);
        }
        tvdisplay.setText(" "+res);
    }
    public void Rnd(View view){ //na va hacer el numero aleatorio,
        //random genera el numero aleatorio
        for(int x = 0; x <= 100; x++){
            int na= (int)Math.floor(Math.random() * (100-(1+1))+(1));
            tvdisplay.setText(String.valueOf(na));
        }
    }
    public void Raiz(View view){ //sqrt permite sacar la raiz y
        //visualizar el resultado
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
        try{
            n1=Double.parseDouble(tvdisplay.getText().toString());
            res=Math.sqrt(n1);
            tvdisplay.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}

    }
    public void ExpCuadrado(View view){
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
        try{
            n1=Double.parseDouble(tvdisplay.getText().toString());
            res=Math.pow(n1,2);
            tvdisplay.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }
    public void ExpCubo(View view){
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
        try{
            n1=Double.parseDouble(tvdisplay.getText().toString());
            res=Math.pow(n1,3);
            tvdisplay.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }
    public void Sen(View view){ // rd va hacer los radianes
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
        try{
            n1=Double.parseDouble(tvdisplay.getText().toString());
            double rd=Math.toRadians(n1);
            res=Math.sin(rd);
            tvdisplay.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }
    public void Cos(View view){ // rd va hacer los radianes
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
        try{
            n1=Double.parseDouble(tvdisplay.getText().toString());
            double rd=Math.toRadians(n1);
            res=Math.cos(rd);
            tvdisplay.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }
    public void Tan(View view){ // rd va hacer los radianes
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
        try{
            n1=Double.parseDouble(tvdisplay.getText().toString());
            double rd=Math.toRadians(n1);
            res=Math.tan(rd);
            tvdisplay.setText(String.valueOf(res));
        }catch (NumberFormatException nfe){}
    }
    public void Factorial(View view){ //no se si es x o +
        int fact=1;
        int x;
        try {
            for (x = 1; x <= n1; x ++) {
                fact = fact * x;
            }
            tvdisplay.setText(String.valueOf(res));

        }catch (NumberFormatException nfe){}
    }
    public void BorrarUlt (View view){
        if(tvdisplay.getText().toString().equals("")){
            tvdisplay.setText(tvdisplay.getText().subSequence(0, tvdisplay.getText().length()-1)+ " "); // permite ver la longitud de lo
            //que ingresa pero restando ()-1+" ";
        }
    }
    public void bBorrarTodo(View view){
        n1=0.0;
        n2=0.0;
        tvdisplay=(TextView)findViewById(R.id.tv_dis);
        tvdisplay.setText(" ");
    }
    public void Salir(View view){ //permite salir de la calculadora
        finish();
    }

}