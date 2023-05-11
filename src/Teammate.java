
public class Teammate<T extends BaseHero> {

    public T hero;
    public Team team;

    public Teammate(T hero, Team team) {
        this.hero = hero;
        this.team = team;
    }
    
}