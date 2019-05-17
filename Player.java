package fcu.oop;

public class Player {
  /**
   * Player
   * @param args .
   */
  private String playerName;
  private Pokemon[] pokemons;
  private int level = 1;
  
  
  public Player(String playerName) {
    this.playerName = playerName;
  }
  
  //accessor & mutator
  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }
  
  public String getPlayerName() {
    return this.playerName;
  }
  
  public void setPokemons(Pokemon[] pokemons) {
    this.pokemons = pokemons;
  }
  
  public Pokemon[] getPokemons() {
    return pokemons;
  }
  
  public void setLevel(int level) {
    this.level = level;
  }
  
  public int getLevel() {
    return level;
  }
}
