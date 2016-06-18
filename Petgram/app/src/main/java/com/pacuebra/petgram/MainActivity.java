package com.pacuebra.petgram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView listaPerros;
    //ImageButton bthueso1;
    ArrayList<Perro> contactos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPerros = (RecyclerView)findViewById(R.id.rvPerros);



        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaPerros.setLayoutManager(llm);
        contactos = new ArrayList<Perro>();

        contactos.add(new Perro(R.drawable.basset_hound, "Basset Hound"));
        contactos.add(new Perro(R.drawable.boxer, "Boxer"));
        contactos.add(new Perro(R.drawable.bulldog, "Bulldog"));
        contactos.add(new Perro(R.drawable.chihuahua, "Chihuahua"));
        contactos.add(new Perro(R.drawable.dalmata, "Dalmata"));
        contactos.add(new Perro(R.drawable.gran_danes, "Gran Danes"));
        contactos.add(new Perro(R.drawable.husky_siberiano, "Husky Siberiano"));
        contactos.add(new Perro(R.drawable.labrador, "Labrador"));
        contactos.add(new Perro(R.drawable.lakeland_terrier, "Lakeland Terrier"));
        contactos.add(new Perro(R.drawable.pastor_aleman, "Pastor Aleman"));
        contactos.add(new Perro(R.drawable.pitbull, "Pitbull"));
        contactos.add(new Perro(R.drawable.pomerania, "Pomerania"));
        contactos.add(new Perro(R.drawable.r_pug2, "Pug"));

        inciarAdaptador();
    }

public void inciarAdaptador(){
    ContactoAdaptador adaptador = new ContactoAdaptador(contactos);
    listaPerros.setAdapter(adaptador);
}

    public void irActividadDos (View v){
        //Perro contacto = contactos.get(position);
        Intent intent = new Intent(this,Main2Activity.class);
 /*       Bundle b = new Bundle();
        b.putString("NOMBRE",contacto.getNombre().toString());
        b.putInt("FOTO",contacto.getFoto());
        intent.putExtras(b);    */
        startActivity(intent);
    }


}

