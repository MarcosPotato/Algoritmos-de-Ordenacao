package AlgoritmosDeOrdenacao;

import GenerateVector.GenerateVectors;

public class ShellSort {
    public static int[] shellSort(int[] vector) {
        int biggestValue;
        int auxiliar;
        int half = 1;

		do{
			half = 3 * half + 1;
        }while (half < vector.length);
        
		do {
			half /= 3;
			for (int index = half; index < vector.length; index++) {
				biggestValue = vector[index];
				auxiliar = index - half;
				while (auxiliar >= 0 && biggestValue < vector[auxiliar]) {
					vector[auxiliar + half] = vector[auxiliar];
					auxiliar -= half;
				}
				vector[auxiliar + half] = biggestValue;
			}
        } while (half > 1);
        
        return vector; 
    }

    public static void main(String[] args) {
        GenerateVectors generate = new GenerateVectors();

        for(int i = 0; i < 5; i++){
            int[] ascVector = generate.AscVector(100000);
            
            long ascStartTime = System.currentTimeMillis();
            int[] ordenedAscVector = shellSort(ascVector);
            long ascEndTime = System.currentTimeMillis();
            long ascTotal = ascEndTime - ascStartTime;
            
            System.out.println("Vetor crescente levou " + ascTotal + "ms para executar");
            
            int[] descVector = generate.DescVector(100000); 
            
            long descStartTime = System.currentTimeMillis();
            int[] ordenedDescVector = shellSort(descVector);
            long descEndTime = System.currentTimeMillis();
            long descTotal = descEndTime - descStartTime; 
            
            System.out.println("Vetor decrescente levou " + descTotal + "ms para executar"); 
            
            int[] randomVector = generate.RandomVector(100000);
            
            long randomStartTime = System.currentTimeMillis();
            int[] ordenedRandomVector = shellSort(randomVector);
            long randomEndTime = System.currentTimeMillis();
            long randomTotal = randomEndTime - randomStartTime; 
            
            System.out.println("Vetor randomico levou " + randomTotal + "ms para executar");  
        }
    }
}
