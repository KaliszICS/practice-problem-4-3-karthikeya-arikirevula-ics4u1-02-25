public class Chair {

    private int legs;
    private String material;

    public Chair() {
        this.legs = 4;
        this.material = "wood";
    }

    /**

     * @param legs 
     */
    public Chair(int legs) {

        this.legs = legs;
        this.material = "wood";
    }

    /**

     * @param legs  
     * @param material 
     */
    public Chair(int legs, String material) {
        this.legs = legs;
        this.material = material;
    }



    /**

     * @return 
     */
    public int getLegs() {
        return this.legs;
    }

    /**

     * @return 
     */
    public String getMaterial() {
        return this.material;
    }

}