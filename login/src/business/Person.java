package business;

/**
 * Clase Person: está clase se utiliza para almacenar todos los datos de la
 * persona (tanto personales como laborales)
 * 
 * @author Alan McLure Alarcón
 * @version 21/03/2023
 */
public class Person {

	/**
	 * codigo (tipo String): en el que guardamos el código de la persona
	 */
	private String codigo;
	/**
	 * nombre (tipo String): en el que guardamos el nombre de la persona
	 */
	private String nombre;
	/**
	 * pais (tipo String): en el que guardamos el país de nacimiento de la persona
	 */
	private String pais;
	/**
	 * fechaNacimiento (tipo String): en el que guardamos la fecha de nacimiento de
	 * la persona
	 */
	private String fechaNacimiento;
	/**
	 * telefono (tipo String): en el que guardamos el teléfono de la persona
	 */
	private String telefono;
	/**
	 * email (tipo String): en el que guardamos el email de la persona
	 */
	private String email;
	/**
	 * numeroSS (tipo String): en el que guardamos el número de la seguridad social
	 * de la persona
	 */
	private String numeroSS;
	/**
	 * numCuentaBancaria (tipo String): en el que guardamos el número de la cuenta
	 * bancaria de la persona
	 */
	private String numCuentaBancaria;
	/**
	 * fechaIncorporacion (tipo String): en el que guardamos la fecha en la que se
	 * incorporó/a la persona en el trabajo
	 */
	private String fechaIncorporacion;
	/**
	 * departamento (tipo String): en el que guardamos el departamento en el que
	 * trabaja la persona
	 */
	private String departamento;
	/**
	 * imageTxt (tipo String): en el que guardamos la ruta de la foto de la persona
	 */
	private String imageTxt;
	/**
	 * NumPerfiles (tipo int): en el que guardamos el número de perfiles totales. Es
	 * estático para todas las personas
	 */
	private static int NumPerfiles = 0;
	/**
	 * sueldo (tipo int): en el que guardamos el sueldo de la persona
	 */
	private int sueldo;

//Full face photos and comparable images
//Any unique identifying number, characteristic or code

	/**
	 * Constructor: vacío, al crear un objeto vacío se incrementa el número de
	 * perfiles
	 */
	public Person() {
		this.NumPerfiles++;
	}

	/**
	 * Constructor: al que le pasamos en todos los parametros los datos de la
	 * persona. También se incrementa el número de perfiles
	 * 
	 * @param nombre             (tipo String) que guarda el nombre de la persona
	 * @param pais               (tipo String) que guarda el país de nacimiento de
	 *                           la persona
	 * @param fechaNacimiento    (tipo String) que guarda la fecha de nacimiento de
	 *                           la persona
	 * @param telefono           (tipo String) que guarda el teléfono de la persona
	 * @param email              (tipo String) que guarda el email de la persona
	 * @param numeroSS           (tipo String) que guarda el número de la seguridad
	 *                           social de la persona
	 * @param numCuentaBancaria  (tipo String) que guarda el número de la cuenta
	 *                           bancaria de la persona
	 * @param fechaIncorporacion (tipo String) que guarda la fecha en la que se
	 *                           incorporó/a la persona en el trabajo
	 * @param departamento       (tipo String) que guarda el departamento en el que
	 *                           trabaja la persona
	 * @param imageTxt           (tipo String) que guarda la ruta de la foto de la
	 *                           persona
	 * @param sueldo             (tipo int) que guarda el sueldo de la persona
	 */
	public Person(String nombre, String pais, String fechaNacimiento, String telefono, String email, String numeroSS,
			String numCuentaBancaria, String fechaIncorporacion, String departamento, String imageTxt, int sueldo) {
		this.codigo = String.valueOf(this.NumPerfiles);
		this.nombre = nombre;
		this.pais = pais;
		this.fechaNacimiento = fechaNacimiento;
		this.telefono = telefono;
		this.email = email;
		this.numeroSS = numeroSS;
		this.numCuentaBancaria = numCuentaBancaria;
		this.fechaIncorporacion = fechaIncorporacion;
		this.departamento = departamento;
		this.imageTxt = imageTxt;
		this.sueldo = sueldo;
		this.NumPerfiles++;
	}

