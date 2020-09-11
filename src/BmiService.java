public class BmiService {
    public float calculate(float mass, float height) {
        float bodyMassIndex = mass /(height*height) ;
        // mass вводится в килограммах, height в метрах;
return bodyMassIndex;
    }
}