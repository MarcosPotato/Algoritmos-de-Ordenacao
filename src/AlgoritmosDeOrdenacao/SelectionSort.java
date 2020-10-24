package AlgoritmosDeOrdenacao;

import GenerateVector.GenerateVectors;

public class SelectionSort {
    public static int[] selectionSort(int[] vector) {
        
        int lowestValue = 0;
        int lowestIndex = 0;

		for (int index = 0; index < vector.length - 1; index++) {
			lowestIndex = index;
			for (int auxiliar = index + 1; auxiliar < vector.length; auxiliar++)
				if (vector[auxiliar] < vector[lowestIndex])
					lowestIndex = auxiliar;
			lowestValue = vector[lowestIndex];
			vector[lowestIndex] = vector[index];
			vector[index] = lowestValue;
		}
        
        return vector;
    }

    public static void main(String[] args) {
        GenerateVectors generate = new GenerateVectors();
        
        for(int i = 0; i < 5; i++){
            int[] ascVector = generate.AscVector(100000);
            
            long ascStartTime = System.currentTimeMillis();
            int[] ordenedAscVector = selectionSort(ascVector);
            long ascEndTime = System.currentTimeMillis();
            long ascTotal = ascEndTime - ascStartTime;
            
            System.out.println("Vetor crescente levou " + ascTotal + "ms para executar");
            
            int[] descVector = generate.DescVector(100000); 
            
            long descStartTime = System.currentTimeMillis();
            int[] ordenedDescVector = selectionSort(descVector);
            long descEndTime = System.currentTimeMillis();
            long descTotal = descEndTime - descStartTime; 
            
            System.out.println("Vetor decrescente levou " + descTotal + "ms para executar"); 
            
            int[] randomVector = generate.RandomVector(100000);
            
            long randomStartTime = System.currentTimeMillis();
            int[] ordenedRandomVector = selectionSort(randomVector);
            long randomEndTime = System.currentTimeMillis();
            long randomTotal = randomEndTime - randomStartTime; 
            
            System.out.println("Vetor randomico levou " + randomTotal + "ms para executar");  
        }

    }
}
