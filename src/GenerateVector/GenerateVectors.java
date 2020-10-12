package GenerateVector;

import java.util.Random;

public class GenerateVectors {
    public int[] AscVector(int length) {
        int[] vector = new int[length];
        
        for(int index = 0; index < vector.length; index++){
            vector[index] = index++;
        }

        return vector;
    }

    public int[] DescVector(int length) {
        int[] vector = new int[length];
        
        for(int index = 0; index < vector.length; index++){
            vector[index] = length;
            length--;
        }

        return vector;
    }

    public int[] RandomVector(int length) {
        int[] vector = new int[length];

        Random rand = new Random();

        for(int index = 0; index < vector.length; index++){
            vector[index] = rand.nextInt(length);
        }

        return vector;
    }
}
