@SetIntFieldsToZero
public class OrbitalElements {
    private int semiMajorAxis;
    private int eccentricity;
    private int inclination;
    private int longitudeOfAscendingNode;
    private int argumentOfPeriapsis;
    private int trueAnomaly;

    public OrbitalElements(int semiMajorAxis, int eccentricity, int inclination, int longitudeOfAscendingNode, int argumentOfPeriapsis, int trueAnomaly) {
        this.semiMajorAxis = semiMajorAxis;
        this.eccentricity = eccentricity;
        this.inclination = inclination;
        this.longitudeOfAscendingNode = longitudeOfAscendingNode;
        this.argumentOfPeriapsis = argumentOfPeriapsis;
        this.trueAnomaly = trueAnomaly;
    }

    // Getters and setters for the fields
    public int getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis(int semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public int getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(int eccentricity) {
        this.eccentricity = eccentricity;
    }

    public int getInclination() {
        return inclination;
    }

    public void setInclination(int inclination) {
        this.inclination = inclination;
    }

    public int getLongitudeOfAscendingNode() {
        return longitudeOfAscendingNode;
    }

    public void setLongitudeOfAscendingNode(int longitudeOfAscendingNode) {
        this.longitudeOfAscendingNode = longitudeOfAscendingNode;
    }

    public int getArgumentOfPeriapsis() {
        return argumentOfPeriapsis;
    }

    public void setArgumentOfPeriapsis(int argumentOfPeriapsis) {
        this.argumentOfPeriapsis = argumentOfPeriapsis;
    }

    public int getTrueAnomaly() {
        return trueAnomaly;
    }

    public void setTrueAnomaly(int trueAnomaly) {
        this.trueAnomaly = trueAnomaly;
    }
}