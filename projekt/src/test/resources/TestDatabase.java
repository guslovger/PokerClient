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
          String url = "jdbc:sqlite:lib/Player.sql";
          // create a connection to the database
          conn = DriverManager.getConnection(url);

          System.out.println("Connection to SQLite has been established.");

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

  private Connection connect2() {
        // SQLite connection string
        String url = "jdbc:sqlite:lib/Player.sql";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

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

  }
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
      connect();
      TestDatabase test = new TestDatabase();
      test.addPlayer(1, "Lucas");
      test.addPlayer(2, "Erik");
  }
}
