package application;

import javafx.beans.property.SimpleStringProperty;

public class Person {
private SimpleStringProperty nom;
private SimpleStringProperty prenom;
private SimpleStringProperty adresse;
public Person(String nom, String prenom, String adresse) {
	super();
	this.nom =new SimpleStringProperty( nom);
	this.prenom = new SimpleStringProperty( prenom);
	this.adresse = new SimpleStringProperty( adresse);
}
public SimpleStringProperty getNom() {
	return nom;
}
public void setNom(SimpleStringProperty nom) {
	this.nom = nom;
}
public SimpleStringProperty getPrenom() {
	return prenom;
}
public void setPrenom(SimpleStringProperty prenom) {
	this.prenom = prenom;
}
public SimpleStringProperty getAdresse() {
	return adresse;
}
public void setAdresse(SimpleStringProperty adresse) {
	this.adresse = adresse;
}
@Override
public String toString() {
	return "person [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
}


}
