package AlgoritmosDeOrdenacao;

import GenerateVector.GenerateVectors;

public class BubbleSort {
    public static int[] bubbleSort(int[] vector) {
        int biggestValue;
        boolean change = true;

        if(vector.length > 0){
            for(int auxiliarIndex = 0; auxiliarIndex < vector.length - 1; auxiliarIndex++){
                for(int index = 0; index < vector.length - 1; index++){
                    if(vector[index] > vector[index + 1]){
                        biggestValue = vector[index];
                        vector[index] = vector[index + 1];
                        vector[index + 1] = biggestValue;
                        change = true;
                    }
                    if(!change){
                        break;
                    }
                }
            }        
        }
        return vector;
    }

    public static void main(String[] args) {
        GenerateVectors generate = new GenerateVectors();

        int[] ascVector = generate.AscVector(100000);
        int[] descVector = generate.DescVector(100000); 
        int[] randomVector = generate.RandomVector(100000);

        long ascStartTime = System.currentTimeMillis();
        int[] ordenedAscVector = bubbleSort(ascVector);
        long ascEndTime = System.currentTimeMillis();
        long ascTotal = ascEndTime - ascStartTime;

        long descStartTime = System.currentTimeMillis();
        int[] ordenedDescVector = bubbleSort(descVector);
        long descEndTime = System.currentTimeMillis();
        long descTotal = descEndTime - descStartTime; 

        long randomStartTime = System.currentTimeMillis();
        int[] ordenedRandomVector = bubbleSort(randomVector);
        long randomEndTime = System.currentTimeMillis();
        long randomTotal = randomEndTime - randomStartTime; 

        System.out.println("Vetor crescent de 100000 posicoes levou " + ascTotal + "ms para executar");
        System.out.println("Vetor decrescente de 100000 posicoes levou " + descTotal + "ms para executar");
        System.out.println("Vetor randomico de 100000 posicoes levou " + randomTotal + "ms para executar");
    }
}