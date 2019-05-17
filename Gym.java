package fcu.oop;

import java.util.Random;

import fcu.oop.Player;
import fcu.oop.PokemonType;

public class Gym {
  
  /**
   * Gym
   */
  
  public static Player fight(Player... players) {
    int p1Point = 0;
    int p2Point = 0;
    int flag = 0;
    
    Pokemon[] pkms1;
    Pokemon[] pkms2;
    pkms1 = players[0].getPokemons();
    pkms2 = players[1].getPokemons();
    
    for (int i = 0; i < 3; i++) {
      Random ran = new Random();
      int rvalue = ran.nextInt(2);
      
      pkms1[i].getType(); // 3-round
      switch (pkms2[i].getType()) {
        case FIRE: // FIRE
          if (pkms1[i].getType() == pkms2[i].getType()) { // vs FIRE
            if (pkms1[i].getCp() > pkms2[i].getCp()) {
              p1Point += 1;
            } else if (pkms1[i].getCp() < pkms2[i].getCp()) {
              p2Point += 1;
            } else {
              switch (rvalue) {
                case 0:
                  p1Point += 1;
                  break;
                
                default:
                  p2Point += 1;
                  break;
              }
            }
          } else if (pkms1[i].getType().equals(PokemonType.GRASS)) { // vs GRASS
            p2Point += 1;
          } else { // vs WATER
            p1Point += 1;
          }
          break;
        
        case GRASS: // GRASS
          if (pkms1[i].getType() == pkms2[i].getType()) { // vs GRASS
            if (pkms1[i].getCp() > pkms2[i].getCp()) {
              p1Point += 1;
            } else if (pkms1[i].getCp() < pkms2[i].getCp()) {
              p2Point += 1;
            } else {
              switch (rvalue) {
                case 0:
                  p1Point += 1;
                  break;
                
                default:
                  p2Point += 1;
                  break;
              }
            }
          } else if (pkms1[i].getType().equals(PokemonType.WATER)) { // vs WATER
            p2Point += 1;
          } else { // vs FIRE
            p1Point += 1;
          }
          break;
        
        default: // WATER
          if (pkms1[i].getType() == pkms2[i].getType()) { // vs WATER
            if (pkms1[i].getCp() > pkms2[i].getCp()) {
              p1Point += 1;
            } else if (pkms1[i].getCp() < pkms2[i].getCp()) {
              p2Point += 1;
            } else {
              switch (rvalue) {
                case 0:
                  p1Point += 1;
                  break;
                
                default:
                  p2Point += 1;
                  break;
              }
            }
          } else if (pkms1[i].getType().equals(PokemonType.FIRE)) { // vs FIRE
            p2Point += 1;
          } else { // vs GRASS
            p1Point += 1;
          }
          break;
        
      }
      int lvplayer1 = players[0].getLevel();
      int lvplayer2 = players[1].getLevel();
      
      if (p1Point == 2) {
        lvplayer1 += 1;
        players[0].setLevel(lvplayer1);
        flag = 1;
      } else if (p2Point == 2) {
        lvplayer2 += 1;
        players[1].setLevel(lvplayer2);
      }
    }
    
    if (flag == 1) {
      System.out.printf("Winner is [%s], and his/her level becomes [%d].",
          players[0].getPlayerName(),
          players[0].getLevel());
      System.out.println();
      return players[0];
    }
    System.out.printf("Winner is [%s], and his/her level becomes [%d].",
        players[1].getPlayerName(),
        players[1].getLevel());
    System.out.println();
    return players[1];
    
  }
}
