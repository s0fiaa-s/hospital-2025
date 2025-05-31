package control;

public class LoginControler {
    
// Datos del usuario temporal

    String usuario = "snsandoval";
    String contrasenna = "sandoval";

    public boolean validacionDatos (String EUsuario, String EContrasenna) {

        if (this.usuario.equals(EUsuario) && contrasenna.equals(EContrasenna)) {
            return true;
        } else {
            return false;
        }

}

}