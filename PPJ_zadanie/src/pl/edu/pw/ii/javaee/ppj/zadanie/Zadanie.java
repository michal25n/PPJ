package pl.edu.pw.ii.javaee.ppj.zadanie;

import java.util.Random;

public class Zadanie {
	//Sortowanie b¹belkowe
	void bubbleSort(int[] x) {
	for (int j = 0; j < x.length - 1; j++) {
	for (int i = 0; i < x.length - 1; i++) {
	if (x[i] > x[i + 1]) {
	//swap the values
	int temp = x[i];
	x[i] = x[i + 1];
	x[i + 1] = temp;
	}
	}
	}
	}
	public static void main(String[] args) {
		
		int[] tab = new int[100];
		Random randomGen = new Random();
		System.out.println("Elementy wygenerowane losowo:");
		for (int i = 0; i < tab.length; i++) {
			tab[i] = randomGen.nextInt(10);
			System.out.print(tab[i]);
		}

int tabMin = tab[0];
for (int i : tab) {
	if (i < tabMin) {
		tabMin = i;
               }
	
}
System.out.println("\nNajmniejsza wartoœæ tablicy:" + tabMin);


	int tabMax = tab[0];
	for (int i : tab) {
		if (i > tabMax) {
			tabMax = i;
	               }
		
	}
	System.out.println("\nNajwieksza wartoœæ tablicy:" + tabMax);

	int tabSuma = 0;
	for (int i : tab) {
		
		tabSuma += i;
	}
	System.out.println("\nSuma elementów: " + tabSuma);
	
	// Sortowanie b¹belkowe
			System.out.println("\nSortowanie kolejnoœci malej¹cej:");
			Zadanie sortowanie = new Zadanie();
			sortowanie.bubbleSort(tab);

			for (int i = tab.length - 1; i >= 0; i--) {
				System.out.print(tab[i]);
	}
	}
}
