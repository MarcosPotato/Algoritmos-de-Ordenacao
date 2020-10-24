package AlgoritmosDeOrdenacao;

import GenerateVector.GenerateVectors;

public class MergeSort {
    private static void intercala(int initialIndex, int auxiliarIndex, int length, int[] vector) {
		int temp[] = new int[vector.length];
        
        int index = initialIndex;
		int aux = auxiliarIndex;
        int tempIndex = 0;
        
		while ((index <= (auxiliarIndex - 1)) && (aux <= length)) {
			if (vector[index] <= vector[aux]) {
				temp[tempIndex] = vector[index];
				index = index + 1;
			} else {
				temp[tempIndex] = vector[aux];
				aux = aux + 1;
			}
			tempIndex = tempIndex + 1;
        }
        
		while (index < auxiliarIndex) {
			temp[tempIndex] = vector[index];
			index = index + 1;
			tempIndex = tempIndex + 1;
		}
		while (aux <= length) {
			temp[tempIndex] = vector[aux];
			aux = aux + 1;
			tempIndex = tempIndex + 1;
        }
        
        tempIndex = 0;
        
		while (tempIndex < (length - initialIndex + 1)) {
			vector[tempIndex + initialIndex] = temp[tempIndex];
			tempIndex++;
        }
    }

    private static int[] mSort(int initialIndex, int length, int[] vector) {
		int auxiliar;
		if (initialIndex < length) {
			auxiliar = (initialIndex + length) / 2;
			mSort(initialIndex, auxiliar, vector);
			mSort(auxiliar + 1, length, vector);
			intercala(initialIndex, auxiliar + 1, length, vector);
        }
        
        return vector;
	}
    
    public static int[] mergeSort(int[] vector) {
        int[] ordenedVector = mSort(0, vector.length - 1, vector);
        return ordenedVector;
    }

    public static void main(String[] args) {
        GenerateVectors generate = new GenerateVectors();

        for(int i = 0; i < 5; i++){
            int[] ascVector = generate.AscVector(100000);
            
            long ascStartTime = System.currentTimeMillis();
            int[] ordenedAscVector = mergeSort(ascVector);
            long ascEndTime = System.currentTimeMillis();
            long ascTotal = ascEndTime - ascStartTime;
            
            System.out.println("Vetor crescente levou " + ascTotal + "ms para executar");
            
            int[] descVector = generate.DescVector(100000); 
            
            long descStartTime = System.currentTimeMillis();
            int[] ordenedDescVector = mergeSort(descVector);
            long descEndTime = System.currentTimeMillis();
            long descTotal = descEndTime - descStartTime; 
            
            System.out.println("Vetor decrescente levou " + descTotal + "ms para executar"); 
            
            int[] randomVector = generate.RandomVector(100000);
            
            long randomStartTime = System.currentTimeMillis();
            int[] ordenedRandomVector = mergeSort(randomVector);
            long randomEndTime = System.currentTimeMillis();
            long randomTotal = randomEndTime - randomStartTime; 
            
            System.out.println("Vetor randomico levou " + randomTotal + "ms para executar");  
        }
    }
}
