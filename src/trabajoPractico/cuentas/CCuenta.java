package trabajoPractico.cuentas;
/**
 * Clase CCuenta que simula la entidad de una cuenta de una persona que tiene nombre, numero de cuenta, saldo y 
 * interes aplicado a la cuenta. 
 * */
public class CCuenta {
  // ATM
  // ATRIBUTOS
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
    // CONSTRUCTOR VACIO
    public CCuenta()
    {   
    }
    // CONSTRUCTOR: 
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés = tipo;
    }
    
    //GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getTipoInterés() {
		return tipoInterés;
	}
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
	  
	/**
	 * El metodo estado retorna el atributo saldo.
	 * @return saldo
	 * */
    public double estado()   // que hace? -> return el saldo de la cuenta (retorna el valor double de un atributo )
    {
        return saldo;
    }
    /**
     * El metodo ingresar al recibir una cantidad, si la misma es inferior a 0 lanzara una excepcion. 
     * Si la cantidad es igual o superior a 0, incrementara el saldo con la cantidad. 
     * @param cantidad
     * 
     * */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
        {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }
    /**
     * El metodo retira una cantidad, si la misma es inferior o igual a 0 lanzara un excepcion.
     * si el estado es menor a la cantidad, lanzara una excepcion
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
        {
            throw new Exception ("No se puede retirar una cantidad negativa");
        }
        if (estado()< cantidad)
        {
        	throw new Exception ("No tienes ese dinero disponible");
        }
        
        saldo = saldo - cantidad;
 
    }
}



    
    
    
    
    
    
    
    
    
   
    
    
    
    
 