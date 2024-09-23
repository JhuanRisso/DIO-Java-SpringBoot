package Desafios.Bootcamp;

public class Courses extends Contents{

    private int workLoad;

    @Override
    public double calculateXp() {
        return DefaultXp * workLoad;
    }

    public int getWorkLoad() {
        return workLoad;
    }

    public void setWorkLoad(int workLoad) {
        this.workLoad = workLoad;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title= '" + getTitle() + '\'' +
                ", description= '" + getDescription() + '\'' +
                ", workLoad= " + workLoad +
                '}';
    }
}
