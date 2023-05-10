public abstract class entity {

    public static Integer count = 0;
    public Integer maxHp;
    public Integer hp;
    public String name;
    public Boolean alive;

    public entity(int hp, String name) {
        this.maxHp = hp;
        this.hp = hp;
        this.name = name;
        this.alive = true;
        count++;
    }


    public void Death() {
        this.hp = 0;
        this.alive = false;
        this.DeathMessage();
    }

    
    public void GetDamage(int amount) {
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


    public abstract void GetHealingMessage();

    public abstract void DeathMessage();

    public abstract void GetDamageMessage();

}
