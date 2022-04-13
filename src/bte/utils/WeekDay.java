package bte.utils;

public enum WeekDay {
    SUNDAY(true, "Sunday"),
    MONDAY(false, "Monday"),
    TUESDAY(false, "Tuesday"),
    WEDNESDAY(false, "Wednesday"),
    THURSDAY(false, "Thursday"),
    FRIDAY(false, "Friday");

    public boolean isHoliday;
    private String name;

    WeekDay(boolean isHoliday, String name) {
        this.isHoliday = isHoliday;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
