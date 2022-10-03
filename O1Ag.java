package no.hvl.dat100;

public class O1Ag {
	// Oppgave O1-A g)
	public static boolean erSortert (int[] tabell) {
		
		int j = 0;
		boolean sortert = true;
		
		while ( sortert && j < tabell.length - 1) {
			if (tabell[j] > tabell[j+1]) {
				sortert = false;
			}
			j++;
		}
		return sortert;
	}

	public static void main(String[] args) {
		int[] sortertTabell = {1, 7, 11, 21};
		int[] usortertTabell = {1, 11, 7, 21};
		
		System.out.println(erSortert(sortertTabell));
		System.out.println(erSortert(usortertTabell));
	}

}
