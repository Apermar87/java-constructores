public class Agenda {
    private String lunes, martes, miercoles, jueves, viernes;

    // Constructor por defecto inicializado a 0
    public Agenda() {
        lunes = "0";
        martes = "0";
        miercoles = "0";
        jueves = "0";
        viernes = "0";
    }

    // Constructor por parámetros
    public Agenda(String lunes, String martes, String miercoles, String jueves, String viernes) {
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
    }

    // Constructor de copia
    public Agenda(Agenda copia) {
        lunes = copia.lunes;
        martes = copia.martes;
        miercoles = copia.miercoles;
        jueves = copia.jueves;
        viernes = copia.viernes;
    }

    // Getters y Setters
    public String getLunes() {
        return lunes;
    }

    public void setLunes(String lunes) {
        this.lunes = lunes;
    }

    public String getMartes() {
        return martes;
    }

    public void setMartes(String martes) {
        this.martes = martes;
    }

    public String getMiercoles() {
        return miercoles;
    }

    public void setMiercoles(String miercoles) {
        this.miercoles = miercoles;
    }

    public String getJueves() {
        return jueves;
    }

    public void setJueves(String jueves) {
        this.jueves = jueves;
    }

    public String getViernes() {
        return viernes;
    }

    public void setViernes(String viernes) {
        this.viernes = viernes;
    }

    public void mostrarDia(int dia) {
        
        switch (dia) {
            case 1:
                System.out.println(lunes);
                break;
            case 2:
                System.out.println(martes);
                break;
            case 3:
                System.out.println(miercoles);
                break;
            case 4:
                System.out.println(jueves);
                break;
            case 5:
                System.out.println(viernes);
                break;
            default:
                System.out.println("Día no valido");
                break;
        }
    }

}