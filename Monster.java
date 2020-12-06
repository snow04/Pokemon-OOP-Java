import java.util.*;

public class Monster {
    
    private String name;
    private String type;
    private String atk;
    private String hp;
    public ArrayList<ArrayList <String> > pokemon_list = new ArrayList<ArrayList <String>>();

    private ArrayList<String> MonsterSpecs()
    {
        ArrayList<String> pokemon = new ArrayList<String>();

        pokemon.add(this.name);
        pokemon.add(this.type);
        pokemon.add(this.atk);
        pokemon.add(this.hp);

        return pokemon;
    }

    void addMonster(String name, String atk, String hp, String type)
    {
        this.setMonsterName(name);
        this.setAtk(atk);
        this.setHp(hp);
        this.setType(type);

        pokemon_list.add(this.MonsterSpecs());
    }

    void getMonsterInfo(int monsterIndex)
    {
        
        System.out.println(pokemon_list.get(monsterIndex));
    }

    String setMonsterName(String name)
    {
        this.name = name;
        return this.name;
    }

    String getMonsterName()
    {
        return this.name;
    }

    String setType(String type){
        this.type = type;
        return this.type;
    }

    String setAtk(String atk)
    {
        this.atk = atk;
        return this.atk;
    }

    String setHp(String hp)
    {
        this.hp = hp;
        return this.hp;
    }

    String getHp()
    {
        return this.hp;
    }
    
}
