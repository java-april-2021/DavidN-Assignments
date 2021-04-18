public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return "Galaxy says " + this.getRingTone();
    }
    @Override
    public String unlock() {
        String unlocked = "Unlocked via fingerprint.";
        return unlocked;
    }
    @Override
    public void displayInfo() {
        System.out.println("Your Galaxy version " + this.getVersionNumber() + " has " + this.getBatteryPercentage() + "% battery.");
        System.out.println("Your carrier is " + this.getCarrier());           
    }
}
