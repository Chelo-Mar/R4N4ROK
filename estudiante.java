
/**
 * Write a description of class estudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class estudiante extends administracion
{
    private String carnet;
    private String carrera;
    
    public estudiante(){
  }
    
     public void setCarnet(String carnet){
     this.carnet=carnet;
  }
  public String getCarnet(){
    return carnet;
    }
    
  public void setCarrera(String carrera){
    this.carrera=carrera;
    
  }
  public String getCarrera(){
    return carrera;
    }
    
    public void imprimirInformacion(){
      super.imprimirInformacion();
      System.out.println("carnet  :"+carnet);
      System.out.println("carrera  :"+carrera);
      System.out.println(".............");
    }
}
