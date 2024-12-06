// VehicleOwner class branch
public abstract class VehicleOwner {
    // Add attributes
     protected String licence_number;
     protected String owner_id;
     protected String type;
     public vecile(String owner_id, String licence_number) {
        this.licence_number = licence_number;
        this.owner_id = owner_id;
        this.type = type;
    }
      public void get_vehicle_details() {
        System.out.println("License Number :" + licence_number + "\nOwner Id :" + owner_id + "\nType : " + type);
    }
    public void set_licence_number(String licence_number) { //to modifay the licence number.
        this.licence_number=licence_number;
    }
    public void set_vehicle_type(String type) { //to modifay the vehicle type.
      this.type=type;
    }
}
