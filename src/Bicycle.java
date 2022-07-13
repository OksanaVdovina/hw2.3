public class Bicycle extends Machines implements CheckMachines{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
            for (int i = 0; i < this.getWheelsCount(); i++) {
                updateTyre();
            }
    }
}
