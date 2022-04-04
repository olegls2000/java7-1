package bte.model;

public enum WeekDay {
    SUNDAY(true, "Sunday"),
    MONDAY(false, "Monday"),
    TUESDAY(false, "Tuesday");
    public boolean isHoliday;
    public String name;
    WeekDay(boolean isHoliday, String name) {
        this.isHoliday = isHoliday;
        this.name = name;
    }

}
