// VehicleOwner class branch
public abstract class Vehicle {
    protected String licence_number;
    protected String owner_id;
    protected String type;

    public Vehicle (String owner_id, String licence_number) {
        this.licence_number = licence_number;
        this.owner_id = owner_id;
        this.type = type;
    }
    public String getLicence_number() {
        return licence_number;
    }

    public String getType() {
        return type;
    }
    public void get_vehicle_details() {
        System.out.println("License Number :" + licence_number + "\nOwner Id :" + owner_id + "\nType : " + type);
    }
          public void set_licence_number(String licence_number) {
        this.licence_number=licence_number;
    }
    public void set_vechil_type(String type) {
      this.type=type;
    } 
    public void set_owner_id(Strind owner_id){
        this.owner_id=owner_id;
        }

}
