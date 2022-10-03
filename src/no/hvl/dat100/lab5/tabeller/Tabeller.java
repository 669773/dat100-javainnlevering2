package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		int t;

		for (t = 0; t < tabell.length; t++) {

			System.out.println(tabell[t]);

		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String streng = "[";

		for (int i = 0; i < tabell.length; i++) {
			streng += tabell[i];

			if (i != tabell.length - 1) {
				streng += ",";
			}
		}

		streng += "]";

		return streng;
	}	

	// c)
	public static int summer(int[] tabell) {
		
		int sum = 0;
		int t = 0;
		
		while (t < tabell.length) {
			sum += tabell[t];
		}
		return sum;
		
	}
	
	/* Utvidet for-løkke
	 * 
	 * int sum = 0;
	 *
	 * for(int t : tabell) {
	 *
	 *	sum += t;
	 *
	 * }
	 * return sum;
	 */

	/* Vanlig for-løkke:
	 *
	 * int sum = 0;
	 *
	 *  for(int t = 0; t < tabell.length; t++) {
	 *	
	 *	sum += tabell[t];
	 * } 
	 *	return sum;
	 */

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet = false;
		int i = 0;

		while (i < tabell.length && (!funnet)) {

			if (tabell[i] == tall) {
				funnet = true;
			}
			i++;
		}

		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {

			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] reversTab = new int[tabell.length];
		int j = 0;

		for (int i = tabell.length - 1; i >= 0; i--) {
			reversTab[j] = tabell[i];
			j++;
		}
		return reversTab;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

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
	

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		// TODO
		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
