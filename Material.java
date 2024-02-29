public enum Material {
    STEEL(7850.0),
    COPPER(8500.0);
    private final double DENSITY;

    private Material(double num) {
        this.DENSITY = num;
    }

    public String getName() {
        return name().toLowerCase();
    }

    public double getDensity() {
        return DENSITY;
    }

    public String toString() {
        return getName() + ";" + DENSITY;
    }
}