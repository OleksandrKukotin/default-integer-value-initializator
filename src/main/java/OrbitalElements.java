import custom_annotations.ZeroIntegerFields;

@ZeroIntegerFields
public class OrbitalElements {

    private final String orbitName;
    private final int semiMajorAxis;
    private final int eccentricity;
    private final int inclination;
    private final int longitudeOfAscendingNode;
    private final int argumentOfPeriapsis;
    private final int trueAnomaly;

    public OrbitalElements(String orbitName) {
        this.orbitName = orbitName;
        this.semiMajorAxis = 1;
        this.eccentricity = 1;
        this.inclination = 1;
        this.longitudeOfAscendingNode = 1;
        this.argumentOfPeriapsis = 1;
        this.trueAnomaly = 1;
    }

    public String getOrbitName() {
        return orbitName;
    }

    public int getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public int getEccentricity() {
        return eccentricity;
    }

    public int getInclination() {
        return inclination;
    }

    public int getLongitudeOfAscendingNode() {
        return longitudeOfAscendingNode;
    }

    public int getArgumentOfPeriapsis() {
        return argumentOfPeriapsis;
    }

    public int getTrueAnomaly() {
        return trueAnomaly;
    }

    @Override
    public String toString() {
        return "OrbitalElements{" +
            "orbitName='" + orbitName + '\'' +
            ", semiMajorAxis=" + semiMajorAxis +
            ", eccentricity=" + eccentricity +
            ", inclination=" + inclination +
            ", longitudeOfAscendingNode=" + longitudeOfAscendingNode +
            ", argumentOfPeriapsis=" + argumentOfPeriapsis +
            ", trueAnomaly=" + trueAnomaly +
            '}';
    }
}