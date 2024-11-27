import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class main {
    private static final String URL = "jdbc:mysql://localhost:3306/ap2";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver"); // Chargement du driver
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public class Livre {
        public static void afficherLivres() {
            try (Connection con = main.getConnection();
                 Statement stm = con.createStatement()) {
                
                String query = "SELECT * FROM livre";
                ResultSet res = stm.executeQuery(query);

                System.out.println("Liste des livres :");
                while (res.next()) {
                    String id = res.getString("id");
                    String titre = res.getString("titre");
                    String auteurId = res.getString("auteur_id");
                    String datePublication = res.getString("date_publication");
                    
                    System.out.println("ID: " + id + ", Titre: " + titre + ", Auteur ID: " + auteurId +
                                       ", Date de publication: " + datePublication);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public class Livre2 {
        public static void insererLivre(String titre, String auteurId, String datePublication) {
            try (Connection con = main.getConnection();
                 Statement stm = con.createStatement()) {

                String query = "INSERT INTO livre (titre, auteur_id, date_publication) VALUES ('" +
                               titre + "', '" + auteurId + "', '" + datePublication + "')";
                int rowsAffected = stm.executeUpdate(query);
                
                if (rowsAffected > 0) {
                    System.out.println("Livre ajouté avec succès !");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
