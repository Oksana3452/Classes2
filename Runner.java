public class Runner {

    public static void main(String[] args) {
        Subject wire = new Subject("Проволока", Material.STEEL, 0.03);
        System.out.println(wire);
        wire.setMaterial(Material.COPPER);
        System.out.println("Масса проволоки составляет " + wire.getMass() + "кг.");
    }
}
