package com.example.pokemon_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonAdapter.ViewHolder> {
    private List<Pokemon> pokemonList;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView pokemonName;
        public ImageView pokemonImage;

        public ViewHolder(View view) {
            super(view);
            pokemonName = itemView.findViewById(R.id.pokemon_name);
            pokemonImage = itemView.findViewById(R.id.pokemon_image);
        }
    }

    public PokemonAdapter(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pokemon, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Pokemon pokemon = pokemonList.get(position);
        holder.pokemonName.setText(pokemon.getName());
        String imageUrl = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/"+(position+1) +".png";

        // Load the image from the URL using Picasso
        Picasso.get().load(imageUrl).into(holder.pokemonImage);
    }

    @Override
    public int getItemCount() {
        return pokemonList.size();
    }
}