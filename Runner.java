public class Runner {

    public static void main(String[] args) {
        final Material STEEL = new Material("Сталь", 7850.0);
        Subject wire = new Subject("Проволока", STEEL, 0.03);
        System.out.println(wire);
        final Material COPPER = new Material("Медь", 8500.0);
        wire.setMaterial(COPPER);
        System.out.println("Масса проволоки составляет " + wire.getMass());

    }
}
