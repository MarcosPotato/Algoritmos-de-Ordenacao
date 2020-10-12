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

        int[] ascVector100 = generate.generateAscVector(100000);
        int[] descVector100 = generate.generateDescVector(100000); 
        int[] randomVector100 = generate.generateRandomVector(100000);

        /* int[] ascVector200 = generateAscVector(200000);
        int[] ascVector400 = generateAscVector(400000);
        int[] ascVector1M  = generateAscVector(1000000);
        int[] ascVector2M  = generateAscVector(2000000); */


        long ascStartTime100 = System.currentTimeMillis();
        int[] ordenedAscVector100 = bubbleSort(ascVector100);
        long ascEndTime100 = System.currentTimeMillis();
        long ascTotal100 = ascEndTime100 - ascStartTime100;

        long descStartTime100 = System.currentTimeMillis();
        int[] ordenedDescVector100 = bubbleSort(descVector100);
        long descEndTime100 = System.currentTimeMillis();
        long descTotal100 = descEndTime100 - descStartTime100; 

        long randomStartTime100 = System.currentTimeMillis();
        int[] ordenedRandomVector100 = bubbleSort(randomVector100);
        long randomEndTime100 = System.currentTimeMillis();
        long randomTotal100 = randomEndTime100 - randomStartTime100; 

        System.out.println("Vetor crescent de 100000 posicoes levou " + ascTotal100 + "ms para executar");
        System.out.println("Vetor decrescente de 100000 posicoes levou " + descTotal100 + "ms para executar");
        System.out.println("Vetor randomico de 100000 posicoes levou " + randomTotal100 + "ms para executar");
        
        /* System.out.println("Vetor original: ");
        for(int index = 0; index < ascVector100.length; index++){
            System.out.println(ascVector100[index] + " ");
        }
        
        System.out.println("Vetor ordenado: ");
        for(int index = 0; index < ordenedVector100.length; index++){
            System.out.println(ordenedVector100[index] + " ");
        } */
        
    }
}