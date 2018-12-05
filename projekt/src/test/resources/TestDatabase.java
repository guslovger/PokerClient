package src.test.resources;

import java.sql.*;

public class TestDatabase {

   /**
   * Connect to a sample database
   */
   public static void connect() {
     Connection conn = null;
     try {
       // db parameters
       String url = "jdbc:sqlite:lib/PokerDatabase.db";
       // create a connection to the database
       conn = DriverManager.getConnection(url);
       System.out.println("Connection to SQLite has been established.");

       String query = "SELECT * FROM players";
       Statement st = conn.createStatement();
       ResultSet rs = st.executeQuery(query);

       while (rs.next()) {
         int id = rs.getInt("id");
         String name = rs.getString("Player_NAME");
         System.out.println(id + " | " + name);
       }
       st.close();
     } catch (SQLException e) {
       System.out.println(e.getMessage());
     } finally {
       try {
         if (conn != null) {
           conn.close();
         }
       } catch (SQLException ex) {
         System.out.println(ex.getMessage());
       }
     }
   }

  public static void printPlayers() {
    try (Connection conn = connect2()){
      System.out.println("Sucess");
      String query = "SELECT * FROM players";
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery(query);

      while (rs.next()) {
        int id = rs.getInt("id");
        String name = rs.getString("Player_NAME");
        System.out.println(id + " | " + name);
      }
      st.close();
    } catch (SQLException e){
      System.err.println("SQL problem: " + e.getMessage());
    }
  }

  public static void addPlayer (String name){
    String sql = "INSERT INTO players(Player_NAME) VALUES (?)";
    //String lastPlayerID = "SELECT Player_ID FROM players WHERE Player_ID = Max(Player_ID)";
    try (Connection conn = connect2()){
      //Statement st = conn.createStatement();
      PreparedStatement ps = conn.prepareStatement(sql);
      ps.setString(1, name);
      ps.executeUpdate();
    } catch (SQLException e) {
      System.err.println("Problem: " + e.getMessage());
    }
  }





  private static Connection connect2() {
        // SQLite connection string
        String url = "jdbc:sqlite:lib/PokerDatabase.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
/*
  public void addPlayer(int id, String name){
    String sql = "INSERT INTO player(ID,NAME) VALUES(?,?)";

    try (Connection conn = this.connect2();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

  }/*
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
      printPlayers();
      String kalle = "Kalle";
      addPlayer(kalle);
      printPlayers();
      //TestDatabase test = new TestDatabase();
      //test.addPlayer(1, "Lucas");
      //test.addPlayer(2, "Erik");
  }
}
