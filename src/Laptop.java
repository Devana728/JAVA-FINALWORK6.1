import java.util.Objects;

public class Laptop {
    private String model;
    private String label;
    private String chip;
    private Integer memory;
    private Integer hddSize;
    private String os;
    private String color;

    public Laptop(String model, String label, String chip, Integer memory, Integer hddSize, String os, String color) {
        this.model = model;
        this.label = label;
        this.chip = chip;
        this.memory = memory;
        this.hddSize = hddSize;
        this.os = os;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getLabel() {
        return label;
    }

    public String getChip() {
        return chip;
    }

    public Integer getMemory() {
        return memory;
    }

    public Integer getHddSize() {
        return hddSize;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", label='" + label + '\'' +
                ", chip='" + chip + '\'' +
                ", memory=" + memory +
                ", hddSize=" + hddSize +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return model.equals(laptop.model) &&
                label.equals(laptop.label) &&
                chip.equals(laptop.chip) &&
                memory.equals(laptop.memory) &&
                hddSize.equals(laptop.hddSize) &&
                os.equals(laptop.os) &&
                color.equals(laptop.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, label, chip, memory, hddSize, os, color);
    }
}
