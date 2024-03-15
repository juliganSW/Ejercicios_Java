
package excepcionpersonalizada;


class Helper {
    public Helper(){
    }


   public void validarPassword( String pass, String rpass)throws CustomException{
          if(!pass.equals(rpass)){ // Si pass no es igual a rpass
           throw new CustomException("los campos del password no coinciden");
}
          if(pass.length()<8 ){ 
           throw new CustomException("El password debe tener al menos 8 caracteres ");
}

   }
}


