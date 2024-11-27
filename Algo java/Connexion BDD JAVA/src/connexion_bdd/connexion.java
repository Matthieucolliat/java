package connexion_bdd;

import java.sql.*;

public class connexion {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.jdbc.Driver");


            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/connexionbddjava", "root", "root");


            Statement stm = con.createStatement();
            
            String query = "INSERT INTO students (nom, prenom, dateN, email) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1, "Robert");
            pstmt.setString(2, "Smith");
            pstmt.setString(3, "2000-05-15");
            pstmt.setString(4, "robert@gmail.com");
            pstmt.executeUpdate();


            ResultSet res = stm.executeQuery("SELECT * FROM students");


            while (res.next()) {
                int id = res.getInt(1);
                String nom = res.getString(2);
                String prenom = res.getString(3);
                String dateN = res.getString(4);
                String email = res.getString(5);

                System.out.println(id + " | " + nom + " | " + prenom + " | " + dateN + " | " + email);
            }

            res.close();
            stm.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
