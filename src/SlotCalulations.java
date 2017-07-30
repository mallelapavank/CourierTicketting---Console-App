import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SlotCalulations {

//    ArrayList<ItemsData> slotsArray;
    private Map<Integer, ItemsData> slotMap;
    private int slotSize;

    public void create(int size) {
        slotSize = size;
        slotMap = new HashMap<>(slotSize);
        System.out.println("Created a parcel slot with " + slotSize + " slots");
    }

    public void park(int code, int weight) {
        int parkingIndex = -1;
        int leftRow = 1;
        int rightRow = slotSize;
        for(int i = 0; i<=slotSize; i++) {
            if (i % 2 == 0) {
                if (slotMap.get(leftRow) == null) {
                    parkingIndex = leftRow;
                    break;
                } else {
                    leftRow++;
                }
            } else {
                if (slotMap.get(rightRow) == null) {
                    parkingIndex = rightRow;
                    break;
                } else {
                    rightRow--;
                }
            }
        }
        if(parkingIndex == -1){
            System.out.println("Sorry, parcel slot is full");
        } else {
            slotMap.put(parkingIndex, new ItemsData(parkingIndex, code, weight));
            System.out.println("Allocated slot number " + parkingIndex);
        }
    }

    public void leave(int slotIndex) {
        int leaveIndex = 0;
        for (Map.Entry<Integer, ItemsData> entry : slotMap.entrySet()) {
            if (slotIndex == entry.getKey()) {
                leaveIndex = slotIndex;
            }
        }
        if(leaveIndex != 0) {
            slotMap.remove(slotIndex);
            System.out.println("Slot number " + slotIndex + " is free. " + slotMap.size() + " slots are free");
        } else {
            System.out.println("Slot does not exist");
        }
    }

    public void status() {
        if(slotMap != null) {
            System.out.println("Slot\t\tCode\t\tWeight");
            for (Map.Entry<Integer, ItemsData> entry : slotMap.entrySet()) {
                System.out.println(entry.getKey() + "\t\t\t" + entry.getValue().getCode() + "\t\t\t" + entry.getValue().getWeight());
            }
        } else {
            System.out.println("No slot found");
        }
    }

    public void parcel_code_for_parcels_with_weight(int receivedWeight) {
        for (Map.Entry<Integer, ItemsData> entry : slotMap.entrySet()) {
            if (receivedWeight == entry.getValue().getWeight()) {
                System.out.println(entry.getValue().getCode() + ", ");
            }
        }
    }

    public void slot_numbers_for_parcels_with_weight(int slotWithWeight) {
        for (Map.Entry<Integer, ItemsData> entry : slotMap.entrySet()) {
            if (slotWithWeight == entry.getValue().getWeight()) {
                System.out.println(entry.getKey() + ", ");
            }
        }
    }

    public void slot_number_for_registration_number(int slotWithCode) {
        for (Map.Entry<Integer, ItemsData> entry : slotMap.entrySet()) {
            if (slotWithCode == entry.getValue().getCode()) {
                System.out.println(entry.getKey() + ", ");
            }
        }
    }
}
