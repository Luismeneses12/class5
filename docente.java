public class docente extends  personal{
    public  int Idtrabajor ;
    public  double salario ;
    public  String departamento ;

    public docente(){}

    public docente(String nombre, int edad, String sexo, int idtrabajor, double salario, String departamento) {
        super(nombre, edad, sexo);
        Idtrabajor = idtrabajor;
        this.salario = salario;
        this.departamento = departamento;
    }

    public int getIdtrabajor() {
        return Idtrabajor;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setIdtrabajor(int idtrabajor) {
        Idtrabajor = idtrabajor;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
