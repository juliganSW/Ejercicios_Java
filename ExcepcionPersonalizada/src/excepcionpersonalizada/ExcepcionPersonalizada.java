

package excepcionpersonalizada;


public class ExcepcionPersonalizada {

    
    
    
    
    public static void main(String[] args) {
        
    String user, pass, rpass;
    user="juligan";
    pass= "12345678";
    rpass="123";
    
    Helper h = new Helper();
    
    try{
         h.validarPassword(pass, rpass);
    }catch (CustomException e){
          System.out.println("No se pudo registrar debido a: " + e.getMessage());
    
    }
    }
    
}
