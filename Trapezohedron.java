import java.text.DecimalFormat;
/**
 * A class that stores the label, color, and short edge length of a
 * trapezohedron. Includes methods to set and get each of these three fields
 * and to perform various calculations. 
 *
 * Project 6
 * @author Jordyn Godsey - COMP 1210 - 007
 * @version 2/24/22
 */
public class Trapezohedron {
// Fields instance variables
   private String label = "";
   private String color = "";
   private double shortEdge = 0;

// Constructor
    /**
     * Create Trapezohedron constructor with 3 parameters to use in other
     * programs.
     *
     *@param labelIn - command line argument
     *@param colorIn - command line argument
     *@param shortEdgeIn - command line argument
     */
   public Trapezohedron(String labelIn, String colorIn, double shortEdgeIn) {
      setLabel(labelIn);
      setColor(colorIn);
      setShortEdge(shortEdgeIn);
   }

// Methods
   /**
     * Create getLabel method to return label.
     *
     *@return label
     */
   public String getLabel() {
      return label;
   }

    /**
     * Create setLabel method to set label if value isn't null.
     *
     *@param labelIn - command line argument
     *@return isSet
     */
   public boolean setLabel(String labelIn) {
      boolean isSet = true;
      if (labelIn == null) {
         isSet = false;
      }
      else {
         label = labelIn.trim();
      }
      return isSet;
   }
   
   /**
     * Create getColor method to return color.
     *
     *@return color
     */
   public String getColor() {
      return color;
   }
   
    /**
     * Create setColor method to set color if value isn't null.
     *
     *@param colorIn - command line argument
     *@return isSet
     */
   public boolean setColor(String colorIn) {
      boolean isSet = true;
      if (colorIn == null) {
         isSet = false;
      }
      else {
         color = colorIn.trim();
      }
      return isSet;
   }
   
   /**
     * Create getShortEdge method to return shortEdge.
     *
     *@return shortEdge
     */
   public double getShortEdge() {
      return shortEdge;
   }
   
    /**
     * Create setShortEdge method to set shortEdge if value > 0.
     *
     *@param shortEdgeIn - command line argument
     *@return isSet
     */
   public boolean setShortEdge(double shortEdgeIn) {
      boolean isSet = false;
      if (shortEdgeIn > 0) {
         shortEdge = shortEdgeIn;
         isSet = true;
      }
      return isSet;
   }
   
   /**
     * Create edgeLengthAntiprism method to calculate the edge length antiprism.
     *
     *@return edgeLengthAntiprism
     */
   public double edgeLengthAntiprism() {
      double edgeLengthAntiprism = shortEdge / ((Math.sqrt(5) - 1) / 2);
      return edgeLengthAntiprism;
   }
   
   /**
     * Create longEdge method to calculate the long edge.
     *
     *@return longEdge
     */
   public double longEdge() {
      double longEdge = ((Math.sqrt(5) + 1) / 2)
                     * (shortEdge / ((Math.sqrt(5) - 1) / 2));
      return longEdge;
   }
   
   /**
     * Create surfaceArea method to calculate the surface area.
     *
     *@return surfaceArea
     */
   public double surfaceArea() {
      double sqrt = Math.sqrt((25 / 2.0) * (5 + Math.sqrt(5)));
      double surfaceArea = sqrt
                     * Math.pow((shortEdge / ((Math.sqrt(5) - 1) / 2)), 2);
      return surfaceArea;
   }
   
   /**
     * Create volume method to calculate the volume.
     *
     *@return volume
     */
   public double volume() {
      double volume = (5.0 / 12) * (3 + Math.sqrt(5))
                     * Math.pow((shortEdge / ((Math.sqrt(5) - 1) / 2)), 3);
      return volume;
   }
   
   /**
     * Create toString method to print output.
     *
     *@return output
     */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0###");
      String output = "Trapezohedron \"" + label + "\" is \"" + color
            + "\" with 20 edges and 12 vertices.";
      output += "\n\tedge length antiprism = "
               + df.format(edgeLengthAntiprism()) + " units";
      output += "\n\tshort edge = " + df.format(shortEdge) + " units";
      output += "\n\tlong edge = " + df.format(longEdge()) + " units";
      output += "\n\tsurface area = " + df.format(surfaceArea())
               + " square units";
      output += "\n\tvolume = " + df.format(volume()) + " cubic units";
      return output;
   }
}