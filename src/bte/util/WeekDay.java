package bte.util;

public enum WeekDay {
    SUNDAY(true, "Sunday"),
    MONDAY(false, "Monday"),
    TUESDAY(false, "Tuesday"),
    WEDNESDAY(false, "Wednesday"),
    THURSDAY(false, "Thursday"),
    FRIDAY(false, "Friday");


    private boolean isHoliday;
    private String name;

    WeekDay(boolean isHoliday, String name) {
        this.isHoliday = isHoliday;
        this.name = name;
    }

    public boolean isHoliday() {
        return isHoliday;
    }

    public String getName() {
        return name;
    }

    public void setHoliday(boolean holiday) {
        isHoliday = holiday;
    }

    public void setName(String name) {
        this.name = name;
    }
}
