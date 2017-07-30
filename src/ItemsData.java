public class ItemsData {
    private int slot;
    private int code;
    private int weight;

    public ItemsData(int slot, int code, int weight) {
        this.slot = slot;
        this.code = code;
        this.weight = weight;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
