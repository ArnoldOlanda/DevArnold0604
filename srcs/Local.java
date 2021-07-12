public class Local implements Comparable<Local> {
    private Direccion direccion;
    private String nombre;
    private Inventario almacen;
    private  ListLinked<PersonalSalud> personal;
    private GestionPacientes gp;
    
	public Local(Direccion d,String nombre){
    	gp= new GestionPacientes();
        this.direccion = d;
      
    public  int getPersonalTotal() {
        return personal.getCount();
    }
    public int validarPersonal(PersonalSalud p){
            return personal.search(p);
    }
    public GestionPacientes getGestionPacientes() {
		return gp;
	}
	@Override
	public String toString() {
		return "Direccion: " + direccion + ", nombre: " + nombre;
	}
    
}
