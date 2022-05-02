package bte.util;

public enum WeekDay {
    SUNDAY(true, "Sunday"),
    MONDAY(false, "Monday"),
    TUESDAY(false, "Tuesday"),
    WEDNESDAY(false, "Wednesday"),
    THURSDAY(false, "Thursday"),
    FRIDAY(false, "Friday");

    public boolean isHoliday;
    public String name;

    WeekDay(boolean isHoliday, String name) {
        this.isHoliday = isHoliday;
        this.name = name;
    }
}
