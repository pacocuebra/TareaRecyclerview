package com.pacuebra.petgram;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.app.ProgressDialog.show;

/**
 * Created by Francisco on 14/06/2016.
 */

public class ContactoAdaptador extends  RecyclerView.Adapter<ContactoAdaptador.ContactoViewHolder> {

    ArrayList<Perro> contactos;

    public ContactoAdaptador(ArrayList<Perro> contactos){
            this.contactos = contactos;
    }
    @Override //Inflara el layout y lo pasara al viewholder para que el obtenga los views

    public ContactoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.contacto_perro, parent, false);
        ContactoViewHolder holder = new ContactoViewHolder(v);
        return holder;
    }
//asocia cada elemento de la lista con cada view
    @Override
    public void onBindViewHolder(ContactoViewHolder contactoViewHolder,/*final*/ int position) {
       Perro contacto = contactos.get(position);
        contactoViewHolder.imgFoto.setImageResource(contacto.getFoto());
        contactoViewHolder.tvnombre.setText(contacto.getNombre());
    }

    @Override
    public int getItemCount() {  //Cantidad de elementos que contiene la lista de contactos
        return contactos.size();
    }

    public static class ContactoViewHolder extends RecyclerView.ViewHolder /*implements View.OnClickListener*/ {

        private ImageView imgFoto;
        private TextView tvnombre;

        public ContactoViewHolder(final View itemView) {
            super(itemView);

            imgFoto  = (ImageView) itemView.findViewById(R.id.imgFoto);
            tvnombre = (TextView)  itemView.findViewById(R.id.tvnombre);

        }

    }
}
