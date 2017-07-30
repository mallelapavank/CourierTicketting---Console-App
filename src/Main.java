public class Main {
    public static void main(String[] args) {
        System.out.println("Enter command..");
        String command;
        SlotCalulations slotCalulations = new SlotCalulations();

        while(true) {
            String userInput = ReadConsole.getString();
            String[] readCommand = userInput.split("\\s");
            command = readCommand[0];

            switch (command) {
                case "create_parking_lot":
                    int size = Integer.valueOf(readCommand[1]);
                    slotCalulations.create(size);
                    break;

                case "park":
                    int code = Integer.valueOf(readCommand[1]);
                    int weight = Integer.valueOf(readCommand[2]);
                    slotCalulations.park(code, weight);
                    break;

                case "leave":
                    int slotNum = Integer.valueOf(readCommand[1]);
                    slotCalulations.leave(slotNum);
                    break;

                case "status":
                    slotCalulations.status();
                    break;

                case "parcel_code_for_parcels_with_weight":
                    int parcelWithWeight = Integer.valueOf(readCommand[1]);
                    slotCalulations.parcel_code_for_parcels_with_weight(parcelWithWeight);
                    break;

                case "slot_numbers_for_parcels_with_weight":
                    int slotWithWeight = Integer.valueOf(readCommand[1]);
                    slotCalulations.slot_numbers_for_parcels_with_weight(slotWithWeight);
                    break;

                case "slot_number_for_registration_number":
                    int slotWithCode = Integer.valueOf(readCommand[1]);
                    slotCalulations.slot_number_for_registration_number(slotWithCode);
                    break;

                case "exit":
                    System.out.println("--Application Terminated--");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid command");
            }
        }
    }
}
