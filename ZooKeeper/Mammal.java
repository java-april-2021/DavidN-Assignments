public class Mammal{
    private int energylevel;

    public Mammal(){
        this.energylevel = 100;
    }

    public int displayEnergy(){
        System.out.println("Energy level is " + energylevel);
        return energylevel;
    }

    public int getEnergy(){
        return this.energylevel;
    }
    
    public void setEnergy(int energy){
        this.energylevel = energy;
    }

    public void spendEnergy(int energy){
        this.energylevel -= energy;
    }

    public void gainEnergy(int energy){
        this.energylevel += energy;
    }
}