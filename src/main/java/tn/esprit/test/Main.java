package tn.esprit.test;

import tn.esprit.models.Evenement;
import tn.esprit.models.Reservation;
import tn.esprit.services.EvenementService;
import tn.esprit.services.ReservationService;
import java.sql.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // ---------------------------------------------------
        // 1) EVENEMENT SERVICE
        // ---------------------------------------------------
        EvenementService eventService = new EvenementService();
//
//        System.out.println("=== TEST EvenementService ===");
//   // CREATE: This test adds a new event to the database
//        Evenement newEvent = new Evenement(
//                "Art Exhibition",
//                Date.valueOf("2025-08-01"),
//                "Tunis",
//                "A showcase of local art",
//                150
//        );
//        eventService.add(newEvent);
//        System.out.println("New event added successfully!");
//
//        // READ ALL: This test shows all events in the database
//            List<Evenement> allEvents = eventService.getAll();
//            System.out.println("-- All Events --");
//            for (Evenement e : allEvents) {
//                System.out.println(e);
//            }
//
// UPDATE: Simple test to update an event by ID
//        Evenement updatedEvent = new Evenement();
//        updatedEvent.setId(5);
//        updatedEvent.setTitre("emen");
//        updatedEvent.setLieu("sousse");
//        updatedEvent.setDescription("3b9");
//        updatedEvent.setDate(Date.valueOf("2025-09-01"));
//        updatedEvent.setCapacite(99);
//
//        eventService.update(updatedEvent);
//        System.out.println("Event updated successfully: " + updatedEvent);

//
//            // DELETE: This test removes the event we updated
//        Evenement toDelete = new Evenement();
//        toDelete.setId(5); // Replace with the ID of the event you want to delete
//        eventService.delete(toDelete);
//        System.out.println("Event deleted successfully ");

//
//        // ---------------------------------------------------
//        // 2) RESERVATION SERVICE
//        // ---------------------------------------------------
            ReservationService reservationService = new ReservationService();

            // CREATE: This test adds a new reservation for the event

//        int eventId = 4;
//        Reservation newReservation = new Reservation(
//                eventId,
//                1, // utilisateur_id (assuming user with ID 1 exists)
//                Date.valueOf("2025-04-23"),
//                "CONFIRMED"
//        );
//        reservationService.add(newReservation);
//        System.out.println("New reservation added successfully!");

//        // READ ALL: This test shows all reservations in the database
//        List<Reservation> allReservations = reservationService.getAll();
//        System.out.println("-- All Reservations --");
//        for (Reservation r : allReservations) {
//            System.out.println(r);
//        }
//
//        // UPDATE: This test changes the last reservation we added

//        Reservation updatedReservation = new Reservation();
//        updatedReservation.setId(3); // existing reservation ID
//        updatedReservation.setEvenementId(3);
//        updatedReservation.setUtilisateurId(1);
//        updatedReservation.setDateReservation(Date.valueOf("2026-04-23"));
//        updatedReservation.setStatut("CANCELLED");
//
//        reservationService.update(updatedReservation);
//        System.out.println("Reservation updated successfully: " + updatedReservation);

//delete
// Reservation reservationToDelete = new Reservation();
//        reservationToDelete.setId(3);
//
//        reservationService.delete(reservationToDelete);
//        System.out.println("Deleted reservation with ID " + reservationToDelete.getId());


        }
    }