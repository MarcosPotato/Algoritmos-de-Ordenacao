package AlgoritmosDeOrdenacao;

import GenerateVector.GenerateVectors;

public class InsertionSort {
    public static int[] insertionSort(int[] vector) {
        int biggestValue;
        int auxiliar;
		for (int index = 1; index < vector.length; index++) {
			biggestValue = vector[index];
			auxiliar = index - 1;
			while ((auxiliar >= 0) && (biggestValue < vector[auxiliar])) {
				vector[auxiliar + 1] = vector[auxiliar];
				auxiliar--;
			}
			vector[auxiliar + 1] = biggestValue;
		}
        return vector; 
    }

    public static void main(String[] args) {
        GenerateVectors generate = new GenerateVectors();
        
        for(int i = 0; i < 5; i++){
            int[] ascVector = generate.AscVector(10);
            
            long ascStartTime = System.currentTimeMillis();
            int[] ordenedAscVector = insertionSort(ascVector);
            long ascEndTime = System.currentTimeMillis();
            long ascTotal = ascEndTime - ascStartTime;
            
            System.out.println("Vetor crescente levou " + ascTotal + "ms para executar");
            
            int[] descVector = generate.DescVector(100000); 
            
            long descStartTime = System.currentTimeMillis();
            int[] ordenedDescVector = insertionSort(descVector);
            long descEndTime = System.currentTimeMillis();
            long descTotal = descEndTime - descStartTime; 
            
            System.out.println("Vetor decrescente levou " + descTotal + "ms para executar"); 
            
            int[] randomVector = generate.RandomVector(100000);
            
            long randomStartTime = System.currentTimeMillis();
            int[] ordenedRandomVector = insertionSort(randomVector);
            long randomEndTime = System.currentTimeMillis();
            long randomTotal = randomEndTime - randomStartTime; 
            
            System.out.println("Vetor randomico levou " + randomTotal + "ms para executar");   
        }
    }
}
