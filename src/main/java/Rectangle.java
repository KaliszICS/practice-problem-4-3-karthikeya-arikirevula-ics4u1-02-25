public class Rectangle {

    private double length;
    private double width;

    public Rectangle() {
        this.length = 4.0;
        this.width = 8.0;
    }

    /**

     * @param length 
     */
    public Rectangle(double length) {

        this.length = length;
        this.width = 8.0;
    }

    /**

     * @param length
     * @param width 
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //getter

    /**

     * @return 
     */
    public double getLength() {
        return this.length;
    }

    /**

     * @return 
     */
    public double getWidth() {
        return this.width;
    }

}