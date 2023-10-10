public class Main {
    public static void main(String[] args) {
    double sunDiameter = 865000;
    double earthDiameter = 7600;
    double sunVolume = (4.0 / 3.0 ) * Math.PI *(Math.pow(sunDiameter / 2 , 3));

    System.out.printf("the volume of the sun is: %.2f cubic miles%n", sunVolume);
    double earthVolume = (4.0 / 3.0 ) * Math.PI * (Math.pow(earthDiameter /2 , 3)) ;
    System.out.printf("the volume of the earth is: %.2f cubic miles%n", earthVolume);
    double ratio = sunVolume / earthVolume ;
        System.out.println("the ratio of sun's volume to earth's volume is: " + Math.round( ratio )) ;


    }
}