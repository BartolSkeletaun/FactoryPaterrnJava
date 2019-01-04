
public class FactoryPatternGhostDemo{
  
  public static void main(String[] args){
  
  GhostFactory ghostfactory = new GhostFactory();
  
  Ghost ghost1 = ghostfactory.getGhost("Vampire");
  
  ghost1.fight();
  
  
  Ghost ghost2 = ghostfactory.getGhost("Ghoul");
  
  ghost2.fight();
  
  }
}