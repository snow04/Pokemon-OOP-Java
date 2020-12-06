import java.util.*;

public class Trainer extends Monster{
    
    private ArrayList<Integer> catch_pokemon = new ArrayList<Integer>();



    void catchPokemon(Integer monsterIndex)
    {
        catch_pokemon.add(monsterIndex);
    }

    void showCatchedPokemon()
    {
       for(int i = 0; i < catch_pokemon.size(); i++)
       {
            this.getMonsterInfo(catch_pokemon.get(i));
       }
    }
    public static void main(String[] args) {
        Trainer t = new Trainer();
        
        t.addMonster("Pikachu", "34", "20", "electric");
        t.addMonster("Bulbasur", "24", "2000", "electric");
        t.addMonster("Muto", "200", "500", "dark");


        t.catchPokemon(0);
        t.catchPokemon(2);
        
        t.showCatchedPokemon();
    }  
}
