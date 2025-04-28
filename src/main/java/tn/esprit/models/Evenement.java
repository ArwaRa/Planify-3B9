package tn.esprit.models;

import java.sql.Date;

public class Evenement {
    private int id;
    private String titre;
    private Date date;
    private String lieu;
    private String description;
    private int capacite;

    public Evenement() {}

    public Evenement(int id, String titre, Date date, String lieu, String description, int capacite) {
        this.id = id;
        this.titre = titre;
        this.date = date;
        this.lieu = lieu;
        this.description = description;
        this.capacite = capacite;
    }

    public Evenement(String titre, Date date, String lieu, String description, int capacite) {
        this.titre = titre;
        this.date = date;
        this.lieu = lieu;
        this.description = description;
        this.capacite = capacite;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public String getLieu() { return lieu; }
    public void setLieu(String lieu) { this.lieu = lieu; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getCapacite() { return capacite; }
    public void setCapacite(int capacite) { this.capacite = capacite; }

    @Override
    public String toString() {
        return "Evenement{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", date=" + date +
                ", lieu='" + lieu + '\'' +
                ", description='" + description + '\'' +
                ", capacite=" + capacite +
                "}\n";
    }
}