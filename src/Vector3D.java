public class Vector3D extends Vector{
    public Vector3D(int x1, int y1, int z1, int x2, int y2, int z2) {
        super(x1, y1, z1, x2, y2, z2);
    }

    @Override
    public double getLength() {
        return (double) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) + Math.pow(z2 - z1, 2);
    }

    @Override
    public String getVectorCords() {
        return (x2 - x1) + " " + (y2 - y1) + " " + (z2 - z1);
    }

    public double scalarProduct(Vector3D vector){
        return (double) this.getLength() * vector.getLength();
    }

    public double getAngle(Vector3D vector){
        if(this.getLength() != 0 && vector.getLength() != 0){
            return this.scalarProduct(vector) / (this.getLength() * vector.getLength());
        } else
            return -2.0;
    }
}
