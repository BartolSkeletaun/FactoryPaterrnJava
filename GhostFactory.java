
public class GhostFactory{
  
  public Ghost getGhost(String ghostType){
   
    if(ghostType == null){
     return null; 
    }
    else if(ghostType.equalsIgnoreCase("Vampire")){
      return new Vampire();
    }
    
     else if(ghostType.equalsIgnoreCase("Ghoul")){
      return new Ghoul();
    }
     
     return null;
  }
  
  
}