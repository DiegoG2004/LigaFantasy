package classes;

public class TablaDispersa {

	static final int TAMTABLA= 21;
	public int numElementos;
	private double factorCarga;
	private Equipo[] tabla;
	
	public TablaDispersa()
	{
		tabla=new Equipo[TAMTABLA];
		for(int i=0; i<TAMTABLA;i++)
		{
			tabla[i]=null;
		}
		numElementos=0;
		factorCarga=0;
	}
	
	public int hash(String clave)
	{
		int i=0,p;
		long d;
		d=transformaCadena(clave);
		
		p=(int)(d%TAMTABLA);
		
		while(tabla[p]!=null && !tabla[p].getCodigo().equals(clave))
		{
			i++;
			p=p+i*i;
			p=p%TAMTABLA;
		}
		return p;
	}

	private long transformaCadena(String clave) {
		long d=0;
		 for(int j=0;j<Math.min(10, clave.length());j++)
		 {
			 d=d*29+(int)clave.charAt(j);
		 }
		 
		 if(d<0) d=-d;
		return d;
	}
	
	public void insertar(Equipo r)
	{
		int posicion=hash(r.getCodigo());
		
		if (buscar(r.getCodigo())==r && tabla[posicion].esAlta ==true)
		{
			System.err.println("Ese equipo ya ha sido insertado");
			return;
		}
		tabla[posicion]=r;
		numElementos++;
		factorCarga=(double)(numElementos)/TAMTABLA;
		if(factorCarga>0.8) 
		System.out.println("\n#### EL FACTOR DE CARGA SUPERA EL 80%, conviene aumentar el tamanyo");
		
	}
	
	public Equipo buscar(String clave)
	{
		
		int posicion=hash(clave);
		Equipo pr=tabla[posicion];
		return pr;
	}

	public void eliminar(String clave)
	{
		int posicion=hash(clave);
		if(tabla[posicion]!=null)
		tabla[posicion].esAlta=false;
		
	}
}