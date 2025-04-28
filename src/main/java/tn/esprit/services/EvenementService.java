package tn.esprit.services;

import tn.esprit.interfaces.IService;
import tn.esprit.models.Evenement;
import tn.esprit.utils.MyDataBase;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EvenementService implements IService<Evenement> {
    private Connection cnx;

    public EvenementService() {
        this.cnx = MyDataBase.getInstance().getCnx();
    }

    @Override
    public void add(Evenement evenement) {
        String sql = "INSERT INTO evenement (titre, date, lieu, description, capacite) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = cnx.prepareStatement(sql)) {
            ps.setString(1, evenement.getTitre());
            ps.setDate(2, evenement.getDate());
            ps.setString(3, evenement.getLieu());
            ps.setString(4, evenement.getDescription());
            ps.setInt(5, evenement.getCapacite());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Evenement> getAll() {
        List<Evenement> evenements = new ArrayList<>();
        String sql = "SELECT * FROM evenement";
        try (Statement stmt = cnx.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Evenement e = new Evenement(
                        rs.getInt("id"),
                        rs.getString("titre"),
                        rs.getDate("date"),
                        rs.getString("lieu"),
                        rs.getString("description"),
                        rs.getInt("capacite")
                );
                evenements.add(e);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return evenements;
    }

    @Override
    public void update(Evenement evenement) {
        String sql = "UPDATE evenement SET titre = ?, date = ?, lieu = ?, description = ?, capacite = ? WHERE id = ?";
        try (PreparedStatement ps = cnx.prepareStatement(sql)) {
            ps.setString(1, evenement.getTitre());
            ps.setDate(2, evenement.getDate());
            ps.setString(3, evenement.getLieu());
            ps.setString(4, evenement.getDescription());
            ps.setInt(5, evenement.getCapacite());
            ps.setInt(6, evenement.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void delete(Evenement evenement) {
        String sql = "DELETE FROM evenement WHERE id = ?";
        try (PreparedStatement ps = cnx.prepareStatement(sql)) {
            ps.setInt(1, evenement.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}