public class BodyMassIndexService {
    public String calculate (float height, float weight){
        float bmi = weight/(height*height);
        String result = String.format("%8.2f", bmi).replace(',', '.');
        return result;
    }
}
