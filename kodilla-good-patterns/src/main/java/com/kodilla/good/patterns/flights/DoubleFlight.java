package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class DoubleFlight {
    private String from;
    private String through;
    private String to;

    public DoubleFlight(String from, String through, String to) {
        this.from = from;
        this.through = through;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public String getThrough() {
        return through;
    }

    public String getTo() {
        return to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DoubleFlight that = (DoubleFlight) o;
        return Objects.equals(from, that.from) &&
                Objects.equals(through, that.through) &&
                Objects.equals(to, that.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, through, to);
    }

    @Override
    public String toString() {
        return "Flight from " + this.from + " through " + this.through + " to " + this.to;
    }
}
