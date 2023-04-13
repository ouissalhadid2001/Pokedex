package com.example.pokemon_app;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PokeAPI {
    @GET("pokemon")
    Call<PokemonResponse> getPokemonList(@Query("limit") int limit, @Query("offset") int offset);
}
