package GenerateVector;

import java.util.Random;

public class GenerateVectors {
    public int[] generateAscVector(int length) {
        int[] vector = new int[length];
        
        for(int index = 0; index < vector.length; index++){
            vector[index] = index++;
        }

        return vector;
    }

    public int[] generateDescVector(int length) {
        int[] vector = new int[length];
        
        for(int index = 0; index < vector.length; index++){
            vector[index] = length;
            length--;
        }

        return vector;
    }

    public int[] generateRandomVector(int length) {
        int[] vector = new int[length];

        Random rand = new Random();

        for(int index = 0; index < vector.length; index++){
            vector[index] = rand.nextInt(length);
        }

        return vector;
    }
}
