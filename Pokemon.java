package fcu.oop;

public class Pokemon {
  /**
   * Pokemon
   * @param args .
   */
  private String name;
  private int cp;
  private PokemonType type;
  
  /**
   * Pokemon
   * constructor
   */
  
  public Pokemon(String name,PokemonType type,int cp) {
    this.name = name;
    this.cp = cp;
    this.type = type;
  }
  
  public String getName() {
    return this.name;
  }
  
  public PokemonType getType() {
    return this.type;
  }
  
  public void setCp(int cp) {
    this.cp = cp;
  }
  
  public int getCp() {
    return cp;
  }
  
}
