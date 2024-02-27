public class Subject {
    private String name;
    private double volume;
    private Material materials;

    public Subject() {
    }

    public Subject(String name, Material material, double volume) {
        this.name = name;
        this.materials = material;
        this.volume = volume;
    }


    public String getName() {
        return name;
    }

    public String getMaterial() {
        return materials.name();
    }

    public double getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMaterial(Material material) {
        this.materials = material;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMass() {
        return materials.getDensity() * volume;
    }

    public String toString() {
        return name + ";" + materials + ";" + volume + ";" + getMass();
    }
}
