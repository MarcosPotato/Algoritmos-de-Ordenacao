package AlgoritmosDeOrdenacao;

import GenerateVector.GenerateVectors;

public class QuickSort {
    private int leftMark = 0;
    private int rightMark = 0;

    private void particao(int left, int right, int vector[]) {
		int x, w;
		leftMark = left;
		rightMark = right;
		/* obt�m o pivectoro x */
		x = vector[(leftMark + rightMark) / 2];
		// System.out.println("pivectoro= " + x);
		do {
			while (x > vector[leftMark])
                leftMark++;

			while (x < vector[rightMark])
                rightMark--;
                
			if (leftMark <= rightMark) {
				w = vector[leftMark];
				vector[leftMark] = vector[rightMark];
				vector[rightMark] = w;
				leftMark++;
				rightMark--;
			}
		} while (leftMark <= rightMark);
	}

	/* Entra aqui o procedimento Particao */
	private void ordena(int left, int right, int vector[]) {
		particao(left, right, vector);
		if (left < rightMark)
			ordena(left, rightMark, vector);
		if (leftMark < right)
			ordena(leftMark, right, vector);
	}

	public void quickSort(int vector[]) {
		ordena(0, vector.length - 1, vector);
    }
    
    public static void main(String[] args) {
        GenerateVectors generate = new GenerateVectors();
        QuickSort method = new QuickSort();

        int[] ascVector = generate.AscVector(100000);
        
        long ascStartTime = System.currentTimeMillis();
        method.quickSort(ascVector);
        long ascEndTime = System.currentTimeMillis();
        long ascTotal = ascEndTime - ascStartTime;
        
        System.out.println("Vetor crescente levou " + ascTotal + "ms para executar");
        
        int[] descVector = generate.DescVector(100000); 
        
        long descStartTime = System.currentTimeMillis();
        method.quickSort(descVector);
        long descEndTime = System.currentTimeMillis();
        long descTotal = descEndTime - descStartTime; 
        
        System.out.println("Vetor decrescente levou " + descTotal + "ms para executar");  
        
        int[] randomVector = generate.RandomVector(100000);
        
        long randomStartTime = System.currentTimeMillis();
        method.quickSort(randomVector);
        long randomEndTime = System.currentTimeMillis();
        long randomTotal = randomEndTime - randomStartTime; 
        
        System.out.println("Vetor randomico levou " + randomTotal + "ms para executar");  
        
    }
}
