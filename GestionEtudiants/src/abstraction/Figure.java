package abstraction;


	abstract public class Figure {
		private String nom;
		public Figure (String nom) //constructeur de l objet courant (nom)
		{
			 this.nom=nom; 
		}
		abstract public  double aire ( ) ;
		
		public void quiSuisJe ( )   //polymorphisme
		{
			System.out.println ( " Je   suis  un " + this.nom) ;
		 }
	}


