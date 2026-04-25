public class VolumeCalculator {

    // Method 1: Volume of a Cube (one side)
    // Formula: side * side * side
    double calculateVolume(double side) {
        return side * side * side;
    }

    // Method 2: Volume of a Rectangular Cube (length, width, height)
    // Formula: length * width * height
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    // Method 3: Volume of a Sphere (radius)
    // Formula: (4/3) * PI * radius^3
    double calculateVolume(int radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    // Main method
    public static void main(String[] args) {

        // Create object of VolumeCalculator
        VolumeCalculator vc = new VolumeCalculator();

        // ─────────────────────────────────────────
        // Cube
        // ─────────────────────────────────────────
        double side        = 4.0;
        double cubeVolume  = vc.calculateVolume(side);

        System.out.println("==============================");
        System.out.println("          CUBE                ");
        System.out.println("==============================");
        System.out.println("Side          : " + side);
        System.out.println("Volume        : " + cubeVolume);

        // ─────────────────────────────────────────
        // Rectangular Cube
        // ─────────────────────────────────────────
        double length    = 5.0;
        double width     = 3.0;
        double height    = 2.0;
        double rectVolume = vc.calculateVolume(length, width, height);

        System.out.println("\n==============================");
        System.out.println("      RECTANGULAR CUBE        ");
        System.out.println("==============================");
        System.out.println("Length        : " + length);
        System.out.println("Width         : " + width);
        System.out.println("Height        : " + height);
        System.out.println("Volume        : " + rectVolume);

        // ─────────────────────────────────────────
        // Sphere
        // ─────────────────────────────────────────
        int    radius       = 6;
        double sphereVolume = vc.calculateVolume(radius);

        System.out.println("\n==============================");
        System.out.println("          SPHERE              ");
        System.out.println("==============================");
        System.out.println("Radius        : " + radius);
        System.out.printf ("Volume        : %.2f%n", sphereVolume);
        System.out.println("==============================");
    }
}