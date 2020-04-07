package Password;

public class Password {
    private int longitudContrasena;
    private StringBuffer contrasena;

    public Password(){
        this.longitudContrasena = 8;
        this.contrasena = generarContrasena(longitudContrasena);
    }

    public Password(int longitudContrasena){
        this.longitudContrasena = longitudContrasena;
        this.contrasena = generarContrasena(longitudContrasena);
    }

    public StringBuffer generarContrasena(int longitudContrasena){
        StringBuffer contrasena = new StringBuffer("");

        while(contrasena.length() < longitudContrasena){
            int numeroAleatorio = (int) Math.floor(Math.random() * (122 - 9 + 1) + 9);
            if(numeroAleatorio >= 65 && numeroAleatorio <= 90){
                contrasena.append(mayuscula());
            }else if (numeroAleatorio >= 97 && numeroAleatorio <= 122){
                contrasena.append(minuscula());
            }else if (numeroAleatorio >= 0 && numeroAleatorio <= 9){
                contrasena.append(numero());
            }
        }
        return contrasena;
    }

    public boolean esFuerte(){
        int mayusculas = 0;
        int minusculas = 0;
        int numeros = 0;
        for (int i = 0; i < this.contrasena.length(); i++) {
            if(this.contrasena.charAt(i) >= 65 && this.contrasena.charAt(i) <= 90){
                mayusculas++;
            } else if (this.contrasena.charAt(i) >= 97 && this.contrasena.charAt(i) <= 122){
                minusculas++;

            } else if (this.contrasena.charAt(i) >= 0 && this.contrasena.charAt(i) <= 9){
                numeros++;

            }
            return false;
        }
        if(numeros >= 5 && minusculas >= 1 && mayusculas >= 2 ){
            return true;
        }
        return false;
    }


    public static char mayuscula(){
        return (char) Math.floor(Math.random()*(90 - 65 + 1) + 65);
    }

    public static char minuscula(){
        return (char) Math.floor(Math.random() * (122 - 97 + 1) + 97);
    }

    public static int numero(){
        return (int) Math.floor(Math.random() * (9 + 1));
    }

    public int getLongitudContrasena() {
        return longitudContrasena;
    }

    public void setLongitudContrasena(int longitudContrasena) {
        this.longitudContrasena = longitudContrasena;
    }


    public void setContrasena(StringBuffer contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Password{" +
                "longitudContrasena=" + longitudContrasena +
                ", contrasena=" + contrasena +
                '}';
    }
}
