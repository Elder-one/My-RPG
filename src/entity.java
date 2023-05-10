import java.lang.Math;

public abstract class entity {

    public static Integer count = 0;
    private Integer level;
    public Integer maxHp;
    public Integer hp;
    public String name;
    public Boolean alive;

    public entity(int hp, String name) {
        this.level = 1;
        this.maxHp = hp;
        this.hp = hp;
        this.name = name;
        this.alive = true;
        count++;
    }


    public entity(int hp, String name, int level) {
        this(hp, name);
        this.level = level;
    }


    public void Death() {
        this.hp = 0;
        this.alive = false;
        this.DeathMessage();
    }


    private static int inputDmgCalc(int rawDmg, int level) {
        double factor = 1 / Math.sqrt(level);
        return (int)Math.round(factor*rawDmg);
    }

    public int outputDmgCalc(int rawDmg) {
        double factor = Math.exp(0.1*this.level);
        return (int)Math.round(factor*rawDmg);
    }

    
    public void GetDamage(int amount) {

        amount = inputDmgCalc(amount, this.level);

        if (this.hp <= amount) {
            this.Death();
        }
        else {
            this.hp -= amount;
            this.GetDamageMessage();
        }
    }


    public void GetHealing(int amount) {
        if (this.hp + amount > this.maxHp) {
            this.hp = this.maxHp;
        }
        else {
            this.hp += amount;
        }
        this.GetHealingMessage();
    }

    public int GetLevel() {
        return this.level;
    }

    public void SetLevel(int level) {
        this.level = level;
    }


    public abstract void GetHealingMessage();

    public abstract void DeathMessage();

    public abstract void GetDamageMessage();

}
