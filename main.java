package com.cargaison.Cargaison;

public class main {
	public static void main(String[] args) {
	     try {
	         // Créer une cargaison routière
	         System.out.println("=== Test Cargaison Routière ===");
	         CargaisonRoutiere cr = new CargaisonRoutiere(100);
	         
	         // Ajouter des marchandises
	         cr.ajouterMarchandise(new Marchandise(1, 100, 200));
	         cr.ajouterMarchandise(new Marchandise(2, 150, 300));
	         cr.ajouterMarchandise(new Marchandise(3, 200, 400));
	         
	         // Afficher les informations
	         System.out.println("Marchandises de la cargaison routière:");
	         cr.afficherMarchandises();
	         System.out.println("Coût de la cargaison routière: " + cr.calculerCout());

	         // Créer une cargaison aérienne
	         System.out.println("\n=== Test Cargaison Aérienne ===");
	         CargaisonAerienne ca = new CargaisonAerienne(100);
	         
	         // Ajouter des marchandises
	         ca.ajouterMarchandise(new Marchandise(4, 50, 100));
	         ca.ajouterMarchandise(new Marchandise(5, 75, 150));
	         ca.ajouterMarchandise(new Marchandise(6, 100, 200));
	         
	         // Afficher les informations
	         System.out.println("Marchandises de la cargaison aérienne:");
	         ca.afficherMarchandises();
	         System.out.println("Coût de la cargaison aérienne: " + ca.calculerCout());

	     } catch (Exception e) {
	         System.out.println("Erreur: " + e.getMessage());
	     }
	 }
}
