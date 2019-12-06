package code;

public class EvaluateurNiveau {
	
	
	private static boolean estEntier( String valeur ) {
		try {
			Integer.valueOf(valeur);
		}
		catch( NumberFormatException e ) {
			return false;
		}
		return true;
	}
	
	private static boolean estDansBorne( int valeur , int min , int max ) {
		return ( valeur >= min && valeur <= max );
	}

	public static String evaluerNiveau(String cours, String examen) throws ExceptionValeurNonEntiere, ExceptionValeurHorsBorne {
		// TODO Auto-generated method stub
		if ( ! estEntier( cours )) {
			throw new ExceptionValeurNonEntiere();
		}
		if ( ! estEntier( examen )) {
			throw new ExceptionValeurNonEntiere();
		}
		// Les valeurs sont entieres 
		int iCours = Integer.valueOf( cours );
		if ( ! estDansBorne(iCours, 0 , 25 )) {
			throw new ExceptionValeurHorsBorne();
		}
		int iExamen = Integer.valueOf( examen );
		if ( ! estDansBorne(iExamen, 0 , 75 )) {
			throw new ExceptionValeurHorsBorne();
		}
		
		int somme = iCours + iExamen;
		
		if ( somme < 30 ) {
			return "D";
		} else if ( somme < 50 ) {
			return "C";
		} else if ( somme < 70 ) {
			return "B";
		}
		else return "A";
			
	}

}
