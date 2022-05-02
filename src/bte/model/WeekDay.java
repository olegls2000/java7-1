package bte.model;

public enum WeekDay {
    SUNDAY(true, "Sunday"),
    MONDAY(false, "Monday"),
    TUESDAY(false, "Tuesday");
    private final boolean isHoliday;
    private final String name;

    public boolean isHoliday() {
        return isHoliday;
    }

    public String getName() {
        return name;
    }

    WeekDay(boolean isHoliday, String name) {
        this.isHoliday = isHoliday;
        this.name = name;
    }

}
