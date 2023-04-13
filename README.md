# Pokedex
Pokedex application with JAVA ONLY
Cette application permet d'afficher la liste des pokemons en listant les détails de chacun à part . 
Toutes les informations sont menées de l'API https://pokeapi.co/api/v2/pokemon.
Dans ce projet , il y a deux fonctionalités :
Fonctionalité 1 : La liste des pokemons raméné de l'API(j'ai limité les elemnts en 10 paramètres LIMIT) avec le nom , l'id et l'image . Chaque élément de la liste comprend un bouton qui déclenche par un evenement de clic une requete à l'api ( transfert de l'id du pokemon vers la deuxieme activité (details du pokemon) qui retourne les informations qui le sont associés.
-------------------------------------------------------------------------------------------------------------------------------------
 Biliothèques utilisées
 ------------------------------------------------------------------------------------------------------------------------------------
  'com.squareup.retrofit2:retrofit:2.9.0' pour implémenter des appels à des webservices REST
  'com.squareup.retrofit2:converter-gson:2.9.0' gérer le format json
  'com.squareup.picasso:picasso:2.71828' gérer les images


