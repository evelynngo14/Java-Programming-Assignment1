//(Geography: estimate areas) Find the GPS locations for Atlanta, Georgia;
//Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina from
//www.gps-data-team.com/map/ and compute the estimated area enclosed by these
//four cities. (Hint: Use the formula in Programming Exercise 4.2 to compute the
//distance between two cities. Divide the polygon into two triangles and use the
//formula in Programming Exercise 2.19 to compute the area of a triangle.)

package cis3270.assignment1.chapter4;

public class Q3 {
    public static void main(String[] args) {

        double AtlantaLat = 33.7525115;
        double AtlantaLong = -84.3920775;

        double OrlandoLat = 28.533497866;
        double OrlandoLong = -81.372165178;

        double CharlotteLat = 35.227085;
        double CharlotteLong = -80.843124;

        double SavannahLat = 32.076176;
        double SavannahLong = -81.088371;

        // triangle 1
        double distanceAtlCharl = Math.sqrt(Math.pow(CharlotteLat - AtlantaLat, 2) + Math.pow(CharlotteLong - AtlantaLong, 2));
        double distanceSavCharl = Math.sqrt(Math.pow(SavannahLat - CharlotteLat, 2) + Math.pow(SavannahLong - CharlotteLong, 2));
        double distanceAtlSav = Math.sqrt(Math.pow(AtlantaLat - SavannahLat, 2) + Math.pow(AtlantaLong - SavannahLong, 2));
        // triangle 2
        double distanceOrlCharl = Math.sqrt(Math.pow(OrlandoLat - CharlotteLat, 2) + Math.pow(OrlandoLong - CharlotteLong, 2));
        double distanceOrlSav = Math.sqrt(Math.pow(OrlandoLat - SavannahLat, 2) + Math.pow(OrlandoLong - SavannahLong, 2));

        double triangle1 = (distanceAtlCharl + distanceSavCharl + distanceAtlSav) / 2;
        double areaTriangle1 = Math.sqrt(triangle1 * (triangle1 - distanceAtlCharl) * (triangle1 - distanceSavCharl) * (triangle1 - distanceAtlSav));

        double triangle2 = (distanceSavCharl + distanceOrlCharl + distanceOrlSav);
        double areaTriangle2 = Math.sqrt(triangle2 * (triangle2 - distanceAtlCharl) * (triangle1 - distanceSavCharl) * (triangle2 - distanceAtlSav));;

        double completeArea = areaTriangle2 + areaTriangle1;

        System.out.println("The enclosed area of the four cities is " + completeArea);

    }
}
