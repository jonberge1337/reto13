package empleado;

public abstract class Empleado {

    String nombre;
    int edad;
    String sexo;
    int sueldo;

    public Empleado() {

    }

    public Empleado(String nombre, int edad, String sexo, int sueldo, int jornada) {

        setNombre(nombre);
        setEdad(edad);
        setSexo(sexo);
        setSueldo(sueldo);

    }

    public void setNombre(String n) {

        nombre = n;

    }

    public String getNombre() {

        return nombre;

    }

    public void setEdad(int e) {

        edad = e;

    }

    public int getEdad() {

        return edad;

    }

    public void setSexo(String s) {

        sexo = s;

    }

    public String getSexo() {

        return sexo;

    }

    public void setSueldo(int s) {

        sueldo = s;

    }

    public int getSueldo() {

        return sueldo;

    }

    public void setJornadaa(int j) {

        jornada = j;

    }

    public int getJornada() {

        return jornada;

    }

    public abstract float cobrar();

}