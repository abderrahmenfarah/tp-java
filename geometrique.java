class forme {
    String nom; int couleur;
    static int nbObj = 0;
    void show(){
        System.out.println (nom+String.valueOf(couleur));
    }
public forme( String nom, int couleur) {
        this.nom = nom;
        this.couleur = couleur;
        nbrObj ++;
}
}
class Cercle extends forme{
    float r;

    public Cercle( String nom, int couleur, float r) {
        super( nom, couleur);
        this.r = r;
    }
}
class Rect extends forme{
    float L,l;

    public Rect( String nom, int couleur, float L,l) {
        super( nom, couleur);
        this.L = L;
        this.l = l;
    }
}
class Tiangle extends forme{
    float b,h;

    public Etudiant( String nom, int couleur, float b,h) {
        super( nom, couleur);
        this.b = b;
        this.h = h;
    }







public class geometrique{