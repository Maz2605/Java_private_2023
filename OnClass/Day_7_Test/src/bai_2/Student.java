package bai_2;

public class Student extends Person {
    private double score;

    public Student() {
    }

    public Student(String name, short age, Address address, double score) {
        super(name, age, address);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String getCapacity() {
        if (getScore() >= 9.0)
            return "Giỏi";
        if (8.0 <= getScore() && getScore() < 9.0)
            return "Giỏi";
        if (6.5 <= getScore() && getScore() < 8)
            return "Khá";
        if (getScore() < 6.5)
            return "Trung bình yếu";
        return "Không hợp lệ ";
    }

    @Override
    public String toString() {
        return  super.toString()+
                "score=" + score +
                "Capacity= "+getCapacity();
    }
}