	/**
	 * Getter: devuelve el código de la persona
	 * 
	 * @return codigo (tipo String)
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Setter: cambia el valor de codigo por el pasado por parametro
	 * 
	 * @param codigo (tipo String) el código de la persona
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Getter: devuelve el nombre de la persona
	 * 
	 * @return nombre (tipo String)
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter: cambia el valor de nombre por el pasado por parametro
	 * 
	 * @param nombre (tipo String) el nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter: devuelve el país de la persona
	 * 
	 * @return pais (tipo String)
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * Setter: cambia el valor de pais por el pasado por parametro
	 * 
	 * @param pais (tipo String) el país de la persona
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * Getter: devuelve la fecha de nacimiento de la persona
	 * 
	 * @return fechaNacimiento (tipo String)
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Setter: cambia el valor de fechaNacimiento por el pasado por parametro
	 * 
	 * @param fechaNacimiento (tipo String) la fecha de nacimiento de la persona
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Getter: devuelve el teléfono de la persona
	 * 
	 * @return telefono (tipo String)
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * Setter: cambia el valor de telefono por el pasado por parametro
	 * 
	 * @param telefono (tipo String) el teléfono de la persona
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * Getter: devuelve el email de la persona
	 * 
	 * @return email (tipo String)
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Setter: cambia el valor de email por el pasado por parametro
	 * 
	 * @param email (tipo String) el email de la persona
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Getter: devuelve el número de la seguridad social de la persona
	 * 
	 * @return numeroSS (tipo String)
	 */
	public String getNumeroSS() {
		return numeroSS;
	}

	/**
	 * Setter: cambia el valor de numeroSS por el pasado por parametro
	 * 
	 * @param numeroSS (tipo String) el número de la seguridad social de la persona
	 */
	public void setNumeroSS(String numeroSS) {
		this.numeroSS = numeroSS;
	}

	/**
	 * Getter: devuelve el número de la cuenta bancaria de la persona
	 * 
	 * @return numCuentaBancaria (tipo String)
	 */
	public String getNumCuentaBancaria() {
		return numCuentaBancaria;
	}

	/**
	 * Setter: cambia el valor de numCuentaBancaria por el pasado por parametro
	 * 
	 * @param numCuentaBancaria (tipo String) el número de la cuenta bancaria de la
	 *                          persona
	 */
	public void setNumCuentaBancaria(String numCuentaBancaria) {
		this.numCuentaBancaria = numCuentaBancaria;
	}

	/**
	 * Getter: devuelve la fecha de incorporación de la persona
	 * 
	 * @return fechaIncorporacion (tipo String)
	 */
	public String getFechaIncorporacion() {
		return fechaIncorporacion;
	}

	/**
	 * Setter: cambia el valor de fechaIncorporacion por el pasado por parametro
	 * 
	 * @param fechaIncorporacion (tipo String) la fecha de incoporación de la
	 *                           persona
	 */
	public void setFechaIncorporacion(String fechaIncorporacion) {
		this.fechaIncorporacion = fechaIncorporacion;
	}

	/**
	 * Getter: devuelve el departamento de la persona
	 * 
	 * @return departamento (tipo String)
	 */
	public String getDepartamento() {
		return departamento;
	}

	/**
	 * Setter: cambia el valor de departamento por el pasado por parametro
	 * 
	 * @param departamento (tipo String) el departamento en el que trabaja la
	 *                     persona
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	/**
	 * Getter: devuelve la ruta de la imagen de la persona
	 * 
	 * @return imageTxt (tipo String)
	 */
	public String getImagetxt() {
		return imageTxt;
	}

	/**
	 * Setter: cambia el valor de iamgeTxt por el pasado por parametro
	 * 
	 * @param imageTxt (tipo String) la ruta de la imagen de la persona
	 */
	public void setImageTxt(String imageTxt) {
		this.imageTxt = imageTxt;
	}

	/**
	 * Getter: devuelve el número de perfiles
	 * 
	 * @return numPerfiles (tipo int)
	 */
	public int getNumPerfiles() {
		return NumPerfiles;
	}

	/**
	 * Setter: cambia el valor de numPerfiles por el pasado por parametro
	 * 
	 * @param NumPerfiles (tipo int) el número de perfiles
	 */
	public void setNumPerfiles(int NumPerfiles) {
		this.NumPerfiles = NumPerfiles;
	}

	/**
	 * Getter: devuelve el sueldo
	 * 
	 * @return sueldo (tipo int)
	 */
	public int getSueldo() {
		return sueldo;
	}

	/**
	 * Setter: cambia el valor de sueldo por el pasado por parametro
	 * 
	 * @param sueldo (tipo int) el sueldo de la persona
	 */
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
}
