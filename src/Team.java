import java.util.ArrayList;
import java.util.Iterator;

public class Team implements Iterable<BaseHero>{

    public ArrayList<BaseHero> heroes;
    public String name;

    public Team(String name) {
        this.heroes = new ArrayList<BaseHero>();
        this.name = name;
    }

    public void add(BaseHero hero) {
        this.heroes.add(hero);
        if (hero.team != null) {
            hero.team.remove(hero);
        }
        hero.team = this;
    }

    public void remove(BaseHero hero) {
        this.heroes.remove(hero);
    }

    @Override
    public Iterator<BaseHero> iterator() {
        // TODO Auto-generated method stub
        return this.heroes.iterator();
    }

}
