
public class Persona {
    private String nombre, apellidos,edad,fecha_nac,estado,lugar_nac,alergias,sexo,estadocivil;

    public Persona() {
    }

    public Persona(String nombre, String apellidos, String edad, String fecha_nac, String estado, String lugar_nac, String alergias, String sexo, String estadocivil) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.fecha_nac = fecha_nac;
        this.estado = estado;
        this.lugar_nac = lugar_nac;
        this.alergias = alergias;
        this.sexo = sexo;
        this.estadocivil = estadocivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLugar_nac() {
        return lugar_nac;
    }

    public void setLugar_nac(String lugar_nac) {
        this.lugar_nac = lugar_nac;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    
}
