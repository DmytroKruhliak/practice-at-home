package enuM;

enum Day {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THUESDAY,
    FRIDAY,
    SUTERDAY,
    SUNDAY
}

enum Type {
    SCIENCE(12),
    BELLETRE(34),
    PHANTASY(43),
    SCIENCE_FICTION(43);

    private int startAge;
    Type(int startAge){
        this.startAge = startAge;
    }
    public int getStartAge() {return startAge;}

}
