public abstract class BaseHero extends entity {

    public String team;

    public BaseHero(int hp, String name, String team) {
        super(hp, name);
        this.team = team;
    }
}
