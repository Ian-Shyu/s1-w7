public class Weight {
    private int pounds;
    private int ounces;

    public Weight(int ounces){
        if (ounces >= 0){
            if (ounces < 16){
                this.ounces = ounces;
            }
        }
 
    }

    public Weight(int ounces, int pounds){
       if (ounces >= 0){
            if (ounces < 16){
                this.ounces = ounces;
            }
        }
 
    }
    if (pounds > 0){
        this.pounds = pounds;
    }
}