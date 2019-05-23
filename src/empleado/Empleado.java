package empleado;

public abstract class Empleado {

    String nombre;
    int edad;
    String sexo;
    int sueldo;

    /**
     * Constructor por defecto de la SuperClase Empleado
     * 
     */
    public Empleado() {

    }

    /**
     * Constructor definido de la SuperClase Empleado
     *
     * @param nombre corresponde al nombre del Empleado
     * @param edad corresponde al nombre del Empleado
     * @param sexo corresponde al nombre del Empleado
     * @param sueldo corresponde al nombre del Empleado
     */
    public Empleado(String nombre, int edad, String sexo, int sueldo) {

        setNombre(nombre);
        setEdad(edad);
        setSexo(sexo);
        setSueldo(sueldo);

    }

    /**
     * Le da valor al atributo nombre
     *
     * @param n el valor que recibe el nombre
     */
    public void setNombre(String n) {
    	
        nombre = n;

    }

    /**
     * Devuelve el atributo nombre
     *
     * @return retorna el nombre
     */
    public String getNombre() {

        return nombre;

    }

    /**
     * Le da valor al atributo edad
     *
     * @param e valor que recibe la edad
     */
    public void setEdad(int e) {

        edad = e;

    }

    /**
     * Devuelve el atributo edad
     *
     * @return retorna el edad
     */
    public int getEdad() {

        return edad;

    }

    /**
     * Le da valor al atributo sexo
     *
     * @param s corresponde al sexo del empleado
     */
    public void setSexo(String s) {

        sexo = s;

    }

    /**
     * Devuelve el atributo sexo
     *
     * @return retorna el sexo
     */
    public String getSexo() {

        return sexo;

    }

    /**
     * Le da valor al atributo sueldo
     *
     * @param s corresponde al salario base del empleado
     */
    public void setSueldo(int s) {

        sueldo = s;

    }

    /**
     * Devuelve el atributo sueldo
     * 
     * @return retorna el sueldo
     */
    public int getSueldo() {

        return sueldo;

    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public abstract String toString();

    /**
     * Definimos las diferentes formas en las que cobraran en las subclases
     *
     * @return retorna el salario completa
     */
    public abstract float cobrar();

}