
public class Student{
    
    private String name, ic, address, year, schoolname;
    private float[] Scores = new float[5]; //have to remember this one
    //dynamic array
    //private ArrayList<Double> scores = new ArrayList<Double>();

    public Student(){}
    public Student(String name, String ic, String address, String year, String schoolname) {
        this.name = name;
        this.ic = ic;
        this.address = address;
        this.year = year;
        this.schoolname = schoolname;
    }

    
    //getters and setters (special one for score array later)

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIc() {
        return ic;
    }
    public void setIc(String ic) {
        this.ic = ic;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getSchoolname() {
        return schoolname;
    }
    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }
    public float[] getScores() {
        return Scores;
    }
    public void setScores(float scores, int index) {
        Scores[index] = scores;
    }

    float calcAverage(){ //average marks per student
        float sum = 0, average = 0;
        for (int i = 0; i < 5; i++){
            sum += Scores[i];
        }
        average = sum/5;
        return average;
    }

}
