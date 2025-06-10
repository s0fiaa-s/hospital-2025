package control;

public class LoginControler {
    
// Datos del usuario temporal

String[][] credenciales = {
    {"snsandoval", "sandoval"},
    {"cbarrondo", "barrondo"},
    {"pmanzilla", "manzilla"},
    {"dtaguite", "taguite"},
    {"jgomez", "gomez"},
    {"kosorio", "osorio"},
    {"acanel", "canel"},
    {"jrodas", "rodas"},
    {"sjimnez", "jimnez"},
    {"jpereira", "pereira"}
};

    public boolean validacionDatos (String EUsuario, String EContrasenna) {

        boolean res = false;

    for (int i = 0; i < credenciales.length; i++) {
        
        if (credenciales[i][0].equals(EUsuario) && credenciales[i][1].equals(EContrasenna)) {
            res = true;
        }
}

            return res;
}

}