package Planes;

import models.ClassificationLevel;
import models.ExperimentalType;

public class ExperimentalPlane extends Plane{

    private ExperimentalType experimentalType;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String planeModel, int maximumSpeed, int maximumFlightDistance, int maximumLoadCapacity, ExperimentalType experimentalType, ClassificationLevel classificationLevel) {
        super(planeModel, maximumSpeed, maximumFlightDistance, maximumLoadCapacity);
        this.experimentalType = experimentalType;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel){
        this.classificationLevel = classificationLevel;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + planeModel + '\'' +
                '}';
    }
}
