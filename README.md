IDEA 1: 
      loop trough file 
      list of liked ingredients
      list of disliked ingredients
      final_list =liked - disliked
too dumb: what if a client dislike all ingredients 
	  we will be left with 0 ingredients.

IDEA 2 : 
      loop trough file 
      liked and disliked ingredients with the frequency of each
      ingredient
      keep ingredients with the highest frequency 
      if an ingredient is more frequent in the liked list than disliked list=> Keep it
      else => delete it
      final list = frequent ingredients in the liked list and less frequent in the disliked list
