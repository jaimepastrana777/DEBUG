public class Tamagotchi {
 
    private int hunger;
    private int energy;
    private int mood;

    public Tamagotchi() {
        this.hunger = 4;
        this.energy = 4;
        this.mood = 4;
    }

    public String play() {
        this.hunger += 1; 
        this.mood += 1;   
        this.energy -= 1; 
        return checkState();
    }

    public String eat() {
        this.hunger -= 2; 
        this.energy -= 1; 
        return checkState();
    }

    public String sleep() {
        this.energy += 2; 
   
        return "(-_-) zzz"; 
    }

    private String checkState() {
       
        if (this.energy == 0) {
            return "(-_-) zzz"; 
        }
        
        if (this.mood > 8) {
            return ":-)"; 
        }
        
        if (this.energy < 3) {
            return "(-_-)"; 
        }
        
        if (this.mood < 2) {
            return "ఠ_ఠ"; 
        }

        return ":-|"; 
    }

    public int getHungry() { return hunger; }
    public int getEnergy() { return energy; }
    public int getMood() { return mood; }
}