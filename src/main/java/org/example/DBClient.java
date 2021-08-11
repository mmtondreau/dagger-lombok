package org.example;

public class DBClient {
  private final String region;

  /**
   * Creates a db client to *insert-third-party-db*
   * @param region region for db client to connect
   */
  public DBClient(String region) {
    this.region = region;
  }

  /**
   * Inserts a message into a DB
   * @return ture on successful insert else false
   */
  public boolean insert(String message) throws DBException {
    // pretend were inserting into a real db
    return true;
  }
}
