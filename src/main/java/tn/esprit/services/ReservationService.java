package tn.esprit.services;

import tn.esprit.interfaces.IService;
import tn.esprit.models.Reservation;
import tn.esprit.utils.MyDataBase;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReservationService implements IService<Reservation> {
    private Connection cnx;

    public ReservationService() {
        this.cnx = MyDataBase.getInstance().getCnx();
    }

    @Override
    public void add(Reservation reservation) {
        String sql = "INSERT INTO reservation (evenement_id, utilisateur_id, date_reservation, statut) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = cnx.prepareStatement(sql)) {
            ps.setInt(1, reservation.getEvenementId());
            ps.setInt(2, reservation.getUtilisateurId());
            ps.setDate(3, reservation.getDateReservation());
            ps.setString(4, reservation.getStatut());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Reservation> getAll() {
        List<Reservation> reservations = new ArrayList<>();
        String sql = "SELECT * FROM reservation";
        try (Statement stmt = cnx.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Reservation r = new Reservation(
                        rs.getInt("id"),
                        rs.getInt("evenement_id"),
                        rs.getInt("utilisateur_id"),
                        rs.getDate("date_reservation"),
                        rs.getString("statut")
                );
                reservations.add(r);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return reservations;
    }

    @Override
    public void update(Reservation reservation) {
        String sql = "UPDATE reservation SET evenement_id = ?, utilisateur_id = ?, date_reservation = ?, statut = ? WHERE id = ?";
        try (PreparedStatement ps = cnx.prepareStatement(sql)) {
            ps.setInt(1, reservation.getEvenementId());
            ps.setInt(2, reservation.getUtilisateurId());
            ps.setDate(3, reservation.getDateReservation());
            ps.setString(4, reservation.getStatut());
            ps.setInt(5, reservation.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Reservation reservation) {
        String sql = "DELETE FROM reservation WHERE id = ?";
        try (PreparedStatement ps = cnx.prepareStatement(sql)) {
            ps.setInt(1, reservation.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}