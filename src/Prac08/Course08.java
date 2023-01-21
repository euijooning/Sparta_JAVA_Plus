package Prac08;

public class Course08 {
    private String title;
    private String tutor;
    private int days;


    // 기본생성자
    public Course08(){}

    // 생성자
    public Course08(String title, String tutor, int days) {
        this.title =title;
        this.tutor =tutor;
        this.days =days;
    }

    //Setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
    public void setDays(int days) {
        this.days = days;
    }

    // Getter
    public String getTitle() {
        return this.title = title;
    }

    public String getTutor() {
        return this.tutor = tutor;
    }

    public int getDays() {
        return this.days = days;
    }

}

