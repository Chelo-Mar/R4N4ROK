
/**
 * Write a description of class docente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class docente extends administracion
{
    private String profesion;
    private String academia;
    
    public docente(){
  }
    
     public void setProfesion(String profesion){
     this.profesion=profesion;
  }
  public String getProfesion(){
    return profesion;
    }
    
  public void setAcademia(String academia){
    this.academia=academia;
    
  }
  public String getAcademia(){
    return academia;
    }
    
    public void imprimirInformacion(){
      super.imprimirInformacion();
      System.out.println("profesion  :"+profesion);
      System.out.println("academia  :"+academia);
      System.out.println(".............");
    }
}
