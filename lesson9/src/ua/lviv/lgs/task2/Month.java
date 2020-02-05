package ua.lviv.lgs.task2;

/**
 * @since java 1.8
 * @author Sonia Glushchak
 * @version 1.1
 */
public enum Month {
    DECEMBER(31, Seasons.WINTER), JANUARY(31, Seasons.WINTER), FEBRUARY(28, Seasons.WINTER),
    MARCH(31, Seasons.SPRING), APRIL(30, Seasons.SPRING), MAY(31, Seasons.SPRING), JUNE(30, Seasons.SUMMER),
    JULY(31, Seasons.SUMMER), AUGUST(30, Seasons.SUMMER), SEPTEMBER(30, Seasons.AUTUMN),
    OCTOBER(31, Seasons.AUTUMN), NOVEMBER(30, Seasons.AUTUMN);

    private int days;
    Seasons seasons;

    private Month(int days, Seasons seasons) {
        this.days = days;
        this.seasons = seasons;
    }

    public int getDays() {
        return days;
    }

    public Seasons getSeasons() {
        return seasons;
    }
}