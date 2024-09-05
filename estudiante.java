public class estudiante extends  personal {
    public  int matricula ;
    public  double promedio ;
    public String  licenciatura ;


    public  estudiante(){}

    public estudiante(String nombre, int edad, String sexo, double promedio, int matricula, String licenciatura) {
        super(nombre, edad, sexo);
        this.promedio = promedio;
        this.matricula = matricula;
        this.licenciatura = licenciatura;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getPromedio() {
        return promedio;
    }

    public String getLicenciatura() {
        return licenciatura;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void setLicenciatura(String licenciatura) {
        this.licenciatura = licenciatura;
    }
}
