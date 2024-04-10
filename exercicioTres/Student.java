package exercicioTres;

public class Student {

    public String name;
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;
    public String status;

    public double finalGrade(){
        return firstGrade + secondGrade + thirdGrade;
    }

    public String status(){
        if (finalGrade() >= 60.00){
            return this.status = "\nPASS";
        }
        else{
             return this.status = "\nFAILED\n" +
                    "MISSING " + String.format("%.2f", 60.00 - finalGrade()) + " POINTS";
        }
    }

    public String toString(){
        return "FINAL GRADE = " +
                String.format("%.2f", finalGrade())
                + status();
    }
}
