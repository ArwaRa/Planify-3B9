package tn.esprit.models;


import java.sql.Date;

public class Reservation {
    private int id;
    private int evenementId;
    private int utilisateurId;
    private Date dateReservation;
    private String statut;

    public Reservation() {}

    public Reservation(int id, int evenementId, int utilisateurId, Date dateReservation, String statut) {
        this.id = id;
        this.evenementId = evenementId;
        this.utilisateurId = utilisateurId;
        this.dateReservation = dateReservation;
        this.statut = statut;
    }

    public Reservation(int evenementId, int utilisateurId, Date dateReservation, String statut) {
        this.evenementId = evenementId;
        this.utilisateurId = utilisateurId;
        this.dateReservation = dateReservation;
        this.statut = statut;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getEvenementId() { return evenementId; }
    public void setEvenementId(int evenementId) { this.evenementId = evenementId; }

    public int getUtilisateurId() { return utilisateurId; }
    public void setUtilisateurId(int utilisateurId) { this.utilisateurId = utilisateurId; }

    public Date getDateReservation() { return dateReservation; }
    public void setDateReservation(Date dateReservation) { this.dateReservation = dateReservation; }

    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }

    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", evenementId=" + evenementId +
                ", utilisateurId=" + utilisateurId +
                ", dateReservation=" + dateReservation +
                ", statut='" + statut + '\'' +
                "}\n";
    }
}
