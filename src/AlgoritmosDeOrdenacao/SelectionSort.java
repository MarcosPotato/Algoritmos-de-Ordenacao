package AlgoritmosDeOrdenacao;

import GenerateVector.GenerateVectors;

public class SelectionSort {
    public static int[] selectionSort(int[] vector) {
        
        int lowestValue = 0;
        int lowestIndex = 0;
        int auxiliar;

        for(int index = 0; index < vector.length; index++){
            for(int auxIndex = index; auxIndex < vector.length; auxIndex++){
                if(vector[auxIndex] < vector[auxIndex++]){
                    lowestValue = vector[auxIndex];
                    lowestIndex = auxIndex;
                }
            }

            auxiliar = vector[index];
            vector[index] = lowestValue;
            vector[lowestIndex] = auxiliar; 
        }
        
        return vector;
    }

    public static void main(String[] args) {
        GenerateVectors generate = new GenerateVectors();

        int[] ascVector = generate.RandomVector(7);

        long startTime = System.currentTimeMillis();
        int[] ordenedVector = selectionSort(ascVector);
        long endTime = System.currentTimeMillis();
        long finishtime = endTime - startTime;

        System.out.println("Vetor original");
        for(int i = 0; i < ascVector.length; i++){
            System.out.println(ascVector[i]);
        }

        System.out.println("Vetor original");
        for(int i = 0; i < ordenedVector.length; i++){
            System.out.println(ordenedVector[i]);
        }

        System.out.println("Em um vetor randomico levou: " + finishtime + "ms para executar");
    }
}
