package practica1;

public class Proceso {
	public void ejecutarProceso(String ruta) {
		ProcessBuilder pb;

		try {
			pb = new ProcessBuilder(ruta);
			pb.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		String ruta = "C:\\Users\\rmoreno1202\\eclipse_workspace_PSP\\practica1\\bin\\ej01";
		Proceso p = new Proceso();
		p.ejecutarProceso(ruta);
		System.out.println("Finalizado");
	}
}
