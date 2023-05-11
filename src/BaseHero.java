public abstract class BaseHero extends entity {

    public Team team;

    public BaseHero(int hp, String name) {
        super(hp, name);
        this.team = new Team(this.name);
    }

    public BaseHero(int hp, String name, Team team) {
        super(hp, name);
        team.add(this);
        this.team = team;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (other.getClass() != this.getClass()) {
            return false;
        }
        BaseHero o = (BaseHero)other;
        return this.name == o.name;
    }

}
