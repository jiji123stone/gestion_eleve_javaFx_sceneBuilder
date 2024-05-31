package Models;

public class Eleve {
private int id ;
private String nom;
private String prenom;
private String date;
private String niveau;
public Eleve(int id, String nom, String prenom, String date, String niveau) {
	super();
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.date = date;
	this.niveau = niveau;
}
public Eleve() {
	super();
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getNiveau() {
	return niveau;
}
public void setNiveau(String niveau) {
	this.niveau = niveau;
}
@Override
public String toString() {
	return "Eleve [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", date=" + date + ", niveau=" + niveau + "]";
}
 

}
