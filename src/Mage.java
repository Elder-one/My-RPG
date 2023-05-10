public class Mage extends BaseHero {
    Integer mana;
    Integer maxMana;

    public Mage(String team, String name, int hp, int mana) {
        super(hp, name, team);
        this.mana = mana;
        this.maxMana = mana;
        System.out.println(String.format("Mage %s has arrived", name));
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("name: %s; hp: %d; mana: %d;",this.name, this.hp, this.mana);

    }

    public void GetHealingMessage() {
        System.out.println(String.format("Magical!"));
    }

    public void GetDamageMessage() {
        System.out.println(String.format("%s: Ouch!", this.name));
    }

    public void DeathMessage() {
        System.out.println(String.format("%s: At least you were here to watch", this.name));
    }

    public void FireBlast(entity target) {
        if (target.alive == false || this.alive == false) {
            return;
        }
        if (this.mana >= 40) {
            this.mana -= 40;
            System.out.println(String.format("%s: Burn!", this.name));
            target.GetDamage(this.outputDmgCalc(50));
        }
        else {
            System.out.println(String.format("%s: Out of mana..", this.name));
        }
    }

}
