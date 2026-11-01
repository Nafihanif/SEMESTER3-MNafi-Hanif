package ZombieBarrier;

public abstract class Zombie implements Destroyable {
    public int health;
    public int level;

    public abstract void heal();

    @Override 
    public abstract void destroyed();

    public String getZombieInfo(){
        return "Health: " + health + "\nLevel: " + level;
    }

}

